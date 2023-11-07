package com.example.kakao._repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kakao._entity.InterestAuthor;

import java.util.List;

public interface InterestAuthorRepository extends JpaRepository<InterestAuthor, Integer> {

    List<InterestAuthor> findByUserIdAndAuthorId(int userId, int webtoonId);
    
    List<InterestAuthor> findByUserId(int userId, Sort sort);

}
