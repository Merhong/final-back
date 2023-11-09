package com.example.kakao.admin;

import com.example.kakao.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

// Admin도 User 테이블에 포함되어 있음.
public interface AdminJPARepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmailAndPassword(String email, String password);


    @Query("select u from User u where u.email = :email")
    User findByUserEmail(@Param("email") String email);
}
