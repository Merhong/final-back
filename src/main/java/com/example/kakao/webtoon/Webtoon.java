package com.example.kakao.webtoon;

import lombok.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.example.kakao.Author.Author;
import com.example.kakao.episode.Episode;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="webtoon_tb")
public class Webtoon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 100, nullable = false)
    private String title;
    private Double starCount;
    private String image; // 메인페이지 썸네일
    private String detailImage; // 상세보기페이지 썸네일
    private String weekDay; // 업로드요일 // 여러개가 되면 테이블 더
    @Column(length = 500)
    private String intro; // 소개글
    private Integer likeCount; // 좋아요 테이블 개수 세는거로 바꿔야
    private String specially; //  휴재, 완결, 무료, 순위, 신작
    private Integer age; // 나이제한
    private String hashtag; // 코드테이블 추가로 바꿔야?
    private Timestamp createdAt;
    private Timestamp updatedAt;
    
    // private String webtoonType;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Author author;

    @OneToMany(mappedBy = "webtoon", fetch = FetchType.LAZY)
    private List<Episode> episodeList = new ArrayList<>();

    


    // @ManyToOne(fetch = FetchType.LAZY)
    // private WebtoonType webtoonType;
    


}
