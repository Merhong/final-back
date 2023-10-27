package com.example.kakao.repository;

import com.example.kakao.entity.LikeEpisode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeEpisodeRepository extends JpaRepository<LikeEpisode, Integer> {

    List<LikeEpisode> findByUserIdAndEpisodeId(int userId, int episodeId);

}
