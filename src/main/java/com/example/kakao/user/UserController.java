package com.example.kakao.user;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.kakao._core.errors.exception.Exception404;
import com.example.kakao._core.errors.exception.Exception500;
import com.example.kakao._core.utils.ApiUtils;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;
    private final HttpSession session;

    // 회원가입
    @PostMapping("/join")
    public ResponseEntity<?> join(@RequestBody @Valid UserRequest.JoinDTO requestDTO, Errors errors) {
        userService.join(requestDTO);
        return ResponseEntity.ok().body(ApiUtils.success(null));
    }

    // 로그인
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid UserRequest.LoginDTO requestDTO, Errors errors) {
        UserResponse.loginResponseDTO responseDTO = userService.login(requestDTO);
        return ResponseEntity.ok().header("Authorization", "Bearer "+responseDTO.getJwt()).body(ApiUtils.success(responseDTO));
    }

    // 업데이트 // 쿠키추가
    @PutMapping("/user")
    public ResponseEntity<?> update(@RequestBody @Valid UserRequest.updateDTO requestDTO, Errors errors) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        
        UserResponse.updateResponseDTO responseDTO = userService.update(requestDTO, sessionUser);
        
        
        System.out.println(responseDTO);
        
        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }
 
    // JWT는 로그아웃 할 때 서버로 요청할 필요가 없음.(어짜피 스테스리스로 서버에 정보가 없으니까)
    // 로그아웃
    // @GetMapping("/logout")
    // public ResponseEntity<?> logout(){
    //     session.invalidate();
    //     return ResponseEntity.ok().body(ApiUtils.success(null));
    // }

    
    
}
