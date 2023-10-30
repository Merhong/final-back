package com.example.kakao.user;

import java.sql.Timestamp;
import java.util.List;

import com.example.kakao.entity.InterestWebtoon;
import com.example.kakao.entity.enums.UserTypeEnum;
import com.example.kakao.episode.Episode;
import com.example.kakao.webtoon.Webtoon;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class UserResponse {


    @Getter
    @Setter
    public static class InterestWebtoonDTO {
        private int id;
        private int userId;
        private int webtoonId;
        private String webtoonImage;
        private Boolean isAlarm;
        private Timestamp webtoonUpdateAt;
        private Timestamp createdAt;

        public InterestWebtoonDTO(InterestWebtoon iw) {
            this.id = iw.getId();
            this.userId = iw.getUser().getId();
            this.isAlarm = iw.getIsAlarm();
            this.createdAt = iw.getCreatedAt();
            this.webtoonId = iw.getWebtoon().getId();
            
            List<Episode> episodeList = iw.getWebtoon().getEpisodeList();
            if(episodeList.size()>0){
                this.webtoonImage = episodeList.get(0).getThumbnail();
                this.webtoonUpdateAt = episodeList.get(0).getCreatedAt();
            }

        }
    }


    @Getter
    @Setter
    public static class FindById {
        private int id;
        private String username;
        private String email;

        public FindById(User user) {
            this.id = user.getId();
            this.username = user.getUsername();
            this.email = user.getEmail();
        }
    }

    @Getter
    @Setter
    @ToString
    public static class loginResponseDTO {
        private int id;
        private String email;
        private String username;
        private String jwt;
        // private Boolean isAdmin;
        // private Boolean isAuthor;
        private UserTypeEnum userTypeEnum;
        private Integer cookie;
        private String photo;


        public loginResponseDTO(User user) {
            this.id = user.getId();
            this.email = user.getEmail();
            this.username = user.getUsername();
            this.userTypeEnum = user.getUserTypeEnum();
            // this.isAdmin = user.getIsAdmin();
            // this.isAuthor = user.getIsAuthor();
            this.cookie = user.getCookie();
            this.photo = user.getPhoto();
        }
    }


    @Getter
    @Setter
    @ToString
    public static class updateResponseDTO {
        private int id;
        private String password;
        private String email;
        private String username;
        private Integer cookie;

        public updateResponseDTO(User user) {
            this.id = user.getId();
            this.password = user.getPassword();
            this.email = user.getEmail();
            this.username = user.getUsername();
            this.cookie = user.getCookie();
        }
    }

}
