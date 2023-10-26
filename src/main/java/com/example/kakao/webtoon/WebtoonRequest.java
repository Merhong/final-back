package com.example.kakao.webtoon;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;


public class WebtoonRequest {
    @Getter
    @Setter
    @ToString
    public static class CreateDTO {

        @NotEmpty
        private List<Integer> AuthorIdList;

        @Size(min = 1, max = 100, message = "100자 이내여야 합니다.")
        private String title;

        @Size(min = 1, max = 500, message = "500자 이내여야 합니다.")
        private String intro; // 소개글

        @NotEmpty
        private String image;

        private String detailImage;

        @NotEmpty
        private Integer ageLimit;

        @Size(min = 1, max = 5, message = "요일")
        private String weekDay;

        @Size(min = 2, max = 2, message = "휴재, 완결, 무료, 순위, 신작.")
        private String specially;


        // public Webtoon toEntity() {
        //     return Webtoon.builder()
        //             .email(email)
        //             .password(password)
        //             .username(username)
        //             .build();
        // }
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
