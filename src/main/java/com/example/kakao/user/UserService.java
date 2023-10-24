package com.example.kakao.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception500;
import com.example.kakao._core.utils.JwtTokenUtils;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserJPARepository userJPARepository;

    @Transactional
    public void join(UserRequest.JoinDTO requestDTO) {
        try {
            userJPARepository.save(requestDTO.toEntity());
        } catch (Exception e) {
            throw new Exception500("unknown server error");
        }
    }

    public UserResponse.loginResponseDTO login(UserRequest.LoginDTO requestDTO) {
        User userPS = userJPARepository.findByEmailAndPassword(requestDTO.getEmail(), requestDTO.getPassword())
            .orElseThrow(()-> new Exception400("email이나 password가 틀림 : "+requestDTO.getEmail()));
        
        System.out.println(userPS);

        String jwt = JwtTokenUtils.create(userPS);
        
        UserResponse.loginResponseDTO responseDTO = new UserResponse.loginResponseDTO(userPS);
        responseDTO.setJwt(jwt);

        return responseDTO;
    }

    @Transactional
    public UserResponse.updateResponseDTO update(UserRequest.updateDTO requestDTO, User sessionUser) {

        User user = userJPARepository.findById(sessionUser.getId())
        .orElseThrow(()-> new Exception400("오류 : "+requestDTO.getEmail()));
        
        user.setUsername(requestDTO.getUsername());
        user.setPassword(requestDTO.getPassword());
        user.setCookie(requestDTO.getCookie());
        
        UserResponse.updateResponseDTO responseDTO = new UserResponse.updateResponseDTO(user);
        
        return responseDTO;
    }
}