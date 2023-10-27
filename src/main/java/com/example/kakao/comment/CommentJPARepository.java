package com.example.kakao.comment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentJPARepository extends JpaRepository<Comment, Integer> {


    List<Comment> findByEpisodeId(int episodeId);

}
