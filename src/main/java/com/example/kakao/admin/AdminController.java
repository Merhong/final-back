package com.example.kakao.admin;

import com.example.kakao._core.utils.ApiUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RequiredArgsConstructor
@Controller
public class AdminController {

    @Autowired
    private final AdminService adminService;
    private final HttpSession session;


    // mustache admin 홈페이지
    @GetMapping({"/admin"})
    public String index() {
        return "index";
    }

    @GetMapping("/error401")
    public String error401() {
        return "401";
    }

    @GetMapping("/error404")
    public String error404() {
        return "404";
    }

    @GetMapping("/error500")
    public String error500() {
        return "500";
    }

    @GetMapping("/adminLoginForm")
    public String adminLoginForm() {
        return "adminLoginForm";
    }

    @GetMapping("/adminJoinForm")
    public String adminJoinForm() {
        return "adminJoinForm";
    }


    // 관리자 로그아웃
    @GetMapping("/logout")
    public String logout(){
        if (session != null) {
            session.invalidate();
        }
        return "redirect:/";
    }

    // 관리자 로그인
    @PostMapping("/loginAdmin")
    public String loginAdmin(@Valid AdminRequest.LoginDTO requestDTO, Errors errors) {
        adminService.loginAdmin(requestDTO);
        // json 데이터 확인할려면 responseDTO로 리턴
        // AdminResponse.loginResponseDTO responseDTO = adminService.loginAdmin(requestDTO);
        return "index";
    }

    // 관리자 계정 생성
    @PostMapping("/joinAdmin")
    public String joinAdmin(@Valid AdminRequest.JoinDTO requestDTO, Errors errors) {
        adminService.joinAdmin(requestDTO);
        // json데이터 확인용
        // return ResponseEntity.ok().body(ApiUtils.success(null));
        return "adminLoginForm";
    }

}
