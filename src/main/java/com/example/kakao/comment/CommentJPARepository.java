package com.example.kakao.comment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentJPARepository extends JpaRepository<Comment, Integer> {


    List<Comment> findByEpisodeId(int episodeId);

}
