package com.example.kakao.author;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorJPARepository extends JpaRepository<Author, Integer> {

    
    Optional<Author> findByUserId(int userId);

}
