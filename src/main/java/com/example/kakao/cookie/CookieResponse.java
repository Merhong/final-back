package com.example.kakao.cookie;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class CookieResponse {
    @Getter
    @Setter
    @ToString
    public static class PurchaseResDTO{
        private Integer nowCookieAmount;

        public PurchaseResDTO(Integer nowCookieAmount) {
            this.nowCookieAmount = nowCookieAmount;
        }
    }
    @Getter
    @Setter
    @ToString
    public static class PurchaseHistoryDTO {
        private int purchasedCookie;
        private int nowCookieAmount;
        private int price;
        private String createdAt;

        public PurchaseHistoryDTO() {
            this.purchasedCookie = purchasedCookie;
            this.nowCookieAmount = nowCookieAmount;
            this.price = price;
            this.createdAt = createdAt;
        }
    }
}