package com.example.kakao.payment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PaymentHistoryRepository extends JpaRepository<PaymentHistory, Integer> {

    List<PaymentHistory> findByUserId(int userId);
    
}
