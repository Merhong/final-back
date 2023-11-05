package com.example.kakao.author;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

import com.example.kakao._entity.AuthorBoard;
import com.example.kakao._entity.InterestAuthor;

public class AuthorResponse {

    



    @Getter
    @Setter
    @ToString
    public static class CreateBoardDTO {
        private int id;
        private int authorId;
        private String title;
        private String text;
        private String photo;
        private Timestamp createdAt;
        private Timestamp updatedAt;


        public CreateBoardDTO(AuthorBoard authorBoard) {
            this.id = authorBoard.getId();
            this.authorId = authorBoard.getAuthor().getId();
            this.title = authorBoard.getTitle();
            this.text = authorBoard.getText();
            this.photo = authorBoard.getPhoto();
            this.createdAt = authorBoard.getCreatedAt();
            this.updatedAt = authorBoard.getUpdatedAt();
        }
    }




    @Getter
    @Setter
    @ToString
    public static class UpdateDTO {
        private int id;
        private String authorNickname;
        private String authorPhoto;
        private String siteURL;
        private String introduce;


        public UpdateDTO(Author author) {
            this.id = author.getId();
            this.authorNickname = author.getAuthorNickname();
            this.authorPhoto = author.getAuthorPhoto();
            this.siteURL = author.getSiteURL();
            this.introduce = author.getIntroduce();
        }
    }




    @Getter
    @Setter
    @ToString
    public static class CreateDTO {
        private int id;
        private String authorNickname;
        private String authorPhoto;
        private String siteURL;
        private String introduce;


        public CreateDTO(Author author) {
            this.id = author.getId();
            this.authorNickname = author.getAuthorNickname();
            this.authorPhoto = author.getAuthorPhoto();
            this.siteURL = author.getSiteURL();
            this.introduce = author.getIntroduce();
        }
    }

    
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