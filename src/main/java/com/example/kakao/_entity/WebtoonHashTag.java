package com.example.kakao._entity;

import com.example.kakao._entity.enums.HashTagEnum;
import com.example.kakao.webtoon.Webtoon;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "webtoon_hash_tag_tb")
public class WebtoonHashTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Webtoon webtoon;

    @Enumerated(EnumType.STRING)
    private HashTagEnum hashTagEnum;

    private String hashTagName;
}
