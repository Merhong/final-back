package com.example.kakao.author;

import com.example.kakao._entity.AuthorBoard;
import com.example.kakao._entity.WebtoonAuthor;
import com.example.kakao.user.User;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "author_tb")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private User user;

    private String authorNickname;

    private String authorPhoto;

    private String siteURL;

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<WebtoonAuthor> webtoonAuthorList = new ArrayList<>();

    @OrderBy("createdAt DESC") // 최근 순서대로 정렬
    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<AuthorBoard> authorBoardList = new ArrayList<>();


    @Builder
    public Author(int id, User user, String authorNickname, String authorPhoto, String siteURL, Timestamp createdAt,
                  Timestamp updatedAt, List<WebtoonAuthor> webtoonAuthorList) {
        this.id = id;
        this.user = user;
        this.authorNickname = authorNickname;
        this.authorPhoto = authorPhoto;
        this.siteURL = siteURL;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.webtoonAuthorList = webtoonAuthorList;
    }


}
