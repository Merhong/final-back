package com.example.kakao.episode;

import com.example.kakao.comment.Comment;
import com.example.kakao.entity.EpisodePhoto;
import com.example.kakao.entity.LikeEpisode;
import com.example.kakao.webtoon.Webtoon;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


@ToString
@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "episode_tb")
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Webtoon webtoon;

    @OneToMany(mappedBy = "episode", fetch = FetchType.LAZY)
    private List<EpisodePhoto> episodePhotoList = new ArrayList<>();

    @OneToMany(mappedBy = "episode", fetch = FetchType.LAZY)
    private List<Comment> commentList = new ArrayList<>();

    @OneToMany(mappedBy = "episode", fetch = FetchType.LAZY)
    private List<LikeEpisode> likeEpisodeList = new ArrayList<>();

    @Column(length = 100, nullable = false)
    private String detailTitle;

    private String thumbnail;

    @ColumnDefault("'작가의말 없음'")
    private String authorText;

    @ColumnDefault("0")
    private Integer cookieCost;

    @ColumnDefault("0")
    private Double starScore; // 별점 계산 분자값

    @ColumnDefault("0")
    private Double starCount; // 별점 계산 분모값

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;


    @Builder
    public Episode(Integer id, Webtoon webtoon, List<EpisodePhoto> episodePhotoList, List<Comment> commentList,
                   List<LikeEpisode> likeEpisodeList, String detailTitle, String thumbnail, String authorText,
                   Integer cookieCost, Double starScore, Double starCount, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.webtoon = webtoon;
        this.episodePhotoList = episodePhotoList;
        this.commentList = commentList;
        this.likeEpisodeList = likeEpisodeList;
        this.detailTitle = detailTitle;
        this.thumbnail = thumbnail;
        this.authorText = authorText;
        this.cookieCost = cookieCost;
        this.starScore = starScore;
        this.starCount = starCount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


}
