package com.example.kakao.admin;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception500;
import com.example.kakao._core.errors.exception.MyException;
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
        // 1. 통신 email과 password가 같은 유저를 들고온다.
        User user = adminJPARepository.findByEmailAndPassword(requestDTO.getEmail(), requestDTO.getPassword())
                .orElseThrow(() -> new Exception400("email이나 password가 틀림 : " + requestDTO.getEmail()));

        if (user.getEmail() == null) {
            throw new MyException("없는 이메일 입니다.");
        }
        // 패스워드 검증
        if (!user.getPassword().equals(requestDTO.getPassword())) {
            throw new MyException("패스워드가 잘못되었습니다!");
        }

        // 관리자 페이지는 웹 브라우저에서만 사용할거라 세션을 사용하면 된다. JWT 사용할 필요 없음.
        // String jwt = JwtTokenUtils.create(adminPS);
        // System.out.println("로그인시 JWT 토큰 발급!");

        AdminResponse.loginResponseDTO responseDTO = new AdminResponse.loginResponseDTO(user);
        // // 관리자 로그인시
        // if (user.getUserTypeEnum().equals("ADMIN")) {
        //     System.out.println("관리자 로그인!!!!!!");
        //     return responseDTO;
        // }
        // // 일반유저 or 작가 계정으로 로그인시
        // else {
        //     System.out.println("관리자 아님!!!!!!");
        //     throw new MyException("관리자 계정이 아닙니다." + responseDTO.getUserTypeEnum());
        // }

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
