package com.example.kakao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;


import com.example.kakao.entity.InterestWebtoon;

public interface InterestWebtoonRepository extends JpaRepository<InterestWebtoon, Integer> {

    List<InterestWebtoon> findByUserIdAndWebtoonId(int userId, int webtoonId);

}
