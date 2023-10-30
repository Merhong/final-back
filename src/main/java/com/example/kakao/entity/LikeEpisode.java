package com.example.kakao.entity;

import com.example.kakao.episode.Episode;
import com.example.kakao.user.User;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;


@ToString
@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "like_episode_tb", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_id", "episode_id"})
})
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
    private Boolean isLike ; // true좋아요 / 에피소드는 싫어요 없음

    @CreationTimestamp
    private Timestamp createdAt;


    @Builder
    public LikeEpisode(int id, User user, Episode episode, Boolean isStar, Boolean isLike, Timestamp createdAt) {
        this.id = id;
        this.user = user;
        this.episode = episode;
        this.isStar = isStar;
        this.isLike = isLike;
        this.createdAt = createdAt;
    }


}
