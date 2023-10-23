package com.example.kakao.user;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

import javax.persistence.*;

import com.example.kakao.Author.Author;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="user_tb")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100, nullable = false, unique = true)
    private String email; // 인증시 필요한 필드
    @Column(length = 256, nullable = false)
    private String password;
    @Column(length = 45, nullable = false, unique = true)
    private String username; // 별명

    private Boolean isAdmin; // true=관리자, false=일반유저
    
    private Timestamp createdAt;
    
    @OneToOne(mappedBy = "user")
    private Author author;
    
    
    // private String birth;
    // private String gender;
    // private String realName; // 실명
    
    // private String tel;
    // private String photo;
    // private Integer cookie;
    // test
    // private Timestamp updatedAt;
    


    @Builder
    public User(int id, String email, String password, String username) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
    }
}
