package com.example.kakao._repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kakao._entity.EpisodePhoto;

import java.util.List;

public interface EpisodePhotoRepository extends JpaRepository<EpisodePhoto, Integer> {

}
