package com.example.kakao._repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kakao._entity.LikeComment;

import java.util.List;

public interface LikeCommentRepository extends JpaRepository<LikeComment, Integer> {

    List<LikeComment> findByUserIdAndCommentId(int userId, int commentId);

}
