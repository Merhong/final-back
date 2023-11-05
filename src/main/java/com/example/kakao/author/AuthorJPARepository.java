package com.example.kakao.author;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorJPARepository extends JpaRepository<Author, Integer> {

    
    Author findByUserId(int userId);

}
