package com.example.kakao.webtoon;

import com.example.kakao._entity.AdvertisingMain;
import com.example.kakao._entity.InterestWebtoon;
import com.example.kakao._entity.WebtoonAuthor;
import com.example.kakao._entity.WebtoonHashTag;
import com.example.kakao._entity.enums.WebtoonSpeciallyEnum;
import com.example.kakao.author.Author;
import com.example.kakao.episode.Episode;
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
@Table(name = "webtoon_tb")
public class Webtoon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "webtoon", fetch = FetchType.LAZY)
    private List<WebtoonAuthor> webtoonAuthorList = new ArrayList<>();

    @OneToMany(mappedBy = "webtoon", fetch = FetchType.LAZY)
    @OrderBy("createdAt DESC") // 에피소드 최근 순서대로 정렬
    private List<Episode> episodeList = new ArrayList<>();

    @OneToMany(mappedBy = "webtoon", fetch = FetchType.LAZY)
    private List<InterestWebtoon> interstWebtoonList = new ArrayList<>();

    @OneToMany(mappedBy = "webtoon", fetch = FetchType.LAZY)
    private List<WebtoonHashTag> webtoonHashTagList = new ArrayList<>();

    @OneToOne(mappedBy = "webtoon")
    private AdvertisingMain advertisingMain;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 500)
    private String intro; // 소개글

    @ColumnDefault("0")
    private Double starScore; // 별점 계산 분자값 // 웹툰 자체 별점은 없고 각 에피소드별 합산임. 그러니까 모두 0으로 하거나, 필드를 없애고 requestDTO에만 계산해서 줘야함

    @ColumnDefault("0")
    private Double starCount; // 별점 계산 분모값 // 웹툰 자체 별점은 없고 각 에피소드별 합산임. 그러니까 모두 0으로 하거나, 필드를 없애고 requestDTO에만 계산해서 줘야함

    private String image; // 메인페이지 썸네일

    private String detailImage; // 상세보기페이지 썸네일

    private Integer ageLimit; // 나이제한

    // @Enumerated(EnumType.STRING)
    private String webtoonWeekDayEnum; // 요일 여러개나 매일 올라오는거도 있어서 스트링으로 바꾸고 프론트에서 로직으로 구분하는걸로

    // @ColumnDefault("'없음'") // enum에는 작동 안하는거 같음
    @Enumerated(EnumType.STRING)
    private WebtoonSpeciallyEnum webtoonSpeciallyEnum; // 없음, 휴재, 완결, 무료, 순위, 신작 // 여러개가 되면?

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;


    @Builder
    public Webtoon(Integer id, List<WebtoonAuthor> webtoonAuthorList, List<Episode> episodeList, String title,
                   String intro, Double starScore, Double starCount, String image, String detailImage, Integer ageLimit,
                   String webtoonWeekDayEnum, WebtoonSpeciallyEnum webtoonSpeciallyEnum, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.webtoonAuthorList = webtoonAuthorList;
        this.episodeList = episodeList;
        this.title = title;
        this.intro = intro;
        this.starScore = starScore;
        this.starCount = starCount;
        this.image = image;
        this.detailImage = detailImage;
        this.ageLimit = ageLimit;
        this.webtoonWeekDayEnum = webtoonWeekDayEnum;
        this.webtoonSpeciallyEnum = webtoonSpeciallyEnum;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


}
