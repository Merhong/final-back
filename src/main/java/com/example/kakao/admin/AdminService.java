package com.example.kakao.admin;

import org.springframework.stereotype.Service;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception401;
import com.example.kakao._core.utils.JwtTokenUtils;
import com.example.kakao.admin.AdminRequest.AdminLoginRequestDTO;
import com.example.kakao.admin.AdminResponse.adminLoginResponseDTO;
import com.example.kakao.entity.enums.UserTypeEnum;
import com.example.kakao.user.User;
import com.example.kakao.user.UserJPARepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AdminService {

    private final UserJPARepository userRepository;

    public adminLoginResponseDTO adminLogin(AdminLoginRequestDTO dto) {

       User user = userRepository.findByEmailAndPassword(dto.getEmail(),dto.getPassword())
                .orElseThrow(() -> new Exception400("email이나 password가 틀림 : " + dto.getEmail()));

       if (user != null && user.getUserTypeEnum() == UserTypeEnum.ADMIN) {
         String jwt = JwtTokenUtils.create(user);

         AdminResponse.adminLoginResponseDTO responseDTO = new AdminResponse.adminLoginResponseDTO(jwt);
         return responseDTO;
       } else {
         
        throw new Exception401("관리자가 아닙니다");
        

       }

        
    }
    
}
