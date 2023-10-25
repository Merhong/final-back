package com.example.kakao.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.kakao.comment.Comment;
import com.example.kakao.episode.Episode;
import com.example.kakao.user.User;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="like_comment_tb")
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

    //두개 공통 중복이면 안되게 유니크 제약조건 필요

}
