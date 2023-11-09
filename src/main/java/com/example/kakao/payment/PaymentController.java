package com.example.kakao.payment;

import javax.servlet.http.HttpSession;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kakao._core.errors.exception.Exception500;
import com.example.kakao._core.utils.ApiUtils;
import com.example.kakao.user.User;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    private HttpSession session;

    @PostMapping("/payment/result")
    public ResponseEntity<?> payment(@RequestBody PaymentRequest.paymentReqDTO dto) {
        System.out.println("컨트롤러 때려지는지 확인");
        try {
            paymentService.payment(dto);
            paymentService.createPaymentHistory(dto);
            return ResponseEntity.ok().body(ApiUtils.success(null));
        } catch (Exception e) {
            return ResponseEntity.ok().body(ApiUtils.error("컨트롤러 내부에서 오류", null));
        }
    
    }

    @GetMapping("/payment/history")
    public ResponseEntity<?> paymentHistory() {
        try {
            User user = (User) session.getAttribute("sessionUser"); 
            List<PaymentResponse.PaymentHistoryResDTO> dto = paymentService.readHistory(user.getId());
            return ResponseEntity.ok().body(ApiUtils.success(dto));
        } catch (Exception e) {
            throw new Exception500("컨트롤러에서 터짐");
        }
    }
    
    
}
