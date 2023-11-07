package com.example.kakao._repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kakao._entity.LikeEpisode;

import java.util.List;

public interface LikeEpisodeRepository extends JpaRepository<LikeEpisode, Integer> {

    List<LikeEpisode> findByUserIdAndEpisodeId(int userId, int episodeId);

}
