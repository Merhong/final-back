package com.example.kakao._entity;

import com.example.kakao.webtoon.Webtoon;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;



@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "advertising_sub_tb")
public class AdvertisingSub {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // @OneToOne
    // private Webtoon webtoon;

    private String photo;

    private String linkURL;

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;

    private Timestamp endDate;



    @Builder
    public AdvertisingSub(int id, String photo, String linkURL, Timestamp createdAt, Timestamp updatedAt,
            Timestamp endDate) {
        this.id = id;
        this.photo = photo;
        this.linkURL = linkURL;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.endDate = endDate;
    }
    

}
