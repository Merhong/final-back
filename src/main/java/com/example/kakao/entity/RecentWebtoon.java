package com.example.kakao.entity;

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

import com.example.kakao.episode.Episode;
import com.example.kakao.user.User;
import com.example.kakao.webtoon.Webtoon;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="recent_webtoon_tb")
public class RecentWebtoon{

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
