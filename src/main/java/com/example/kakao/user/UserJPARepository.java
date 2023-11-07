package com.example.kakao.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

import javax.transaction.Transactional;

public interface UserJPARepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmailAndPassword(String email, String password);

    @Modifying
    @Transactional
    @Query("UPDATE User u SET u.cookie = :newCookie where u.id = :userId")
    void updateCookie(@Param("userId") int userId, @Param("newCookie") int cookieAmount);

}
