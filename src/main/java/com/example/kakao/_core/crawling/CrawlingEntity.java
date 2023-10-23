package com.example.kakao._core.crawling;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CrawlingEntity {
    private String title;
    private String author;
    private Double starCount;
    private String image; //
    private String weekDay; // 업로드요일
    private String intro; // 소개글
    private Integer likeCount; // 좋아요 테이블 개수 세는거로 바꿔야
    private String special;
    private Integer age; // 나이제한
    private String hashtag; // 테이블 추가로 바꿔야?
    private String link;
}
