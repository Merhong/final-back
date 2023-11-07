package com.example.kakao.admin;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception500;
import com.example.kakao._core.utils.JwtTokenUtils;
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


    public AdminResponse.loginResponseDTO loginAdmin(AdminRequest.LoginDTO requestDTO) {
        User adminPS = adminJPARepository.findByEmailAndPassword(requestDTO.getEmail(), requestDTO.getPassword())
                .orElseThrow(() -> new Exception400("email이나 password가 틀림 : " + requestDTO.getEmail()));

        String jwt = JwtTokenUtils.create(adminPS);

        AdminResponse.loginResponseDTO responseDTO = new AdminResponse.loginResponseDTO(adminPS);
        responseDTO.setJwt(jwt);

        return responseDTO;
    }

    @Transactional
    public void joinAdmin(AdminRequest.JoinDTO requestDTO) {
        try {
            User admin = requestDTO.toEntity();
            admin.setUserTypeEnum(UserTypeEnum.ADMIN); // 관리자페이지에서 가입하면 관리자

            adminJPARepository.save(admin);

        } catch (Exception e) {
            throw new Exception500("unknown server error");
        }
    }
}
