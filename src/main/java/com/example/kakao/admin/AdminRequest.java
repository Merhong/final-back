package com.example.kakao.admin;

import com.example.kakao.user.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.*;

public class AdminRequest {
    @Getter
    @Setter
    @ToString
    public static class JoinDTO {

        @NotEmpty
        @Pattern(regexp = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", message = "이메일 형식으로 작성해주세요")
        private String email;

        @NotEmpty
        @Size(min = 4, max = 20, message = "4에서 20자 이내여야 합니다.")
        // @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@#$%^&+=!~`<>,./?;:'\"\\[\\]{}\\\\()|_-])\\S*$", message = "영문, 숫자, 특수문자가 포함되어야하고 공백이 포함될 수 없습니다.")
        private String password;

        @NotEmpty
        private String username;

        public User toEntity() {
            return User.builder()
                    .email(email)
                    .password(password)
                    .username(username)
                    .build();
        }
    }

    @Getter
    @Setter
    @ToString
    public static class LoginDTO {
        @NotEmpty
        @Pattern(regexp = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", message = "이메일 형식으로 작성해주세요")
        private String email;

        @NotEmpty
        @Size(min = 4, max = 20, message = "4에서 20자 이내여야 합니다.")
        // @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@#$%^&+=!~`<>,./?;:'\"\\[\\]{}\\\\()|_-])\\S*$", message = "영문, 숫자, 특수문자가 포함되어야하고 공백이 포함될 수 없습니다.")
        private String password;
    }

    @Getter
    @Setter
    @ToString
    public static class UpdateDTO {

        @NotEmpty
        private String email;

        @NotEmpty
        @Size(min = 4, max = 20, message = "4에서 20자 이내여야 합니다.")
        // @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@#$%^&+=!~`<>,./?;:'\"\\[\\]{}\\\\()|_-])\\S*$", message = "영문, 숫자, 특수문자가 포함되어야하고 공백이 포함될 수 없습니다.")
        private String password;

        @NotEmpty
        @Pattern(regexp = "^[a-zA-Z0-9가-힣]+$", message = "한글, 영어, 숫자만 가능합니다.")
        @Size(min = 1, max = 8, message = "8글자 이내여야 합니다.")
        private String username;

        @Min(0)
        @Max(10000)
        @NotNull
        private Integer cookie;

    }


}

