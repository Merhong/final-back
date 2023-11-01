package com.example.kakao.webtoon;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kakao._entity.enums.WebtoonSpeciallyEnum;

import java.util.List;


public interface WebtoonRepository extends JpaRepository<Webtoon, Integer> {
    List<Webtoon> findByWebtoonSpeciallyEnum(WebtoonSpeciallyEnum webtoonSpeciallyEnum);


}
