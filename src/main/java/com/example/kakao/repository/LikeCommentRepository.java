package com.example.kakao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;

import com.example.kakao.entity.LikeComment;

public interface LikeCommentRepository extends JpaRepository<LikeComment, Integer> {

    List<LikeComment> findByUserIdAndCommentId(int userId, int commentId);

}
