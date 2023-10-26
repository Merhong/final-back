package com.example.kakao.user;

import com.example.kakao.Author.Author;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.kakao.entity.enums.UserTypeEnum;


@ToString
@Setter
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

    // @ColumnDefault("false")
    // private Boolean isAdmin; // true=관리자, false=일반유저
    
    // @ColumnDefault("false")
    // private Boolean isAuthor; // true=작가, false=일반유저

    @Enumerated(EnumType.STRING)
    private UserTypeEnum userTypeEnum;
    
    @OneToOne(mappedBy = "user")
    private Author author;
    
    @ColumnDefault("0")
    private Integer cookie;
    
    private String birth;

    private String gender;

    private String realName; // 실명
    
    private String tel;

    private String photo;

    @CreationTimestamp
    private Timestamp createdAt;
    
    @UpdateTimestamp
    private Timestamp updatedAt;

    @Builder
    public User(int id, String email, String password, String username, UserTypeEnum userTypeEnum, Author author,
            Integer cookie, String birth, String gender, String realName, String tel, String photo, Timestamp createdAt,
            Timestamp updatedAt) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
        this.userTypeEnum = userTypeEnum;
        this.author = author;
        this.cookie = cookie;
        this.birth = birth;
        this.gender = gender;
        this.realName = realName;
        this.tel = tel;
        this.photo = photo;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    


}
