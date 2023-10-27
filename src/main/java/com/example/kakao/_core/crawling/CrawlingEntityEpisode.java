package com.example.kakao._core.crawling;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class CrawlingEntityEpisode {
    private String detailTitle;
    private String thumbnail;
    private Integer epNum;
    private Double starCount;
    private Boolean isRead;
    private Integer cookieCost;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
