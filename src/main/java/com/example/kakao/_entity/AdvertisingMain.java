package com.example.kakao._entity;

import com.example.kakao.webtoon.Webtoon;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "advertising_main_tb")
public class AdvertisingMain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Webtoon webtoon;

    private String mainText;

    private String subText;

    private String photo;

    private String linkURL;

    private Boolean isWebLink;

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;

    private Timestamp endDate;




    @Builder
    public AdvertisingMain(int id, Webtoon webtoon, String mainText, String subText, String photo, String linkURL,
            Boolean isWebLink, Timestamp createdAt, Timestamp updatedAt, Timestamp endDate) {
        this.id = id;
        this.webtoon = webtoon;
        this.mainText = mainText;
        this.subText = subText;
        this.photo = photo;
        this.linkURL = linkURL;
        this.isWebLink = isWebLink;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.endDate = endDate;
    }


    
}
