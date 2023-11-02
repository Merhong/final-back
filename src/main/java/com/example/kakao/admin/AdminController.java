package com.example.kakao.admin;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.kakao._core.utils.ApiUtils;
import com.example.kakao.user.UserRequest;
import com.example.kakao.user.UserResponse;


@RequiredArgsConstructor
@Controller
public class AdminController {
    
    @GetMapping("/admin")
    public String admin() {
       
        return "admin";
    }

    @PostMapping("/admin/login")
    public String login() {
        UserResponse.loginResponseDTO responseDTO = userService.login(requestDTO);
        return ResponseEntity.ok().header("Authorization", "Bearer " + responseDTO.getJwt()).body(ApiUtils.success(responseDTO));
    }
    
}
