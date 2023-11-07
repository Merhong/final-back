package com.example.kakao.cookie;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.kakao._core.errors.exception.Exception500;
import com.example.kakao._entity.enums.PaymentHistory;
import com.example.kakao._repository.PaymentHistoryRepository;
import com.example.kakao.user.UserJPARepository;

@Transactional
@Service
public class CookieService {

    private UserJPARepository userRepository;
    private PaymentHistoryRepository paymentHistoryRepository;

    @Transactional
    public void payment(CookieRequest.paymentReqDTO dto){
    try {
        userRepository.updateCookie(dto.getUserId(), dto.getCookieAmount());
    } catch (Exception e) {
        throw new Exception500("레파지토리 호출 또는 업뎃 실패");
    }
    }

    public void paymentHistory(CookieRequest.paymentReqDTO dto){
        try {
            PaymentHistory paymentHistory = PaymentHistory.

            paymentHistoryRepository.save(paymentHistory);
        } catch (Exception e) {
            throw new Exception500("DB 인서트 실패");
        }
    }
}
