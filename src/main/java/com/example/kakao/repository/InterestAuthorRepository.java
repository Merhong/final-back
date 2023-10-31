package com.example.kakao.repository;

import com.example.kakao.entity.InterestAuthor;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InterestAuthorRepository extends JpaRepository<InterestAuthor, Integer> {

    List<InterestAuthor> findByUserIdAndAuthorId(int userId, int webtoonId);
    
    List<InterestAuthor> findByUserId(int userId, Sort sort);

}
