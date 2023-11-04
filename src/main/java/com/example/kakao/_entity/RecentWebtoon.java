package com.example.kakao._entity;

import com.example.kakao.episode.Episode;
import com.example.kakao.user.User;
import com.example.kakao.webtoon.Webtoon;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;


@ToString
@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "recent_webtoon_tb", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_id", "episode_id"})
})
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
    
    @UpdateTimestamp
    private Timestamp updatedAt;




    @Builder
    public RecentWebtoon(int id, User user, Webtoon webtoon, Episode episode, Timestamp createdAt,
            Timestamp updatedAt) {
        this.id = id;
        this.user = user;
        this.webtoon = webtoon;
        this.episode = episode;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }



}
