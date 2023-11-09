package com.example.kakao.admin;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception500;
import com.example.kakao._entity.enums.UserTypeEnum;
import com.example.kakao.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class AdminService {

    @Autowired
    private final AdminJPARepository adminJPARepository;


    public AdminResponse.LoginResponseDTO loginAdmin(AdminRequest.LoginDTO requestDTO) {
        User adminPS = adminJPARepository.findByEmailAndPassword(requestDTO.getEmail(), requestDTO.getPassword())
                .orElseThrow(() -> new Exception400("email이나 password가 틀림 : " + requestDTO.getEmail()));

        // String jwt = JwtTokenUtils.create(adminPS);
        // System.out.println("로그인시 JWT 토큰 발급!");

        AdminResponse.LoginResponseDTO responseDTO = new AdminResponse.LoginResponseDTO(adminPS);
        // responseDTO.setJwt(jwt);
        // System.out.println("JWT 토큰 : " + responseDTO.getJwt());

        return responseDTO;
    }

    @Transactional
    public void joinAdmin(AdminRequest.JoinDTO requestDTO) {
        try {
            User admin = requestDTO.toEntity();
            admin.setUserTypeEnum(UserTypeEnum.ADMIN); // 관리자페이지에서 가입하면 관리자

            adminJPARepository.save(admin);
            System.out.println("회원가입 완료됨!!!");

        } catch (Exception e) {
            throw new Exception500("unknown server error");
        }
    }
}
