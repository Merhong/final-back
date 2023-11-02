package com.example.kakao.user;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

import com.example.kakao.comment.Comment;
import com.example.kakao.entity.AuthorBoard;
import com.example.kakao.entity.InterestAuthor;
import com.example.kakao.entity.InterestWebtoon;
import com.example.kakao.entity.ReComment;
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
        private int commentId;
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

        private Integer reCommentCount = -1;

        private int reCommentId = -1;

        private Boolean isReComment;



        public MyCommentDTO(ReComment reComment, int sessionUserId) {
            this.commentId = reComment.getComment().getId();
            this.text = reComment.getText();
            this.createdAt = reComment.getCreatedAt();
            this.userId = sessionUserId;

            // this.episodeDTO = comment.getEpisode();
            Episode tempEpisode = reComment.getComment().getEpisode();
            this.episodeId = tempEpisode.getId();
            this.episodeTitle = tempEpisode.getDetailTitle();
            this.episodeThumbnail = tempEpisode.getThumbnail();

            this.webtoonId = tempEpisode.getWebtoon().getId();
            this.webtoonTitle = tempEpisode.getWebtoon().getTitle();
            
            this.likeCommentCount = reComment.getLikeReCommentList().stream()
                    .map(t -> (t.getIsLike() == true) ? 1 : 0)
                    .reduce(0, (a, b) -> a + b);

            this.dislikeCommentCount = reComment.getLikeReCommentList().stream()
                    .map(t -> (t.getIsLike() == false) ? 1 : 0)
                    .reduce(0, (a, b) -> a + b);
            
            this.reCommentId = reComment.getId();

            this.isReComment = true;
        }




        public MyCommentDTO(Comment comment, int sessionUserId) {
            this.commentId = comment.getId();
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

            this.reCommentCount = comment.getReCommentList().size();

            this.isReComment = false;
        }
    }


    @ToString
    @Getter
    @Setter
    public static class InterestAuthorDTO {
        private int id;
        private int userId;
        private int authorId;
        private String authorPhoto;
        private String authorNickname;
        private String authorSiteURL;
        private List<String> authorWebtoonNameList;
        private Boolean isAlarm;
        private Timestamp authorBoardCreateAt;
        private Timestamp createdAt;

        public InterestAuthorDTO(InterestAuthor ia) {
            this.id = ia.getId();
            this.userId = ia.getUser().getId();
            this.authorId = ia.getAuthor().getId();
            this.authorNickname = ia.getAuthor().getAuthorNickname();
            this.authorPhoto = ia.getAuthor().getAuthorPhoto() == null ? "default_profile.png" : ia.getAuthor().getAuthorPhoto();
            this.authorSiteURL = ia.getAuthor().getSiteURL() == null? "없음" : ia.getAuthor().getSiteURL();
            this.isAlarm = ia.getIsAlarm();
            this.createdAt = ia.getCreatedAt();

            this.authorWebtoonNameList = ia.getAuthor().getWebtoonAuthorList().stream()
                    .map(webtoonAuthor -> webtoonAuthor.getWebtoon().getTitle())
                    .collect(Collectors.toList());

            List<AuthorBoard> tempAuthorBoardList = ia.getAuthor().getAuthorBoardList();
            if(tempAuthorBoardList.size() > 0){
                this.authorBoardCreateAt = tempAuthorBoardList.get(0).getCreatedAt();
            } else {
                this.authorBoardCreateAt = ia.getAuthor().getCreatedAt();
            }

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
