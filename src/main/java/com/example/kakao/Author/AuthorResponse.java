package com.example.kakao.author;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.annotations.CreationTimestamp;

import com.example.kakao.author.Author;
import com.example.kakao.entity.InterestAuthor;
import com.example.kakao.entity.InterestWebtoon;
import com.example.kakao.entity.enums.WebtoonSpeciallyEnum;
import com.example.kakao.episode.Episode;
import com.example.kakao.user.User;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class AuthorResponse {

    @Getter
    @Setter
    @ToString
    public static class InterestDTO {
        private int id;
        private Boolean isAlarm;
        private Timestamp createdAt;
        private int userId;
        private int authorId;
        // private int authorTotalInterest;


        public InterestDTO(InterestAuthor ia) {
            this.id = ia.getId();
            this.isAlarm = ia.getIsAlarm();
            this.createdAt = ia.getCreatedAt();
            this.userId = ia.getUser().getId();
            this.authorId = ia.getAuthor().getId();
            // this.webtoonTotalInterest = webtoonTotalInterest;
        }

        
    }


}