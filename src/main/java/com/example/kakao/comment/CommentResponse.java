package com.example.kakao.comment;

import com.example.kakao.entity.LikeComment;
import com.example.kakao.entity.LikeReComment;
import com.example.kakao.entity.ReComment;
import com.example.kakao.entity.enums.UserTypeEnum;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

public class CommentResponse {

    // @Getter
    // @Setter
    // @ToString
    // public static class SaveCommentDTO {
    // private Integer id;
    // private Integer userId;
    // private Integer episodeId;
    // private String text;
    // private Timestamp createdAt;

    // public SaveCommentDTO(Comment comment) {
    // this.id = comment.getId();
    // this.userId = comment.getUser().getId();
    // this.episodeId = comment.getEpisode().getId();
    // this.text = comment.getText();
    // this.createdAt = comment.getCreatedAt();
    // }
    // }


    
    
    @Getter
    @Setter
    @ToString
    public static class ReCommentDeleteDTO {
        private Integer id;
        private Integer userId;
        private Integer commentId;
        private Integer deletedId;
        private Boolean isDelete;

        public ReCommentDeleteDTO(ReComment reComment) {
            this.id = reComment.getId();
            this.userId = reComment.getUser().getId();
            this.commentId = reComment.getComment().getId();
            this.deletedId = reComment.getId();
            this.isDelete = reComment.getIsDelete();
        }
    }




    @Getter
    @Setter
    @ToString
    public static class DeleteDTO {
        private Integer id;
        private Integer userId;
        private Integer deletedId;
        private Boolean isDelete;

        public DeleteDTO(Comment comment) {
            this.id = comment.getId();
            this.userId = comment.getUser().getId();
            this.deletedId = comment.getId();
            this.isDelete = comment.getIsDelete();
        }
    }



    @Getter
    @Setter
    @ToString
    public static class LikeReCommentDTO {
        private Integer id;
        private Integer userId;
        private Integer reCommentId;
        private Integer commentId;
        private Boolean isLike;
        private Timestamp createdAt;

        public LikeReCommentDTO(LikeReComment lrc, int commentId) {
            this.id = lrc.getId();
            this.userId = lrc.getUser().getId();
            this.reCommentId = lrc.getReComment().getId();
            this.commentId = commentId;
            this.isLike = lrc.getIsLike();
            this.createdAt = lrc.getCreatedAt();
        }
    }

    @Getter
    @Setter
    @ToString
    public static class LikeDTO {
        private Integer id;
        private Integer userId;
        private Integer commentId;
        private Boolean isLike;
        private Timestamp createdAt;

        public LikeDTO(LikeComment lc) {
            this.id = lc.getId();
            this.userId = lc.getUser().getId();
            this.commentId = lc.getComment().getId();
            this.isLike = lc.getIsLike();
            this.createdAt = lc.getCreatedAt();
        }
    }

    @Getter
    @Setter
    @ToString
    public static class CommentDTO {
        private Integer id;
        // private UserDTO user;
        private Integer episodeId;
        private Integer likeCommentCount;
        private Integer dislikeCommentCount;
        private Boolean isDelete;
        private String text;
        private Boolean isAuthor = false;
        private Boolean isAdmin = false;
        private Timestamp createdAt;
        private Integer userId;
        private String userEmail;
        private String userUsername;
        private List<ReCommentDTO> reCommentList;
        private Boolean isMyLike = false;
        private Boolean isMyDislike = false;

        CommentDTO(Comment comment, List<Integer> authorUserIdList, int sessionUserId) {
            this.id = comment.getId();
            this.isDelete = comment.getIsDelete();
            this.text = comment.getText();
            this.createdAt = comment.getCreatedAt();
            this.episodeId = comment.getEpisode().getId();

            // this.user = new UserDTO(comment.getUser());
            this.userId = comment.getUser().getId();
            this.userEmail = comment.getUser().getEmail();
            this.userUsername = comment.getUser().getUsername();

            this.isAuthor = authorUserIdList.stream()
                    .anyMatch(t -> t == comment.getUser().getId());
            // for (Integer authorUserId : authorUserIdList ) {
            // if(comment.getUser().getId()==authorUserId){
            // this.isAuthor = true;
            // }
            // }

            this.isAdmin = comment.getUser().getUserTypeEnum() == UserTypeEnum.ADMIN ? true : false;

            this.reCommentList = comment.getReCommentList().stream()
                    .map(t -> new ReCommentDTO(t, sessionUserId)).collect(Collectors.toList());

            this.likeCommentCount = comment.getLikeCommentList().stream()
                    .map(t -> (t.getIsLike() == true) ? 1 : 0)
                    .reduce(0, (a, b) -> a + b);

            this.dislikeCommentCount = comment.getLikeCommentList().stream()
                    .map(t -> (t.getIsLike() == false) ? 1 : 0)
                    .reduce(0, (a, b) -> a + b);

            comment.getLikeCommentList().stream()
                    // .filter(likeComment -> likeComment.getUser().getId() == userId)
                    // .anyMatch(likeComment -> likeComment.getUser().getId() == userId);
                    .filter(likeComment -> likeComment.getUser().getId() == sessionUserId)
                    .findFirst()
                    // .map(likeComment -> likeComment.getIsLike() == true ? this.isMyLike=true :
                    // this.isMyDislike=true)
                    .ifPresent(likeComment -> {
                        if (likeComment.getIsLike() == true) {
                            this.isMyLike = true;
                        } else {
                            this.isMyDislike = true;
                        }
                    });

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

    @Getter
    @Setter
    @ToString
    
    public static class ReCommentDTO {
        private Integer id;
        private Integer commentId;
        private Boolean isDelete;
        private String text;
        private Timestamp createdAt;
        private Integer likeReCommentCount;
        private Integer dislikeReCommentCount;
        private Integer userId;
        private String userEmail;
        private String userUsername;
        private Boolean isMyLike = false;
        private Boolean isMyDislike = false;

        public ReCommentDTO(ReComment reComment, int sessionUserId) {
            this.id = reComment.getId();
            this.isDelete = reComment.getIsDelete();
            this.text = reComment.getText();
            this.createdAt = reComment.getCreatedAt();
            this.commentId = reComment.getComment().getId();

            this.userId = reComment.getUser().getId();
            this.userEmail = reComment.getUser().getEmail();
            this.userUsername = reComment.getUser().getUsername();

            this.likeReCommentCount = reComment.getLikeReCommentList().stream()
                    .map(t -> (t.getIsLike() == true) ? 1 : 0)
                    .reduce(0, (a, b) -> a + b);

            this.dislikeReCommentCount = reComment.getLikeReCommentList().stream()
                    .map(t -> (t.getIsLike() == false) ? 1 : 0)
                    .reduce(0, (a, b) -> a + b);

            reComment.getLikeReCommentList().stream()
                    .filter(likeReComment -> likeReComment.getUser().getId() == sessionUserId)
                    .findFirst()
                    .ifPresent(likeReComment -> {
                        if (likeReComment.getIsLike() == true) {
                            this.isMyLike = true;
                        } else {
                            this.isMyDislike = true;
                        }
                    });

        }
    }

}
