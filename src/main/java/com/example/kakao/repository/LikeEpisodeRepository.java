package com.example.kakao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;

import com.example.kakao.entity.LikeEpisode;

public interface LikeEpisodeRepository extends JpaRepository<LikeEpisode, Integer> {

    List<LikeEpisode> findByUserIdAndEpisodeId(int userId, int episodeId);

}
