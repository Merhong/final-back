package com.example.kakao.webtoon;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.annotations.CreationTimestamp;

import com.example.kakao.author.Author;
import com.example.kakao.entity.InterestWebtoon;
import com.example.kakao.entity.enums.WebtoonSpeciallyEnum;
import com.example.kakao.episode.Episode;
import com.example.kakao.user.User;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class WebtoonResponse {

    @ToString
    @Getter
    @Setter
    public static class FindAllDTO {
        private Integer id;
        private String title;
        private Double starScore;
        private Double starCount;
        private String image;
        private Integer ageLimit;
        private WebtoonSpeciallyEnum webtoonSpeciallyEnum;
        private String webtoonWeekDayEnum;
        private List<String> authorNicknameList;

        public FindAllDTO(Webtoon webtoon) {
            this.id = webtoon.getId();
            this.title = webtoon.getTitle();
            this.starScore = webtoon.getStarScore();
            this.starCount = webtoon.getStarCount();
            this.image = webtoon.getImage();
            this.ageLimit = webtoon.getAgeLimit();
            this.webtoonSpeciallyEnum = webtoon.getWebtoonSpeciallyEnum();
            this.webtoonWeekDayEnum = webtoon.getWebtoonWeekDayEnum();
            // this.authorDTO = new AuthorDTO(webtoon.getAuthor());
            this.authorNicknameList = webtoon.getWebtoonAuthorList()
                    .stream().map(t -> t.getAuthor().getAuthorNickname())
                    .collect(Collectors.toList());
        }

    }


    @Getter
    @Setter
    @ToString
    public static class FindByIdDTO {
        private Integer id;
        private String title;
        private String intro;
        private Double starScore;
        private Double starCount;
        private String image;
        private String detailImage;
        private Integer ageLimit;
        private String webtoonWeekDayEnum;
        private WebtoonSpeciallyEnum webtoonSpeciallyEnum;
        private Timestamp createdAt;
        private Timestamp updatedAt;
        private List<EpisodeDTO> episodeList;
        private List<AuthorDTO> authorList;
        private Integer interestCount;
        private Boolean isInterest;


        public FindByIdDTO(Webtoon webtoon) {
            this.id = webtoon.getId();
            this.title = webtoon.getTitle();
            this.intro = webtoon.getIntro();
            this.starScore = webtoon.getStarScore();
            this.starCount = webtoon.getStarCount();
            this.image = webtoon.getImage();
            this.detailImage = webtoon.getDetailImage();
            this.ageLimit = webtoon.getAgeLimit();
            this.webtoonWeekDayEnum = webtoon.getWebtoonWeekDayEnum();
            this.webtoonSpeciallyEnum = webtoon.getWebtoonSpeciallyEnum();
            this.createdAt = webtoon.getCreatedAt();
            this.updatedAt = webtoon.getUpdatedAt();
            // this.authorDTO = new AuthorDTO(webtoon.getAuthor());
            // this.authorList = webtoon.getAuthor()
        
            this.authorList = webtoon.getWebtoonAuthorList().stream()
                    .map( webtoonAuthor -> webtoonAuthor.getAuthor() )
                    .map( author -> new AuthorDTO(author) )
                    .collect(Collectors.toList());

            this.episodeList = webtoon.getEpisodeList().stream()
                    .map( episode -> new EpisodeDTO(episode) )
                    .collect(Collectors.toList());
            
            this.interestCount = webtoon.getInterstWebtoonList().size();

        }


        @Getter
        @Setter
        @ToString
        class AuthorDTO {
            private Integer id;
            private String authorNickname;

            AuthorDTO(Author author) {
                this.id = author.getId();
                this.authorNickname = author.getAuthorNickname();
            }
        }


        @Getter
        @Setter
        @ToString
        class EpisodeDTO {
            private Integer episodeId;
            private String detailTitle;
            private String thumbnail;
            private String authorText;
            private Double starCount;
            private Double starScore;
            private Integer cookieCost;
            private Timestamp createdAt;
            private Timestamp updatedAt;

            EpisodeDTO(Episode episode) {
                
                this.episodeId = episode.getId();
                this.detailTitle = episode.getDetailTitle();
                this.thumbnail = episode.getThumbnail();
                this.authorText = episode.getAuthorText();
                this.starCount = episode.getStarCount();
                this.starScore = episode.getStarScore();
                this.cookieCost = episode.getCookieCost();
                this.createdAt = episode.getCreatedAt();
                this.updatedAt = episode.getUpdatedAt();
            }
        }
    }





    @Getter
    @Setter
    @ToString
    public static class InterestDTO {
        private int id;
        private Boolean isAlarm;
        private Timestamp createdAt;
        private int userId;
        private int webtoonId;
        private int webtoonTotalInterest;


        public InterestDTO(InterestWebtoon iw, int webtoonTotalInterest) {
            this.id = iw.getId();
            this.isAlarm = iw.getIsAlarm();
            this.createdAt = iw.getCreatedAt();
            this.userId = iw.getUser().getId();
            this.webtoonId = iw.getWebtoon().getId();
            this.webtoonTotalInterest = webtoonTotalInterest;
        }

        
    }


}