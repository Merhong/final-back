package com.example.kakao.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception500;
import com.example.kakao._core.utils.JwtTokenUtils;
import com.example.kakao.entity.enums.UserTypeEnum;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserJPARepository userJPARepository;

    @Transactional
    public void join(UserRequest.JoinDTO requestDTO) {
        try {
            User user = requestDTO.toEntity();
            user.setUserTypeEnum(UserTypeEnum.NORMAL); // 일반 가입창으로 가입하면 무조건 노말유저
            user.setCookie(0);
            userJPARepository.save(user);
        } catch (Exception e) {
            throw new Exception500("unknown server error");
        }
    }
    

    public UserResponse.loginResponseDTO login(UserRequest.LoginDTO requestDTO) {
        System.out.println("로그1");
        User userPS = userJPARepository.findByEmailAndPassword(requestDTO.getEmail(), requestDTO.getPassword())
            .orElseThrow(()-> new Exception400("email이나 password가 틀림 : "+requestDTO.getEmail()));
        
        System.out.println(userPS);

        String jwt = JwtTokenUtils.create(userPS);
        
        UserResponse.loginResponseDTO responseDTO = new UserResponse.loginResponseDTO(userPS);
        responseDTO.setJwt(jwt);

        System.out.println("로그2");

        return responseDTO;
    }

    @Transactional
    public UserResponse.updateResponseDTO update(UserRequest.updateDTO requestDTO, User sessionUser) {

        User user = userJPARepository.findById(sessionUser.getId())
        .orElseThrow(()-> new Exception400("오류 : "+requestDTO.getEmail()));
        
        System.out.println(requestDTO.getEmail() );
        System.out.println(sessionUser.getEmail() );
        if( !(requestDTO.getEmail().equals(sessionUser.getEmail())) ){
            throw new Exception400("로그인 유저랑 변경하려는 유저가 다름 : "+requestDTO.getEmail());
        }

        user.setUsername(requestDTO.getUsername());
        user.setPassword(requestDTO.getPassword());
        user.setCookie(requestDTO.getCookie());
        
        UserResponse.updateResponseDTO responseDTO = new UserResponse.updateResponseDTO(user);
        
        return responseDTO;
    }
}