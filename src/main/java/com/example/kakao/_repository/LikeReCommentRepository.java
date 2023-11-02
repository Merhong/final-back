package com.example.kakao._repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kakao._entity.LikeReComment;

import java.util.List;

public interface LikeReCommentRepository extends JpaRepository<LikeReComment, Integer> {

    List<LikeReComment> findByUserIdAndReCommentId(int userId, int reCommentId);

}
