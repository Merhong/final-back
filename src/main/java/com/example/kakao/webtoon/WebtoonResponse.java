package com.example.kakao.webtoon;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

import com.example.kakao.Author.Author;
import com.example.kakao.episode.Episode;

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
        private String specially;
        private String weekDay;
        private List<String> authorNicknameList;

        public FindAllDTO(Webtoon webtoon) {
            this.id = webtoon.getId();
            this.title = webtoon.getTitle();
            this.starScore = webtoon.getStarScore();
            this.starCount = webtoon.getStarCount();
            this.image = webtoon.getImage();
            this.ageLimit = webtoon.getAgeLimit();
            this.specially = webtoon.getSpecially();
            this.weekDay = webtoon.getWeekDay();
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
        private String weekDay;
        private String specially;
        private Timestamp createdAt;
        private Timestamp updatedAt;
        private List<EpisodeDTO> episodeList;
        private List<AuthorDTO> authorList;


        public FindByIdDTO(Webtoon webtoon) {
            this.id = webtoon.getId();
            this.title = webtoon.getTitle();
            this.intro = webtoon.getIntro();
            this.starScore = webtoon.getStarScore();
            this.starCount = webtoon.getStarCount();
            this.image = webtoon.getImage();
            this.detailImage = webtoon.getDetailImage();
            this.ageLimit = webtoon.getAgeLimit();
            this.weekDay = webtoon.getWeekDay();
            this.specially = webtoon.getSpecially();
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
            private Double starCount;
            private Integer cookieCost;
            private Timestamp createdAt;

            EpisodeDTO(Episode episode) {
                
                this.episodeId = episode.getId();
                this.detailTitle = episode.getDetailTitle();
                this.thumbnail = episode.getThumbnail();
                this.starCount = episode.getStarCount();
                this.cookieCost = episode.getCookieCost();
                this.createdAt = episode.getCreatedAt();
            }
        }
    }







}