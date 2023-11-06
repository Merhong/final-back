package com.example.kakao._repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kakao._entity.AuthorBoard;

import java.util.List;

public interface AuthorBoardRepository extends JpaRepository<AuthorBoard, Integer> {

}
