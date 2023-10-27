package com.example.kakao.author;

import com.example.kakao.entity.InterestAuthor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

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