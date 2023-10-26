package com.example.kakao.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.kakao.comment.Comment;
import com.example.kakao.episode.Episode;
import com.example.kakao.user.User;

@ToString
@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "like_comment_tb", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"user_id", "comment_id"})
})
public class LikeComment{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Comment comment;

    // 본인껀 못하는 로직 필요
    private Boolean isLike; // true좋아요 / false 싫어요

    @CreationTimestamp
    private Timestamp createdAt;



    @Builder
    public LikeComment(int id, User user, Comment comment, Boolean isLike, Timestamp createdAt) {
        this.id = id;
        this.user = user;
        this.comment = comment;
        this.isLike = isLike;
        this.createdAt = createdAt;
    }

    
}
