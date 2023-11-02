package com.example.kakao._repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kakao._entity.RecentWebtoon;

import java.util.List;

public interface RecentWebtoonRepository extends JpaRepository<RecentWebtoon, Integer> {

    List<RecentWebtoon> findByUserIdAndWebtoonId(int userId, int webtoonId);

}
