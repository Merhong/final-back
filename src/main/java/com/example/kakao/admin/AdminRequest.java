package com.example.kakao.admin;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class AdminRequest {

    @Getter
    @Setter
    @ToString
    public static class AdminLoginRequestDTO {
        
        @NotEmpty
        @Email
        private String email;

        @NotEmpty
        private String password;

    }

    
}
    

