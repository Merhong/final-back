package com.example.kakao.webtoon;

import com.example.kakao._entity.*;
import com.example.kakao._entity.enums.HashTagEnum;
import com.example.kakao._entity.enums.WebtoonSpeciallyEnum;
import com.example.kakao.author.Author;
import com.example.kakao.episode.Episode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

public class WebtoonResponse {


    @Getter
    @Setter
    @ToString
    public static class CreateDTO {
        private Integer id;
        private String title;
        private String intro;
        private String image;
        private Integer ageLimit;
        private String webtoonWeekDayEnum;
        private WebtoonSpeciallyEnum webtoonSpeciallyEnum;
        private Timestamp createdAt;
        private Timestamp updatedAt;
        // private List<AuthorDTO> authorList;
        // private List<HashTagDTO> hashTagList;

        public CreateDTO(Webtoon webtoon) {
            this.id = webtoon.getId();
            this.title = webtoon.getTitle();
            this.intro = webtoon.getIntro();
            this.image = webtoon.getImage();
            this.ageLimit = webtoon.getAgeLimit();
            this.webtoonWeekDayEnum = webtoon.getWebtoonWeekDayEnum();
            this.webtoonSpeciallyEnum = webtoon.getWebtoonSpeciallyEnum();
            this.createdAt = webtoon.getCreatedAt();
            this.updatedAt = webtoon.getUpdatedAt();

            // this.authorList = webtoon.getWebtoonAuthorList().stream()
            //         .map(webtoonAuthor -> webtoonAuthor.getAuthor())
            //         .map(author -> new AuthorDTO(author))
            //         .collect(Collectors.toList());

            // this.hashTagList = webtoon.getWebtoonHashTagList().stream()
            //         .map(hashTag -> new HashTagDTO(hashTag))
            //         .collect(Collectors.toList());
        }

        // @Getter
        // @Setter
        // @ToString
        // class HashTagDTO {
        //     private int id;
        //     private HashTagEnum hashTagEnum;
        //     private String hashTagName;

        //     HashTagDTO(WebtoonHashTag webtoonHashTag) {
        //         this.id = webtoonHashTag.getId();
        //         this.hashTagEnum = webtoonHashTag.getHashTagEnum();
        //         this.hashTagName = webtoonHashTag.getHashTagName();
        //     }
        // }


        // @Getter
        // @Setter
        // @ToString
        // class AuthorDTO {
        //     private Integer id;
        //     private String authorNickname;
        //     private String authorPhoto;

        //     AuthorDTO(Author author) {
        //         this.id = author.getId();
        //         this.authorNickname = author.getAuthorNickname();
        //         this.authorPhoto = author.getAuthorPhoto();
        //     }
        // }

    }


    @ToString
    @Getter
    @Setter
    public static class RecentDTO {
        private int id;
        private int recentEpisodeId;
        private String recentEpisodeTitle;
        private String recentEpisodeThumbnail;
        private int webtoonId;
        private String webtoonTitle;
        private WebtoonSpeciallyEnum webtoonSpeciallyEnum;
        private Timestamp updatedAt;
        private Integer totalCount;
        private Integer viewCount;

        private Integer lastEpisodeId;
        private Integer firstEpisodeId;


        // private String webtoonImage; // 최근본웹툰이면 에피소드 하나는 무조건 본거니까 에피소드 사진으로

        public RecentDTO(RecentWebtoon recentWebtoon) {
            this.id = recentWebtoon.getId();

            Episode episode = recentWebtoon.getEpisode();
            this.recentEpisodeId = episode.getId();
            this.recentEpisodeTitle = episode.getDetailTitle();
            this.recentEpisodeThumbnail = episode.getThumbnail();

            Webtoon webtoon = recentWebtoon.getWebtoon();
            this.webtoonId = webtoon.getId();
            this.webtoonTitle = webtoon.getTitle();
            this.webtoonSpeciallyEnum = webtoon.getWebtoonSpeciallyEnum();

            this.updatedAt = recentWebtoon.getUpdatedAt();

            this.lastEpisodeId = webtoon.getEpisodeList().get(0).getId();
            this.firstEpisodeId = webtoon.getEpisodeList().get(webtoon.getEpisodeList().size() - 1).getId();
        }


    }


    @ToString
    @Getter
    @Setter
    public static class SearchDTO {
        private Integer id;
        private String title;
        private Double starScore;
        private Double starCount;
        private String image;
        // private Integer ageLimit;
        private WebtoonSpeciallyEnum webtoonSpeciallyEnum;
        // private String webtoonWeekDayEnum;
        private List<String> authorNicknameList;

        private Timestamp episodeUpdatedAt;

        public SearchDTO(Webtoon webtoon) {
            this.id = webtoon.getId();
            this.title = webtoon.getTitle();
            this.starScore = webtoon.getStarScore();
            this.starCount = webtoon.getStarCount();

            // this.image = webtoon.getEpisodeList().size() >= 1 ? webtoon.getEpisodeList().get(0).getThumbnail() : webtoon.getImage();
            this.image = webtoon.getImage();

            // this.ageLimit = webtoon.getAgeLimit();
            this.webtoonSpeciallyEnum = webtoon.getWebtoonSpeciallyEnum();
            // this.webtoonWeekDayEnum = webtoon.getWebtoonWeekDayEnum();
            // this.authorDTO = new AuthorDTO(webtoon.getAuthor());
            this.authorNicknameList = webtoon.getWebtoonAuthorList().stream()
                    .map(t -> t.getAuthor().getAuthorNickname())
                    .collect(Collectors.toList());

            this.episodeUpdatedAt = webtoon.getEpisodeList().size() != 0
                    ? webtoon.getEpisodeList().get(0).getCreatedAt()
                    : webtoon.getCreatedAt();
        }

    }


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
        // private String webtoonTitle;
        // private WebtoonSpeciallyEnum webtoonSpeciallyEnum;
        // private List<String> authorNicknameList;

        private Boolean isWebLink = true;

        public AdvertisingMainDTO(AdvertisingMain advertisingMain) {
            this.id = advertisingMain.getId();
            this.mainText = advertisingMain.getMainText();
            this.subText = advertisingMain.getSubText();
            this.photo = advertisingMain.getPhoto();
            this.createdAt = advertisingMain.getCreatedAt();
            this.updatedAt = advertisingMain.getUpdatedAt();
            this.endDate = advertisingMain.getEndDate();

            if (advertisingMain.getIsWebLink() == true) {
                this.isWebLink = true;
                this.linkURL = advertisingMain.getLinkURL();
            }

            if (advertisingMain.getIsWebLink() == false) {
                this.isWebLink = false;
                this.webtoonId = advertisingMain.getWebtoon().getId();
                // this.webtoonTitle = advertisingMain.getWebtoon().getTitle();
                // this.webtoonSpeciallyEnum = advertisingMain.getWebtoon().getWebtoonSpeciallyEnum();

                // this.authorNicknameList = advertisingMain.getWebtoon().getWebtoonAuthorList().stream()
                //         .map(t -> t.getAuthor().getAuthorNickname())
                //         .collect(Collectors.toList());
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

        private Boolean isInterest;


        public FindAllDTO(Webtoon webtoon, boolean isInterest) {
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

            this.isInterest = isInterest;
        }

    }



    @ToString
    @Getter
    @Setter
    public static class FindAllDTO2 {
        private Integer id;
        private String title;
        private Double starScore;
        private Double starCount;
        private String image;
        private Integer ageLimit;
        private WebtoonSpeciallyEnum webtoonSpeciallyEnum;
        private String webtoonWeekDayEnum;
        private List<AuthorDTO> authorDTOList;

        private Timestamp episodeUpdatedAt;

        private Boolean isInterest;


        public FindAllDTO2(Webtoon webtoon, boolean isInterest) {
            this.id = webtoon.getId();
            this.title = webtoon.getTitle();
            this.starScore = webtoon.getStarScore();
            this.starCount = webtoon.getStarCount();
            this.image = webtoon.getImage();
            this.ageLimit = webtoon.getAgeLimit();
            this.webtoonSpeciallyEnum = webtoon.getWebtoonSpeciallyEnum();
            this.webtoonWeekDayEnum = webtoon.getWebtoonWeekDayEnum();
            this.authorDTOList = webtoon.getWebtoonAuthorList().stream()
                    .map(t -> new AuthorDTO(t.getAuthor()))
                    .collect(Collectors.toList());

            this.episodeUpdatedAt = webtoon.getEpisodeList().size() != 0
                    ? webtoon.getEpisodeList().get(0).getCreatedAt()
                    : webtoon.getCreatedAt();

            this.isInterest = isInterest;
        }

        
        @Getter
        @Setter
        @ToString
        class AuthorDTO {
            private Integer id;
            private String authorNickname;
            private String authorPhoto;

            AuthorDTO(Author author) {
                this.id = author.getId();
                this.authorNickname = author.getAuthorNickname();
                this.authorPhoto = author.getAuthorPhoto();
            }
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
        // private String detailImage;
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
                    .map(otherWebtoon -> new FindAllDTO(otherWebtoon, false))
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
            private String authorPhoto;

            AuthorDTO(Author author) {
                this.id = author.getId();
                this.authorNickname = author.getAuthorNickname();
                this.authorPhoto = author.getAuthorPhoto();
            }
        }


        @Getter
        @Setter
        @ToString
        public static class EpisodeDTO { // TODO public static 
            private Integer episodeId;
            private String detailTitle;
            private String thumbnail;
            private String authorText;
            private Double starCount;
            private Double starScore;
            private Integer cookieCost;
            private Timestamp createdAt;
            private Timestamp updatedAt;
            private Boolean isView = false;
            private Boolean isLastView = false;

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
        private String intro;
        private Integer episodeCount;
        private List<String> authorNicknameList;

        public EndRecommendationDTO(Webtoon webtoon) {
            this.id = webtoon.getId();
            this.title = webtoon.getTitle();
            this.image = webtoon.getImage();
            this.intro = webtoon.getIntro();
            this.episodeCount = webtoon.getEpisodeList().size();
            this.intro = webtoon.getIntro();
            this.authorNicknameList = webtoon.getWebtoonAuthorList().stream()
                    .map(t -> t.getAuthor().getAuthorNickname())
                    .collect(Collectors.toList());
        }


    }


}