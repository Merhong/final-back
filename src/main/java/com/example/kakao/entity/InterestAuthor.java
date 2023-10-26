package com.example.kakao.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.kakao.author.Author;
import com.example.kakao.user.User;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "interest_author_tb", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"user_id", "author_id"})
})
public class InterestAuthor{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Author author;

    private Boolean isAlarm;

    @CreationTimestamp
    private Timestamp createdAt;

    @Builder
    public InterestAuthor(int id, User user, Author author, Boolean isAlarm, Timestamp createdAt) {
        this.id = id;
        this.user = user;
        this.author = author;
        this.isAlarm = isAlarm;
        this.createdAt = createdAt;
    }

    
    
}
