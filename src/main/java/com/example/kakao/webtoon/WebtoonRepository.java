package com.example.kakao.webtoon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.kakao._entity.enums.WebtoonSpeciallyEnum;

import java.util.List;
import java.util.Optional;


public interface WebtoonRepository extends JpaRepository<Webtoon, Integer> {

    List<Webtoon> findByWebtoonSpeciallyEnum(WebtoonSpeciallyEnum webtoonSpeciallyEnum);

    List<Webtoon> findByTitleContaining(String title);

    List<Webtoon> findByTitle(String title);

    
    // 검색어가 제목에 포함되거나, 작가의 별명에 포함되는 웹툰 찾기
    @Query(value = " SELECT DISTINCT webtoon_tb.* " +
    " FROM webtoon_tb " +
    " LEFT JOIN webtoon_author_tb ON webtoon_tb.id = webtoon_author_tb.webtoon_id " +
    " LEFT JOIN author_tb ON author_tb.id = webtoon_author_tb.author_id " +
    " WHERE webtoon_tb.title LIKE %:title% OR author_tb.author_nickname LIKE %:author_nickname% ", nativeQuery = true)
    List<Webtoon> findByWebtoonByTitleAndAuthorNickname(@Param("title") String title, @Param("author_nickname") String author_nickname);

}
