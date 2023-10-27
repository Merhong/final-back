package com.example.kakao.webtoon;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.example.kakao.entity.enums.WebtoonSpeciallyEnum;


public interface WebtoonRepository extends JpaRepository<Webtoon, Integer> {
  List<Webtoon> findByWebtoonSpeciallyEnum(WebtoonSpeciallyEnum webtoonSpeciallyEnum);



}
