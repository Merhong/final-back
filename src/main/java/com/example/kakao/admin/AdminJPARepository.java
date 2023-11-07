package com.example.kakao.admin;

import com.example.kakao.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminJPARepository extends JpaRepository<User, Integer> {

}
