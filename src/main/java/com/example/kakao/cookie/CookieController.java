package com.example.kakao.cookie;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kakao._core.utils.ApiUtils;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.logging.Logger;


@RestController
public class CookieController {

    @Autowired
    private CookieService cookieService;

    @PostMapping("/payment/result")
    public ResponseEntity<?> payment(@RequestBody CookieRequest.paymentReqDTO dto) {
        try {
            cookieService.payment(dto);
            System.out.println("333333");
            return ResponseEntity.ok().body(ApiUtils.success(null));
        } catch (Exception e) {
            return ResponseEntity.ok().body(ApiUtils.error("컨트롤러 내부에서 오류", null));
        }
    
    }
    
}