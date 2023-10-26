package com.example.kakao.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.example.kakao.entity.enums.HashTagEnum;
import com.example.kakao.webtoon.Webtoon;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="webtoon_hash_tag_tb")
public class WebtoonHashTag{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Webtoon webtoon;

    @Enumerated(EnumType.STRING)
    private HashTagEnum hashTagEnum;

}
