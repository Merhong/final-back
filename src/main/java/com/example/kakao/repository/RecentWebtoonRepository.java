package com.example.kakao.repository;

import com.example.kakao.entity.RecentWebtoon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecentWebtoonRepository extends JpaRepository<RecentWebtoon, Integer> {

    List<RecentWebtoon> findByUserIdAndWebtoonId(int userId, int webtoonId);

}
