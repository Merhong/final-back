package com.example.kakao.user;

import com.example.kakao.entity.enums.UserTypeEnum;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class UserResponse {

    @Getter @Setter
    public static class FindById{
        private int id;
        private String username;
        private String email;

        public FindById(User user) {
            this.id = user.getId();
            this.username = user.getUsername();
            this.email = user.getEmail();
        }
    }
    
    @Getter @Setter @ToString
    public static class loginResponseDTO{
        private int id;
        private String email;
        private String username;
        private String jwt;
        // private Boolean isAdmin;
        // private Boolean isAuthor;
        private UserTypeEnum userTypeEnum;
        private Integer cookie;
        private String photo;
    

        public loginResponseDTO(User user) {
            this.id = user.getId();
            this.email = user.getEmail();
            this.username = user.getUsername();
            this.userTypeEnum = user.getUserTypeEnum();
            // this.isAdmin = user.getIsAdmin();
            // this.isAuthor = user.getIsAuthor();
            this.cookie = user.getCookie();
            this.photo = user.getPhoto();
        }
    }

    
    @Getter @Setter @ToString
    public static class updateResponseDTO{
        private int id;
        private String password;
        private String email;
        private String username;
        private Integer cookie;

        public updateResponseDTO(User user) {
            this.id = user.getId();
            this.password = user.getPassword();
            this.email = user.getEmail();
            this.username = user.getUsername();
            this.cookie = user.getCookie();
        }
    }

}
