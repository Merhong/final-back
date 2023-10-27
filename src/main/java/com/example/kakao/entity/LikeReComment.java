package com.example.kakao.entity;

import com.example.kakao.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "like_re_comment_tb", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_id", "re_comment_id"})
})
public class LikeReComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private ReComment reComment;

    // 본인껀 못하는 로직 필요
    private Boolean isLike; // true좋아요 / false 싫어요

    @CreationTimestamp
    private Timestamp createdAt;

}
