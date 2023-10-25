package com.example.kakao.webtoon;

import lombok.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.kakao.entity.WebtoonAuthor;
import com.example.kakao.episode.Episode;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "webtoon_tb")
public class Webtoon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @OneToMany(mappedBy = "webtoon", fetch = FetchType.LAZY)
    private List<WebtoonAuthor> webtoonAuthorList = new ArrayList<>();
    
    @OneToMany(mappedBy = "webtoon", fetch = FetchType.LAZY)
    private List<Episode> episodeList = new ArrayList<>();

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 500)
    private String intro; // 소개글

    @ColumnDefault("0")
    private Double starScore; // 별점 계산 분자값
    
    @ColumnDefault("0")
    private Double starCount; // 별점 계산 분모값

    private String image; // 메인페이지 썸네일

    private String detailImage; // 상세보기페이지 썸네일

    private Integer ageLimit; // 나이제한

    private String weekDay; // 업로드요일 // 여러개가 되면?

    private String specially; // 휴재, 완결, 무료, 순위, 신작 // 여러개가 되면?

    @CreationTimestamp
    private Timestamp createdAt;
    
    @UpdateTimestamp
    private Timestamp updatedAt;





    // private Integer likeCount; // 좋아요 테이블 개수 세야함

    // private String hashtag; // 테이블 추가로

    // @ManyToOne(fetch = FetchType.LAZY)
    // private Author author;

    // @ManyToOne(fetch = FetchType.LAZY)
    // private WebtoonType webtoonType;

}
