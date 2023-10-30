package com.example.kakao.repository;

import com.example.kakao.entity.ReComment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReCommentRepository extends JpaRepository<ReComment, Integer> {

    // List<ReComment> findByUserIdAndReCommentId(int userId, int reCommentId);

}
