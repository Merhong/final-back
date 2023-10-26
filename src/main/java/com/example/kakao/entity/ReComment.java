package com.example.kakao.entity;

import com.example.kakao.comment.Comment;
import com.example.kakao.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "re_comment_tb")
public class ReComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Comment comment;

    @OneToMany(mappedBy = "reComment", fetch = FetchType.LAZY)
    private List<LikeReComment> likeReCommentList = new ArrayList<>();

    @ColumnDefault("false")
    private Boolean isDelete;

    @Column(length = 200, nullable = false)
    private String text;

    @CreationTimestamp
    private Timestamp createdAt;

    // 댓글은 수정 기능 없다
    // @UpdateTimestamp 
    // private Timestamp updatedAt;


}
