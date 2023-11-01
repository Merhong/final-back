package com.example.kakao._entity;

import com.example.kakao.user.User;
import com.example.kakao.webtoon.Webtoon;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@ToString
@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "interest_webtoon_tb", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_id", "webtoon_id"})
})
public class InterestWebtoon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Webtoon webtoon;

    private Boolean isAlarm;

    @CreationTimestamp
    private Timestamp createdAt;

    @Builder
    public InterestWebtoon(int id, User user, Webtoon webtoon, Boolean isAlarm, Timestamp createdAt) {
        this.id = id;
        this.user = user;
        this.webtoon = webtoon;
        this.isAlarm = isAlarm;
        this.createdAt = createdAt;
    }


}
