package com.example.kakao.repository;

import com.example.kakao.entity.InterestWebtoon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InterestWebtoonRepository extends JpaRepository<InterestWebtoon, Integer> {

    List<InterestWebtoon> findByUserIdAndWebtoonId(int userId, int webtoonId);

    List<InterestWebtoon> findByUserId(int userId);

    

}
