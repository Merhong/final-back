package com.example.kakao.entity;

import com.example.kakao.episode.Episode;
import com.example.kakao.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "like_episode_tb")
public class LikeEpisode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Episode episode;

    private Boolean isStar; // 별점 주기 취소안됨

    // 본인껀 못하는 로직 필요
    private Boolean isLike; // true좋아요 / false 싫어요

    @CreationTimestamp
    private Timestamp createdAt;

    // 두개 공통 중복이면 안되게 유니크 제약조건 필요

}
