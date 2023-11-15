package com.example.kakao.cookie;

import javax.servlet.http.HttpSession;

import com.example.kakao.user.User;
import com.google.api.Http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kakao._core.utils.ApiUtils;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.logging.Logger;


@RestController
public class CookieController {

    @Autowired
    private CookieService cookieService;
    @Autowired
    private HttpSession session;

    @PostMapping("/payment/result")
    public ResponseEntity<?> payment(@RequestBody CookieRequest.paymentReqDTO dto) {
        try {
            cookieService.payment(dto);
            CookieResponse.PurchaseResDTO resDTO = cookieService.createHistory(dto);
            return ResponseEntity.ok().body(ApiUtils.success(resDTO));
        } catch (Exception e) {
            return ResponseEntity.ok().body(ApiUtils.error("컨트롤러 내부에서 오류", null));
        }
    
    }

    @GetMapping("/payment/history")
    public ResponseEntity<?> paymentHistory() {
        try {
            System.out.println("11111111111");
            User user = (User) session.getAttribute("sessionUser");
            System.out.println(user);
            CookieResponse.PurchaseHistoryListDTO dto = cookieService.history(user.getId());
            return ResponseEntity.ok().body(ApiUtils.success(dto));
        } catch (Exception e) {
            return ResponseEntity.ok().body(ApiUtils.error(" 컨트롤러에서 터짐", null));
        }
    }
    
}
