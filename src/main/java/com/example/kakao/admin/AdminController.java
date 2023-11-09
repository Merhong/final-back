package com.example.kakao.admin;

import com.example.kakao._core.errors.exception.Exception400;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RequiredArgsConstructor
@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private final HttpSession session;

    // mustache admin 홈페이지
    @GetMapping({"/admin"})
    public String index() {
        return "index";
    }

    @GetMapping("/error/401")
    public String error401() {
        return "error/401";
    }

    @GetMapping("/error/404")
    public String error404() {
        return "error/404";
    }

    @GetMapping("/error/500")
    public String error500() {
        return "error/500";
    }

    @GetMapping("/adminLoginForm")
    public String adminLoginForm() {
        return "adminLoginForm";
    }

    @GetMapping("/adminJoinForm")
    public String adminJoinForm() {
        return "adminJoinForm";
    }


    // 로그아웃
    // 브라우저 GET /logout 요청을 함(request 1)
    // 서버는 / 주소를 응답의 헤더에 담음(Location) 상태코드 302 응답
    // 브라우저는 GET / 로 재요청을 함.(request 2)
    // index 페이지 응답받고 렌더링함.
    @GetMapping("/logout")
    public String logout(HttpServletResponse response) {
        // 서버쪽 세션 무효화(삭제), 브라우저의 jSessionID는 남아있음.
        session.invalidate();

        return "redirect:/";
    }

    // 관리자 로그인
    @PostMapping("/loginAdmin")
    public String loginAdmin(AdminRequest.LoginDTO requestDTO) {
        // 유효성 검사
        if(requestDTO.getEmail() == null || requestDTO.getEmail().isEmpty()) {
            return "error/404";
        }
        if (requestDTO.getPassword() == null || requestDTO.getPassword().isEmpty()) {
            return "error/404";
        }

        try {
            // 핵심 로직
            // 로그인 메서드 호출하여 로그인
            System.out.println("로그인 서비스 ㅈㅈㅈㅈㅈㅈ");
            AdminResponse.loginResponseDTO sessionUser = adminService.loginAdmin(requestDTO);
            System.out.println("로그인 서비스 ㅎㅎㅎㅎㅎㅎ");

            // 로그인 성공시 session에 sessionUser 정보를 담는다.
            System.out.println("세션 담기 ㅈㅈㅈㅈㅈㅈㅈ");
            session.setAttribute("sessionUser", sessionUser);
            System.out.println("세션 담기 완료!!!");

            // 로그인 후 홈페이지로 리다이렉트
            return "redirect:/admin";

        } catch (Exception e){
            return "redirect:/adminLoginForm";
        }
    }

    // 관리자 계정 생성
    @PostMapping("/joinAdmin")
    public String joinAdmin(@Valid AdminRequest.JoinDTO requestDTO) {
        /* 유효성 검사(Validation Check)
        null 입력 값을 제거한다.
        정상 접근은 절대 이 조건문을 못 탄다.
        공격자들이 이 조건문을 타게 됨.(PostMan 사용 같은것)
        따라서 친절하게 리턴 해줄 필요가 없음. 여기선 Error 페이지로 리턴
        */
        // TODO : 유효성 검사시 DTO에 맞게 수정필요
        // if (joinDTO.getUsername() == null || joinDTO.getUsername().isEmpty()) {
        //     return "redirect:/40x";
        // }
        // if (joinDTO.getPassword() == null || joinDTO.getPassword().isEmpty()) {
        //     return "redirect:/40x";
        // }
        // if (joinDTO.getEmail() == null || joinDTO.getEmail().isEmpty()) {
        //     return "redirect:/40x";
        // }

        // MVC 패턴의 M(Model)
        // DB에 해당 username이 있는지 체크해보기
        // username이 있다? username이 중복됐을때 걸러짐
        // User user = userRepository.findByUsername(joinDTO.getUsername());
        // if (user != null) {
        //     return "redirect:/50x";
        // }

        adminService.joinAdmin(requestDTO);
        // json데이터 확인용
        // return ResponseEntity.ok().body(ApiUtils.success(null));
        return "adminLoginForm";
    }

}
