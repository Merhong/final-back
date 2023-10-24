package com.example.kakao.comment;

import lombok.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;

import com.example.kakao.episode.Episode;
import com.example.kakao.user.User;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="comment_tb")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Episode episode;
    
    @Column(length = 200, nullable = false)
    private String content;

    private Timestamp createdAt;

    private Timestamp updatedAt;

    // 베스트댓글?
    

}
