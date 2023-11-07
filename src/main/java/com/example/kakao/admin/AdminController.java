package com.example.kakao.admin;

import com.example.kakao._core.utils.ApiUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    @GetMapping("/adminJoinForm")
    public String adminJoinForm() {
        return "adminJoinForm";
    }

    @PostMapping("/joinadmin")
    public ResponseEntity<?> joinAdmin(@Valid AdminRequest.JoinDTO requestDTO, Errors errors) {
        adminService.joinAdmin(requestDTO);
        return ResponseEntity.ok().body(ApiUtils.success(null));
    }
}
