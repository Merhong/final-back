package com.example.kakao.episode;

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


public class EpisodeRequest {


    
    @Getter
    @Setter
    @ToString
    public static class CreateDTO {

        @Size(min = 1, max = 45, message = "45자 이내여야 합니다.")
        private String detailTitle;
        
        private String authorText;
        
        private MultipartFile thumbnailPhoto;
        
        // @NotNull
        // private int webtoonId;
        private String webtoonTitle;

        // public Episode toEntity() {
        //     return Episode.builder()
        //             .detailTitle(detailTitle)
        //             // .authorPhoto(authorPhoto)
        //             // .siteURL(siteURL == null ? "https://naver.com" : siteURL)
        //             // .introduce(introduce)
        //             // .user(User.builder().id(userId).build())
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
