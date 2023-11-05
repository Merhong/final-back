package com.example.kakao.author;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import com.example.kakao._entity.AuthorBoard;
import com.example.kakao._entity.enums.WebtoonSpeciallyEnum;
import com.example.kakao.user.User;

import java.util.List;


public class AuthorRequest {


    @Getter
    @Setter
    @ToString
    public static class CreateBoardDTO {

        @NotEmpty
        @Size(min = 1, max = 20, message = "1에서 20자 이내여야 합니다.")
        private String title;

        // @NotEmpty
        // @Size(min = 5, max = 500, message = "5에서 500자 이내여야 합니다.")
        private String text;

        private MultipartFile photo;

        // public AuthorBoard toEntity() {
        //     return AuthorBoard.builder()
        //             .title(title)
        //             .text(text)
        //             .build();
        // }
    }


    @Getter
    @Setter
    @ToString
    public static class CreateDTO {

        @Size(min = 1, max = 45, message = "45자 이내여야 합니다.")
        private String authorNickname; // 그냥 유저네임

        @NotEmpty
        private String authorPhoto;

        private String siteURL;
        
        private String introduce;

        @NotNull
        private int userId;

        public Author toEntity() {
            return Author.builder()
                    .authorNickname(authorNickname)
                    .authorPhoto(authorPhoto)
                    .siteURL(siteURL == null ? "https://naver.com" : siteURL)
                    .introduce(introduce)
                    .user(User.builder().id(userId).build())
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
