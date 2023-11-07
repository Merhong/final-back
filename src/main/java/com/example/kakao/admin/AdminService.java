package com.example.kakao.admin;

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

    @org.springframework.transaction.annotation.Transactional
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
