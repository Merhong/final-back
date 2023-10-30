package com.example.kakao.repository;

import com.example.kakao.entity.LikeReComment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeReCommentRepository extends JpaRepository<LikeReComment, Integer> {

    List<LikeReComment> findByUserIdAndReCommentId(int userId, int reCommentId);

}
