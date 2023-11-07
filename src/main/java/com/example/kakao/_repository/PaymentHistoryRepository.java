package com.example.kakao._repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kakao._entity.enums.PaymentHistory;

public interface PaymentHistoryRepository extends JpaRepository<PaymentHistory, Integer> {
    
    
}
