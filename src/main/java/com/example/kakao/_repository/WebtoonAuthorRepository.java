package com.example.kakao._repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kakao._entity.WebtoonAuthor;

import java.util.List;

public interface WebtoonAuthorRepository extends JpaRepository<WebtoonAuthor, Integer> {

}
