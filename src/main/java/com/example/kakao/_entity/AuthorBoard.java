package com.example.kakao._entity;

import com.example.kakao.author.Author;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;


@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "author_board_tb")
public class AuthorBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Author author;

    private String title;

    private String text;

    private String photo;

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;



    @Builder
    public AuthorBoard(int id, Author author, String title, String text, String photo, Timestamp createdAt,
            Timestamp updatedAt) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.text = text;
        this.photo = photo;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    

}
