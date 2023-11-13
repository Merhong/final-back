package com.example.kakao.admin;

import com.example.kakao._entity.enums.UserTypeEnum;
import com.example.kakao.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class AdminResponse {

    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    public static class LoginResponseDTO {
        private int id;
        private String email;
        private String username;
        private UserTypeEnum userTypeEnum;
        private Boolean isAuthor;
        
        public LoginResponseDTO(User user) {
            this.id = user.getId();
            this.email = user.getEmail();
            this.username = user.getUsername();
            this.userTypeEnum = user.getUserTypeEnum();
            this.isAuthor = user.getUserTypeEnum() == UserTypeEnum.AUTHOR ? true : false;
        }
    }
}
