package com.example.kakao.comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface CommentJPARepository extends JpaRepository<Comment, Integer> {


    List<Comment> findByEpisodeId(int episodeId);

    List<Comment> findByEpisodeId(int episodeId, Sort sort);

}
