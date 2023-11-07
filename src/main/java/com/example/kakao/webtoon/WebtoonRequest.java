package com.example.kakao.webtoon;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import com.example.kakao._core.errors.exception.Exception404;
import com.example.kakao._entity.AdvertisingMain;
import com.example.kakao._entity.AdvertisingSub;
import com.example.kakao._entity.enums.WebtoonSpeciallyEnum;

import java.util.List;


public class WebtoonRequest {






    @Getter
    @Setter
    @ToString
    public static class AdvertisingSubDTO {

        private String linkURL;
    
        private MultipartFile photo;
    

        // public AdvertisingSub toEntity() {
            // return AdvertisingSub.builder()
            //         .build();
        // }
    }




    @Getter
    @Setter
    @ToString
    public static class AdvertisingMainDTO {

        private Boolean isWebLink;

        private Integer webtoonId;

        private String linkURL;

        private String mainText;

        private String subText;
    
        private MultipartFile photo;
    

        // public AdvertisingMain toEntity() {
        //     return AdvertisingMain.builder()
        //             .isWebLink(isWebLink)
        //             .build();
        // }
    }





    @Getter
    @Setter
    @ToString
    public static class CreateDTO {

        @NotEmpty
        private List<Integer> authorIdList;

        @Size(min = 1, max = 30, message = "30자 이내여야 합니다.")
        private String title;

        @Size(min = 1, max = 300, message = "300자 이내여야 합니다.")
        private String intro; // 소개글

        // @NotEmpty
        private MultipartFile image;

        @Min(0)
        @Max(20)
        private Integer ageLimit;

        @Size(min = 1, max = 5, message = "월화수목금토일 중에서 여러개가능")
        private String webtoonWeekDayEnum;

        // @Size(min = 1, max = 2, message = "없음, 휴재, 완결, 무료, 순위, 신작 중에서")
        @Pattern(regexp = "없음|휴재|완결|무료|순위|신작", message = "없음, 휴재, 완결, 무료, 순위, 신작 중에서")
        private String webtoonSpeciallyEnum;


        public Webtoon toEntity() {
            return Webtoon.builder()
                    .title(title)
                    .intro(intro)
                    // .image(image)
                    .ageLimit(ageLimit)
                    .webtoonWeekDayEnum(webtoonWeekDayEnum)
                    .webtoonSpeciallyEnum(WebtoonSpeciallyEnum.valueOf(webtoonSpeciallyEnum))
                    // .webtoonAuthorList() // 로직 필요
                    .build();
        }
    }


    // @Getter
    // @Setter
    // @ToString
    // public static class LoginDTO {
    //     @NotEmpty
    //     @Pattern(regexp = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", message = "이메일 형식으로 작성해주세요")
    //     private String email;

    //     @NotEmpty
    //     @Size(min = 4, max = 20, message = "4에서 20자 이내여야 합니다.")
    //     // @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@#$%^&+=!~`<>,./?;:'\"\\[\\]{}\\\\()|_-])\\S*$", message = "영문, 숫자, 특수문자가 포함되어야하고 공백이 포함될 수 없습니다.")
    //     private String password;
    // }

    // @Getter
    // @Setter
    // @ToString
    // public static class updateDTO {

    //     @NotEmpty
    //     private String email;

    //     @NotEmpty
    //     @Size(min = 4, max = 20, message = "4에서 20자 이내여야 합니다.")
    //     // @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@#$%^&+=!~`<>,./?;:'\"\\[\\]{}\\\\()|_-])\\S*$", message = "영문, 숫자, 특수문자가 포함되어야하고 공백이 포함될 수 없습니다.")
    //     private String password;

    //     @NotEmpty
    //     @Pattern(regexp = "^[a-zA-Z0-9가-힣]+$", message = "한글, 영어, 숫자만 가능합니다.")
    //     @Size(min = 1, max = 8, message = "8글자 이내여야 합니다.")
    //     private String username;

    //     @Min(0)
    //     @Max(10000)
    //     @NotNull
    //     private Integer cookie;

    // }


}
