package com.example.kakao._repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.kakao._entity.RecentWebtoon;

import java.util.List;

public interface RecentWebtoonRepository extends JpaRepository<RecentWebtoon, Integer> {

    List<RecentWebtoon> findByUserIdAndWebtoonId(int userId, int webtoonId);

    // @Query(value = " SELECT * FROM recent_webtoon_tb " +
    // " WHERE user_id = :userId ORDER BY updated_at DESC ", nativeQuery = true)
    // List<RecentWebtoon> findByUserIdSort(@Param("userId") int userId);

    List<RecentWebtoon> findByUserId(int userId);

    List<RecentWebtoon> findByUserIdAndEpisodeId(int userId, int episodeId);

}
