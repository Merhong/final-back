package com.example.kakao._repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kakao._entity.InterestWebtoon;

import org.springframework.data.domain.Sort;

import java.util.List;

public interface InterestWebtoonRepository extends JpaRepository<InterestWebtoon, Integer> {

    List<InterestWebtoon> findByUserIdAndWebtoonId(int userId, int webtoonId);

    List<InterestWebtoon> findByUserId(int userId);

    List<InterestWebtoon> findByUserId(int userId, Sort sort);

    

}
