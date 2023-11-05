package com.example.kakao._entity;

import com.example.kakao.episode.Episode;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "episode_photo_tb")
public class EpisodePhoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Episode episode;

    private String photoURL;



    @Builder
    public EpisodePhoto(int id, Episode episode, String photoURL) {
        this.id = id;
        this.episode = episode;
        this.photoURL = photoURL;
    }

    

}
