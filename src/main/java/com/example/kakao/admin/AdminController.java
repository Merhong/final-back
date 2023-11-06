package com.example.kakao.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    // mustache admin 홈페이지
    @GetMapping({ "/admin"})
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


}
