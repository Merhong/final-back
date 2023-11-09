package com.example.kakao.payment;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@ToString
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "payment_history_tb")
public class PaymentHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private int purchasedCookie;
    private int nowCookieAmount;
    private int price;
    @CreationTimestamp
    private Timestamp createdAt;

    @Builder
    public PaymentHistory(int id, int userId, int purchasedCookie, int nowCookieAmount, int price,
            Timestamp createdAt) {
        this.id = id;
        this.userId = userId;
        this.purchasedCookie = purchasedCookie;
        this.nowCookieAmount = nowCookieAmount;
        this.price = price;
        this.createdAt = createdAt;
    }

    

    
}
