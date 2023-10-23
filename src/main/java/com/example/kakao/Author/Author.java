package com.example.kakao.Author;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.example.kakao.episode.Episode;
import com.example.kakao.user.User;
import com.example.kakao.webtoon.Webtoon;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="author_tb")
public class Author{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Webtoon> webtoonList = new ArrayList<>();
    
    @OneToOne
    private User user;

    private String authorname;

    // @Column(length = 100, nullable = false, unique = true)
    // private String email; // 인증시 필요한 필드
    // @Column(length = 256, nullable = false)
    // private String password;
    // @Column(length = 45, nullable = false, unique = true)
    // private String username; // 별명

    // private Boolean isAdmin; // true=관리자, false=일반유저
    
    // private Timestamp createdAt;
    
    
    
    
    // private String birth;
    // private String gender;
    // private String realName; // 실명
    
    // private String tel;
    // private String photo;
    // private Integer cookie;
    
    // private Timestamp updatedAt;
    

}
