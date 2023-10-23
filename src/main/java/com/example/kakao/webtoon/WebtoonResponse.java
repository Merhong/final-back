package com.example.kakao.webtoon;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.example.kakao.Author.Author;
import com.example.kakao.episode.Episode;
import com.example.kakao.product.Product;
import com.example.kakao.product.option.Option;
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
        private AuthorDTO authorDTO;
        private String weekDay;
        private String specially;
        private Double starCount;
        private String image;
        private Integer age;

        public FindAllDTO(Webtoon webtoon) {
            this.id = webtoon.getId();
            this.title = webtoon.getTitle();
            this.starCount = webtoon.getStarCount();
            this.weekDay = webtoon.getWeekDay();
            this.specially = webtoon.getSpecially();
            this.image = webtoon.getImage();
            this.age = webtoon.getAge();
            this.authorDTO = new AuthorDTO(webtoon.getAuthor());
        }

        @Getter
        @Setter
        @ToString
        class AuthorDTO {
            private Integer id;
            private String authorname;

            AuthorDTO(Author author) {
                this.id = author.getId();
                this.authorname = author.getAuthorname();
            }
        }


    }


    // (기능2) 상품 상세보기
    @Getter
    @Setter
    @ToString
    public static class FindByIdDTO {
        private Integer id;
        private String title;
        private Double starCount;
        private String image;
        private Integer age;
        private String weekDay;
        private String specially;
        private String intro;
        private Integer likeCount;
        private String hashtag;
        private AuthorDTO authorDTO;
        private List<EpisodeDTO> episodeList;


        public FindByIdDTO(Webtoon webtoon) {
            this.id = webtoon.getId();
            this.title = webtoon.getTitle();
            this.starCount = webtoon.getStarCount();
            this.image = webtoon.getImage();
            this.age = webtoon.getAge();
            this.weekDay = webtoon.getWeekDay();
            this.specially = webtoon.getSpecially();
            this.intro = webtoon.getIntro();
            this.likeCount = webtoon.getLikeCount();
            this.hashtag = webtoon.getHashtag();
            this.authorDTO = new AuthorDTO(webtoon.getAuthor());
        
            this.episodeList = webtoon.getEpisodeList().stream()
                    .map(episode -> new EpisodeDTO(episode))
                    .collect(Collectors.toList());
        }
        @Getter
        @Setter
        @ToString
        class AuthorDTO {
            private Integer id;
            private String authorname;

            AuthorDTO(Author author) {
                this.id = author.getId();
                this.authorname = author.getAuthorname();
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











    // 상품조회 + 옵션조회
    @Getter
    @Setter
    public static class FindByIdV1DTO {
        private Integer productId;
        private String productName;
        private String productImage;
        private Integer productPrice;
        private Integer productStartCount;
        private List<OptionDTO> options;

        public FindByIdV1DTO(Product product, List<Option> options) {
            this.productId = product.getId();
            this.productName = product.getProductName();
            this.productImage = product.getImage();
            this.productPrice = product.getPrice();
            this.productStartCount = 5;
            this.options = options.stream()
                    .map(o -> new OptionDTO(o))
                    .collect(Collectors.toList());
        }

        @Getter
        @Setter
        class OptionDTO {
            private Integer optionId;
            private String optionName;
            private Integer optionPrice;

            OptionDTO(Option option) {
                this.optionId = option.getId();
                this.optionName = option.getOptionName();
                this.optionPrice = option.getPrice();
            }
        }
    }

    // 양방향 매핑
    @Getter
    @Setter
    public static class FindByIdV2DTO {
        private Integer productId;
        private String productName;
        private String productImage;
        private Integer productPrice;
        private Integer productStartCount;
        private List<OptionDTO> options;

        public FindByIdV2DTO(Product product) {
            this.productId = product.getId();
            this.productName = product.getProductName();
            this.productImage = product.getImage();
            this.productPrice = product.getPrice();
            this.productStartCount = 5;
            System.out.println("이제 Lazy Loading 한다 =================");
            this.options = product.getOptions().stream()
                    .map(o -> new OptionDTO(o))
                    .collect(Collectors.toList());
        }

        @Getter
        @Setter
        class OptionDTO {
            private Integer optionId;
            private String optionName;
            private Integer optionPrice;

            OptionDTO(Option option) {
                System.out.println("이제 Lazy Loading 시작됨 =========");
                this.optionId = option.getId();
                this.optionName = option.getOptionName();
                this.optionPrice = option.getPrice();
            }
        }
    }

    // 옵션만 조회
    @Getter
    @Setter
    public static class FindByIdV3DTO {
        private Integer productId;
        private String productName;
        private String productImage;
        private Integer productPrice;
        private Integer productStartCount;
        private List<OptionDTO> options;

        public FindByIdV3DTO(List<Option> options) {
            System.out.println("이제 Lazy 시작한다???????????????????????");
            this.productId = options.get(0).getProduct().getId();
            this.productName = options.get(0).getProduct().getProductName();
            this.productImage = options.get(0).getProduct().getImage();
            this.productPrice = options.get(0).getProduct().getPrice();
            this.productStartCount = 5;
            this.options = options.stream()
                    .map(o -> new OptionDTO(o))
                    .collect(Collectors.toList());
        }

        @Getter
        @Setter
        class OptionDTO {
            private Integer optionId;
            private String optionName;
            private Integer optionPrice;

            OptionDTO(Option option) {
                this.optionId = option.getId();
                this.optionName = option.getOptionName();
                this.optionPrice = option.getPrice();
            }
        }
    }
}