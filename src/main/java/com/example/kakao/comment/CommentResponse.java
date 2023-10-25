package com.example.kakao.comment;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import com.example.kakao.comment.Comment;
import com.example.kakao.entity.EpisodePhoto;
import com.example.kakao.entity.ReComment;
import com.example.kakao.user.User;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class CommentResponse {


    
    @Getter
    @Setter
    @ToString
    public static class FindAllDTO {
        private Integer id;
        // private UserDTO user;
        private Integer episodeId;
        private Integer likeCommentCount;
        private Boolean isDelete;
        private String text;
        private Boolean isAuthor = false;
        private Timestamp createdAt;
        private Integer userId;
        private String userEmail;
        private String userUsername;
        private List<ReCommentDTO> reCommentList;

        FindAllDTO(Comment comment, List<Integer> authorUserIdList) {
            this.id = comment.getId();
            this.isDelete = comment.getIsDelete();
            this.text = comment.getText();
            this.createdAt = comment.getCreatedAt();
            this.episodeId = comment.getEpisode().getId();

            // this.user = new UserDTO(comment.getUser());
            this.userId = comment.getUser().getId();
            this.userEmail = comment.getUser().getEmail();
            this.userUsername = comment.getUser().getUsername();

            this.reCommentList = comment.getReCommentList().stream()
                    .map(t -> new ReCommentDTO(t)).collect(Collectors.toList());

            this.isAuthor = authorUserIdList.stream()
                    .anyMatch(t -> t == comment.getUser().getId());
            // for (Integer authorUserId : authorUserIdList ) {
            // if(comment.getUser().getId()==authorUserId){
            // this.isAuthor = true;
            // }
            // }

            this.likeCommentCount = comment.getLikeCommentList().stream()
                    .map(t -> (t.getIsLike() == true) ? 1 : -1)
                    .reduce(0, (a, b) -> a + b);

        }

        @Getter
        @Setter
        @ToString
        class ReCommentDTO {
            private Integer id;
            private Integer commentId;
            private Boolean isDelete;
            private String text;
            private Timestamp createdAt;
            private Integer likeReCommentCount;
            private Integer userId;
            private String userEmail;
            private String userUsername;

            public ReCommentDTO(ReComment reComment) {
                this.id = reComment.getId();
                this.isDelete = reComment.getIsDelete();
                this.text = reComment.getText();
                this.createdAt = reComment.getCreatedAt();
                this.commentId = reComment.getComment().getId();

                this.userId = reComment.getUser().getId();
                this.userEmail = reComment.getUser().getEmail();
                this.userUsername = reComment.getUser().getUsername();

                this.likeReCommentCount = reComment.getLikeReCommentList().stream()
                        .map(t -> (t.getIsLike() == true) ? 1 : -1)
                        .reduce(0, (a, b) -> a + b);
            }
        }

        // @Getter
        // @Setter
        // @ToString
        // class UserDTO {
        // private Integer id;
        // private String email;
        // private String username;

        // UserDTO(User user) {
        // this.id = user.getId();
        // this.email = user.getEmail();
        // this.username = user.getUsername();
        // }
        // }

    }
}