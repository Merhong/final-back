package com.example.kakao.entity;

import com.example.kakao.author.Author;
import com.example.kakao.user.User;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "interest_author_tb", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_id", "author_id"})
})
public class InterestAuthor {

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
