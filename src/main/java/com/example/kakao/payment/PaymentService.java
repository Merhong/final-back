package com.example.kakao.payment;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.kakao._core.errors.exception.Exception500;
import com.example.kakao.payment.PaymentResponse.PaymentHistoryResDTO;
import com.example.kakao.user.User;
import com.example.kakao.user.UserJPARepository;

@Transactional
@Service
public class PaymentService {

    private UserJPARepository userRepository;
    @Autowired
    private PaymentHistoryRepository paymentHistoryRepository;


    @Transactional
    public void payment(PaymentRequest.paymentReqDTO dto){
            try {
                userRepository.updateCookie(dto.getUserId(), dto.getCookieAmount());
            } catch (Exception e) {
                throw new Exception500("레파지토리 호출 또는 업뎃 실패");
            }
    }

    public void createPaymentHistory(PaymentRequest.paymentReqDTO dto){
        try {
            User user = userRepository.findById(dto.getUserId()).get();
            PaymentHistory paymentHistory = PaymentHistory.builder()
                                            .purchasedCookie(dto.getCookieAmount())
                                            .nowCookieAmount(user.getCookie())
                                            .price(dto.getCookieAmount()*12)
                                            .userId(dto.getUserId())
                                            .build();
            paymentHistoryRepository.save(paymentHistory);
        } catch (Exception e) {
            throw new Exception500("히스토리 DB 인서트 실패");
        }
    }

    public List<PaymentHistoryResDTO> readHistory(int userId) {
        try {
            System.out.println("서비스111111111");
            List<PaymentHistory> historyList = paymentHistoryRepository.findByUserId(userId);
            System.out.println("서비스2222222222");
            List<PaymentResponse.PaymentHistoryResDTO> dto = historyList.stream()
                                                            .map(e -> new PaymentResponse.PaymentHistoryResDTO(e))
                                                            .collect(Collectors.toList());
                                                            
            return dto;
        } catch (Exception e) {
            throw new Exception500("서비스에서 터짐");
        }
    }

}
