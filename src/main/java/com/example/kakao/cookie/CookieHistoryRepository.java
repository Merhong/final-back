package com.example.kakao.cookie;

import com.example.kakao._entity.enums.PurchaseHistory;
import com.example.kakao.cookie.CookieHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CookieHistoryRepository extends JpaRepository<CookieHistory, Integer> {
    List<CookieHistory> findByUserId(int userId);
}