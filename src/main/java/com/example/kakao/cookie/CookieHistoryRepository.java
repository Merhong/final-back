package com.example.kakao.cookie;

import com.example.kakao.cookie.CookieHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CookieHistoryRepository extends JpaRepository<CookieHistory, Integer> {
}