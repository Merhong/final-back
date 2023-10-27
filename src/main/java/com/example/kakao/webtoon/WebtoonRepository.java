package com.example.kakao.webtoon;

import com.example.kakao.entity.enums.WebtoonSpeciallyEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface WebtoonRepository extends JpaRepository<Webtoon, Integer> {
    List<Webtoon> findByWebtoonSpeciallyEnum(WebtoonSpeciallyEnum webtoonSpeciallyEnum);


}
