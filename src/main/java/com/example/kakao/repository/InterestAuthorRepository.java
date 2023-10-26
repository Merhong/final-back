package com.example.kakao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;

import com.example.kakao.entity.InterestAuthor;

public interface InterestAuthorRepository extends JpaRepository<InterestAuthor, Integer> {

    List<InterestAuthor> findByUserIdAndAuthorId(int userId, int webtoonId);

}
