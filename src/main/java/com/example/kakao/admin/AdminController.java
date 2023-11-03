package com.example.kakao.admin;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.h2.engine.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.kakao._core.utils.ApiUtils;
import com.example.kakao.admin.AdminResponse.adminLoginResponseDTO;
import com.example.kakao.user.User;
import com.example.kakao.user.UserRequest;
import com.example.kakao.user.UserResponse;


@RequiredArgsConstructor
@Controller
public class AdminController {

    @Autowired
    private final AdminService adminService;
    private final HttpSession session;
    
    @GetMapping("/admin")
    public String admin() {
       
        return "admin/admin";
    }

    @PostMapping("/admin/login")
    public String adminLogin(AdminRequest.AdminLoginRequestDTO adminLoginRequestDTO, Model model) {
        adminLoginResponseDTO adminLoginResponseDTO = adminService.adminLogin(adminLoginRequestDTO);

        
        User user = (User) session.getAttribute("sessionUser");
        model.addAttribute("sessionUser", user);

        return "admin/adminWebtoon";
    }

    @GetMapping("/admin/adminAuthorManaging")
    public String adminAuthorManaging() {
        return "admin/adminAuthorManaging";
    }
    
    
}
