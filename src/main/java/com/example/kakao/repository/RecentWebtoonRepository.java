package com.example.kakao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kakao.entity.RecentWebtoon;

import java.util.Optional;
import java.util.List;

public interface RecentWebtoonRepository extends JpaRepository<RecentWebtoon, Integer> {

    List<RecentWebtoon> findByUserIdAndWebtoonId(int userId, int webtoonId);

}
