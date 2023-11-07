package com.example.kakao.cookie;

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

    @Transactional
    public void payment(CookieRequest.paymentReqDTO dto){
    try {
        System.out.println("repo전 : "+ dto.getUserId());
        System.out.println("repo전 : "+ dto.getCookieAmount());
        userRepository.updateCookie(dto.getUserId(), dto.getCookieAmount());

    } catch (Exception e) {
        throw new Exception500("레파지토리 호출 또는 업뎃 실패");
    }
    
        
        

    }
}
