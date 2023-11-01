package com.example.kakao._entity;

import com.example.kakao.author.Author;
import com.example.kakao.webtoon.Webtoon;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "webtoon_author_tb", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"webtoon_id", "author_id"})
})
public class WebtoonAuthor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Webtoon webtoon;

    @ManyToOne(fetch = FetchType.LAZY)
    private Author author;

}
