package com.example.kakao._entity.enums;

import org.hibernate.annotations.CreationTimestamp;

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
@Table(name = "paymentHistory_tb")
public class PaymentHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private int cookieAmount;
    private int price;
    @CreationTimestamp
    private Timestamp createdAt;
}
