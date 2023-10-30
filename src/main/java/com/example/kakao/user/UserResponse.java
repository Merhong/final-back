package com.example.kakao.user;

import java.sql.Timestamp;
import java.util.List;

import com.example.kakao.comment.Comment;
import com.example.kakao.entity.InterestWebtoon;
import com.example.kakao.entity.enums.UserTypeEnum;
import com.example.kakao.entity.enums.WebtoonSpeciallyEnum;
import com.example.kakao.episode.Episode;
import com.example.kakao.webtoon.Webtoon;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class UserResponse {




    @ToString
    @Getter
    @Setter
    public static class MyCommentDTO {
        private int id;
        private String text;
        private Timestamp createdAt;
        private int userId;
        private int episodeId;
        private String episodeTitle;
        private String episodeThumbnail;
        private int webtoonId;
        private String webtoonTitle;
        private Integer likeCommentCount;
        private Integer dislikeCommentCount;

        public MyCommentDTO(Comment comment, int sessionUserId) {
            this.id = comment.getId();
            this.text = comment.getText();
            this.createdAt = comment.getCreatedAt();
            this.userId = sessionUserId;

            // this.episodeDTO = comment.getEpisode();
            Episode tempEpisode = comment.getEpisode();
            this.episodeId = tempEpisode.getId();
            this.episodeTitle = tempEpisode.getDetailTitle();
            this.episodeThumbnail = tempEpisode.getThumbnail();

            this.webtoonId = tempEpisode.getWebtoon().getId();
            this.webtoonTitle = tempEpisode.getWebtoon().getTitle();
            
            this.likeCommentCount = comment.getLikeCommentList().stream()
                    .map(t -> (t.getIsLike() == true) ? 1 : 0)
                    .reduce(0, (a, b) -> a + b);

            this.dislikeCommentCount = comment.getLikeCommentList().stream()
                    .map(t -> (t.getIsLike() == false) ? 1 : 0)
                    .reduce(0, (a, b) -> a + b);
        }
    }




    @ToString
    @Getter
    @Setter
    public static class InterestWebtoonDTO {
        private int id;
        private int userId;
        private int webtoonId;
        private String webtoonImage;
        private String webtoonTitle;
        private WebtoonSpeciallyEnum webtoonSpeciallyEnum;
        private Boolean isAlarm;
        private Timestamp webtoonUpdateAt;
        private Timestamp createdAt;

        public InterestWebtoonDTO(InterestWebtoon iw) {
            this.id = iw.getId();
            this.userId = iw.getUser().getId();
            this.isAlarm = iw.getIsAlarm();
            this.createdAt = iw.getCreatedAt();
            this.webtoonId = iw.getWebtoon().getId();
            this.webtoonTitle = iw.getWebtoon().getTitle();
            this.webtoonSpeciallyEnum = iw.getWebtoon().getWebtoonSpeciallyEnum();
            
            List<Episode> episodeList = iw.getWebtoon().getEpisodeList();
            if(episodeList.size()>0){
                this.webtoonImage = episodeList.get(0).getThumbnail();
                this.webtoonUpdateAt = episodeList.get(0).getCreatedAt();
            }

        }
    }


    @ToString
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
