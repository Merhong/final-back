package com.example.kakao.cookie;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "purchase_history_tb")
public class CookieHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer userId;
    private Integer purchasedCookie;
    private Integer nowCookieAmount;
    private Integer price;
    @CreationTimestamp
    private Timestamp createdAt;

    @Builder
    public CookieHistory(Integer id, Integer userId, Integer purchasedCookie, Integer nowCookieAmount, Integer price, Timestamp createdAt) {
        this.id = id;
        this.userId = userId;
        this.purchasedCookie = purchasedCookie;
        this.nowCookieAmount = nowCookieAmount;
        this.price = price;
        this.createdAt = createdAt;
    }
}
