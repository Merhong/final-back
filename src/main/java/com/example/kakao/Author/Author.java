package com.example.kakao.Author;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.kakao.entity.WebtoonAuthor;
import com.example.kakao.user.User;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="author_tb")
public class Author{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private User user;

    private String authorNickname;

    private String authorPhoto;

    private String siteURL;

    @CreationTimestamp
    private Timestamp createdAt;
    
    @UpdateTimestamp
    private Timestamp updatedAt;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<WebtoonAuthor> webtoonAuthorList = new ArrayList<>();
    
}
