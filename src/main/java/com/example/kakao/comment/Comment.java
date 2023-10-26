package com.example.kakao.comment;

import com.example.kakao.entity.LikeComment;
import com.example.kakao.entity.ReComment;
import com.example.kakao.episode.Episode;
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
@Table(name = "comment_tb")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Episode episode;

    @OneToMany(mappedBy = "comment", fetch = FetchType.LAZY)
    private List<LikeComment> likeCommentList = new ArrayList<>();

    @OneToMany(mappedBy = "comment", fetch = FetchType.LAZY)
    private List<ReComment> reCommentList = new ArrayList<>();

    @ColumnDefault("false")
    private Boolean isDelete;

    @Column(length = 200, nullable = false)
    private String text;

    @CreationTimestamp
    private Timestamp createdAt;

    // 댓글은 수정 기능 없다
    // @UpdateTimestamp 
    // private Timestamp updatedAt;

    // 베스트댓글?


}
