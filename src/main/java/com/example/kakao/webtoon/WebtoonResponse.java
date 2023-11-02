package com.example.kakao.webtoon;

import com.example.kakao._entity.AdvertisingMain;
import com.example.kakao._entity.AdvertisingSub;
import com.example.kakao._entity.InterestWebtoon;
import com.example.kakao._entity.WebtoonHashTag;
import com.example.kakao._entity.enums.HashTagEnum;
import com.example.kakao._entity.enums.WebtoonSpeciallyEnum;
import com.example.kakao.author.Author;
import com.example.kakao.episode.Episode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

public class WebtoonResponse {



    @ToString
    @Getter
    @Setter
    public static class AdvertisingSubDTO {
        private int id;
        private String photo;
        private String linkURL;
        private Timestamp createdAt;
        private Timestamp updatedAt;
        private Timestamp endDate;

        public AdvertisingSubDTO(AdvertisingSub advertisingSub) {
            this.id = advertisingSub.getId();
            this.photo = advertisingSub.getPhoto();
            this.linkURL = advertisingSub.getLinkURL();
            this.createdAt = advertisingSub.getCreatedAt();
            this.updatedAt = advertisingSub.getUpdatedAt();
            this.endDate = advertisingSub.getEndDate();
        }
    }



    @ToString
    @Getter
    @Setter
    public static class AdvertisingMainDTO {
        private int id;
        private String mainText;
        private String subText;
        private String photo;
        private String linkURL;
        private Timestamp createdAt;
        private Timestamp updatedAt;
        private Timestamp endDate;
        private int webtoonId;
        private String webtoonTitle;
        private WebtoonSpeciallyEnum webtoonSpeciallyEnum;
        private List<String> authorNicknameList;
        
        private Boolean isWebLink = true;

        public AdvertisingMainDTO(AdvertisingMain advertisingMain) {
            this.id = advertisingMain.getId();
            this.mainText = advertisingMain.getMainText();
            this.subText = advertisingMain.getSubText();
            this.photo = advertisingMain.getPhoto();
            this.linkURL = advertisingMain.getLinkURL();
            this.createdAt = advertisingMain.getCreatedAt();
            this.updatedAt = advertisingMain.getUpdatedAt();
            this.endDate = advertisingMain.getEndDate();

            if(advertisingMain.getIsWebLink()== false){
                this.isWebLink = false;
                this.webtoonId = advertisingMain.getWebtoon().getId();
                this.webtoonTitle = advertisingMain.getWebtoon().getTitle();
                this.webtoonSpeciallyEnum = advertisingMain.getWebtoon().getWebtoonSpeciallyEnum();
                
                this.authorNicknameList = advertisingMain.getWebtoon().getWebtoonAuthorList().stream()
                        .map(t -> t.getAuthor().getAuthorNickname())
                        .collect(Collectors.toList());
            }

        }
    }



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
        
        private Timestamp episodeUpdatedAt;

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
            this.authorNicknameList = webtoon.getWebtoonAuthorList().stream()
                    .map(t -> t.getAuthor().getAuthorNickname())
                    .collect(Collectors.toList());

            this.episodeUpdatedAt = webtoon.getEpisodeList().size() != 0
                ? webtoon.getEpisodeList().get(0).getCreatedAt()
                : webtoon.getCreatedAt();
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
        private Boolean isAlarm;
        private List<FindAllDTO> authorOtherWebtoonList;
        private List<HashTagDTO> hashTagList;

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
                    .map(webtoonAuthor -> webtoonAuthor.getAuthor())
                    .map(author -> new AuthorDTO(author))
                    .collect(Collectors.toList());

            this.episodeList = webtoon.getEpisodeList().stream()
                    .map(episode -> new EpisodeDTO(episode))
                    .collect(Collectors.toList());

            this.interestCount = webtoon.getInterstWebtoonList().size();

            this.authorOtherWebtoonList = webtoon.getWebtoonAuthorList().stream()
                    .map(webtoonAuthor -> webtoonAuthor.getAuthor())
                    .flatMap(author -> author.getWebtoonAuthorList().stream()) // 리스트의 여러 개를 스트림으로 합칠 때 flatMap
                    .map(webtoonAuthor -> webtoonAuthor.getWebtoon())
                    .distinct()
                    .filter(otherWebtoon -> otherWebtoon.getId() != webtoon.getId())
                    .map(otherWebtoon -> {
                        double totalStarCount = otherWebtoon.getEpisodeList().stream()
                                .map(episode -> episode.getStarCount())
                                .reduce(0.0, (a, b) -> a + b);
                        otherWebtoon.setStarCount(totalStarCount);
                        return otherWebtoon;
                    })
                    .map(otherWebtoon -> {
                        double totalStarScore = otherWebtoon.getEpisodeList().stream()
                                .map(episode -> episode.getStarScore())
                                .reduce(0.0, (a, b) -> a + b);
                        otherWebtoon.setStarScore(totalStarScore);
                        return otherWebtoon;
                    })
                    .map(otherWebtoon -> new FindAllDTO(otherWebtoon))
                    .collect(Collectors.toList());
            
            this.hashTagList = webtoon.getWebtoonHashTagList().stream()
                    .map(hashTag -> new HashTagDTO(hashTag))
                    .collect(Collectors.toList());
        }




        @Getter
        @Setter
        @ToString
        class HashTagDTO {
            private int id;
            private HashTagEnum hashTagEnum;
            private String hashTagName;

            HashTagDTO(WebtoonHashTag webtoonHashTag) {
                this.id = webtoonHashTag.getId();
                this.hashTagEnum = webtoonHashTag.getHashTagEnum();
                this.hashTagName = webtoonHashTag.getHashTagName();
            }
        }


        // @Getter
        // @Setter
        // @ToString
        // class otherWebtoonDTO {
        //     private Integer id;
        //     private String title;
        //     private String image;
        //     private List<String> authorNicknameList;

        //     otherWebtoonDTO(Webtoon webtoon) {
        //         this.id = webtoon.getId();
        //         this.title = webtoon.getTitle();
        //         this.image = webtoon.getImage();
        //         this.authorNicknameList = webtoon.getWebtoonAuthorList().stream()
        //                 .map(t -> t.getAuthor().getAuthorNickname())
        //                 .collect(Collectors.toList());
        //     }
        // }


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

    @Getter
    @Setter
    @ToString
    public static class EndRecommendationDTO {
        private Integer id;
        private String title;
        private String image;
        private Integer episodeCount;
        private List<String> authorNicknameList;

        public EndRecommendationDTO(Webtoon webtoon) {
            this.id = webtoon.getId();
            this.title = webtoon.getTitle();
            this.image = webtoon.getImage();
            this.episodeCount = webtoon.getEpisodeList().size();
            this.authorNicknameList = webtoon.getWebtoonAuthorList().stream()
                    .map(t -> t.getAuthor().getAuthorNickname())
                    .collect(Collectors.toList());
        }


    }


}