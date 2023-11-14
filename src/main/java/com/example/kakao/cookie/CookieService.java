package com.example.kakao.cookie;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.kakao._core.errors.exception.Exception500;
import com.example.kakao.user.UserJPARepository;

@Transactional
@Service
public class CookieService {

    @Autowired
    private UserJPARepository userRepository;
    @Autowired
    private CookieHistoryRepository cookieHistoryRepository;

    @Transactional
    public void payment(CookieRequest.paymentReqDTO dto) {
        try {
            System.out.println("repo전 : " + dto.getUserId());
            System.out.println("repo전 : " + dto.getCookieAmount());
            userRepository.updateCookie(dto.getUserId(), dto.getCookieAmount());

        } catch (Exception e) {
            throw new Exception500("레파지토리 호출 또는 업뎃 실패");
        }
    }

    @Transactional
    public CookieResponse.PurchaseResDTO createHistory(CookieRequest.paymentReqDTO dto) {
        try {
            CookieHistory cookieHistory = CookieHistory.builder()
                    .purchasedCookie(dto.getCookieAmount())
                    .nowCookieAmount(dto.getCookieAmount())
                    .price(dto.getCookieAmount()*12)
                    .userId(dto.getUserId())
                    .build();

            cookieHistoryRepository.save(cookieHistory);

            CookieResponse.PurchaseResDTO purchaseResDTO = new CookieResponse.PurchaseResDTO(cookieHistory.getNowCookieAmount());

            return purchaseResDTO;
        } catch (Exception e) {
         throw new Exception500(" 쿠키서비스에서 터짐");

        }
    }
}