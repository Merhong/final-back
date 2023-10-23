package com.example.kakao.episode;

import lombok.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.example.kakao.webtoon.Webtoon;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="episode_tb")
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 100, nullable = false)
    private String detailTitle;
    private String thumbnail;
    private Double starCount;
    private Integer cookieCost;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    // 웹툰 내용 테이블 추가 필요
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Webtoon webtoon;
    
    // @ManyToOne(fetch = FetchType.LAZY)
    // private Author author;
    
    // String intro;
    // String hashtag;
    // String age;
    // String week;
    // Boolean isEnd;
    // String thumbnail;
    // Timestamp createdAt;
    // Timestamp updatedAt;
    
    // private Boolean isRead; // 유저랑 중간테이블
}
