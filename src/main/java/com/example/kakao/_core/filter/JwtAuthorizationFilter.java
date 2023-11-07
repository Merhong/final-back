package com.example.kakao._core.filter;

import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.kakao._core.errors.exception.Exception401;
import com.example.kakao._core.utils.JwtTokenUtils;
import com.example.kakao._entity.enums.UserTypeEnum;
import com.example.kakao.user.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * /carts/**
 * /orders/**
 * /products/**
 * 이 주소만 필터가 동작하면 된다
 * FilterConfig에서 설정
 */

public class JwtAuthorizationFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        String jwt = request.getHeader("Authorization");
        if (jwt == null || jwt.isEmpty()) {
            System.out.println("토큰없음");
            onError(response, "토큰이 없습니다");
            return;
        }

        try {
            DecodedJWT decodedJWT = JwtTokenUtils.verify(jwt);
            int userId = decodedJWT.getClaim("id").asInt();
            String email = decodedJWT.getClaim("email").asString();
            int cookie = decodedJWT.getClaim("cookie").asInt();
            String username = decodedJWT.getClaim("username").asString();
            String userTypeEnum = decodedJWT.getClaim("userTypeEnum").asString();

            // 컨트롤러에서 꺼내쓰기 쉽게하려고!!
            User sessionUser = User.builder().id(userId).email(email).cookie(cookie).username(username).build();

            sessionUser.setUserTypeEnum(UserTypeEnum.NORMAL);
            if (userTypeEnum.equals("AUTHOR")) {
                sessionUser.setUserTypeEnum(UserTypeEnum.AUTHOR);
            }
            if (userTypeEnum.equals("ADMIN")) {
                sessionUser.setUserTypeEnum(UserTypeEnum.ADMIN);
            }


            HttpSession session = request.getSession();
            session.setAttribute("sessionUser", sessionUser);

            chain.doFilter(request, response);
        } catch (SignatureVerificationException | JWTDecodeException e1) {
            System.out.println("토큰검증실패");
            onError(response, "토큰 검증 실패");
        } catch (TokenExpiredException e2) {
            System.out.println("토큰시간만료");
            onError(response, "토큰 시간 만료");
        }
    }

    // ExceptionHandler를 호출할 수 없다. 왜? Filter니까!! DS전에 작동하니까!!
    private void onError(HttpServletResponse response, String msg) {
        Exception401 e401 = new Exception401(msg);

        try {
            String body = new ObjectMapper().writeValueAsString(e401.body());
            response.setStatus(e401.status().value());
            // response.setHeader("Content-Type", "application/json; charset=utf-8");
            response.setContentType(MediaType.APPLICATION_JSON_VALUE);
            PrintWriter out = response.getWriter();
            out.println(body);
        } catch (Exception e) {
            System.out.println("파싱 에러가 날 수 없음");
        }
    }
}
