package com.example.kakao.admin;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class AdminResponse {

    @Getter
    @Setter
    @ToString
    public static class adminLoginResponseDTO {
        private String jwt;

        public adminLoginResponseDTO(String jwt) {
            this.jwt = jwt;
        }
        
    }
    
}
