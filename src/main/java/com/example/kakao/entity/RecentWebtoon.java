package com.example.kakao.entity;

import com.example.kakao.episode.Episode;
import com.example.kakao.user.User;
import com.example.kakao.webtoon.Webtoon;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "recent_webtoon_tb")
public class RecentWebtoon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Webtoon webtoon;

    @ManyToOne(fetch = FetchType.LAZY)
    private Episode episode;

    @CreationTimestamp
    private Timestamp createdAt;

}
