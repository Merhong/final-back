package com.example.kakao._repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kakao._entity.ReComment;

import java.util.List;

public interface ReCommentRepository extends JpaRepository<ReComment, Integer> {

    // List<ReComment> findByUserIdAndReCommentId(int userId, int reCommentId);

    List<ReComment> findByUserId(int userId);
    
    List<ReComment> findByUserId(int userId, Sort sort);

}
