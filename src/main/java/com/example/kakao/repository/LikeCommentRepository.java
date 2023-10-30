package com.example.kakao.repository;

import com.example.kakao.entity.LikeComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeCommentRepository extends JpaRepository<LikeComment, Integer> {

    List<LikeComment> findByUserIdAndCommentId(int userId, int commentId);

}
