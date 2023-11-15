package com.example.kakao.cookie;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

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
    public static class PurchaseHistoryListDTO{
        List<PurchaseHistoryDTO> dtoList;

        public PurchaseHistoryListDTO(List<CookieHistory> cookieHistoryList) {
            this.dtoList = cookieHistoryList.stream().map(e -> new PurchaseHistoryDTO(e)).collect(Collectors.toList());
        }
    }
    @Getter
    @Setter
    @ToString
    public static class PurchaseHistoryDTO {
        private int purchasedCookie;
        private int nowCookieAmount;
        private int price;
        private Timestamp createdAt;

        public PurchaseHistoryDTO(CookieHistory historyList) {
            this.purchasedCookie = historyList.getPurchasedCookie();
            this.nowCookieAmount = historyList.getNowCookieAmount();
            this.price = historyList.getPrice();
            this.createdAt = historyList.getCreatedAt();
        }
    }
}