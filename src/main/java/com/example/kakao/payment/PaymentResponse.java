package com.example.kakao.payment;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

import java.text.SimpleDateFormat;
import java.util.*;

public class PaymentResponse {

    @Getter
    @Setter
    @ToString
    public static class PaymentHistoryResDTO{
        private int purchasedCookie;
        private int nowCookieAmount;
        private int price;
        private String createdAt;


        public PaymentHistoryResDTO(PaymentHistory history) {
            this.purchasedCookie = history.getPurchasedCookie();
            this.nowCookieAmount = history.getNowCookieAmount();
            this.price = history.getPrice();
            //날짜포맷 수정
            Date date = new Date(history.getCreatedAt().getTime());
            // SimpleDateFormat을 사용하여 날짜 포맷 지정
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 원하는 날짜 형식을 지정
            this.createdAt = sdf.format(date); // 날짜를 문자열로 변환하여 저장
        }
        

        
    }
}
