package com.example.kakao.user;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception500;
import com.example.kakao._core.utils.JwtTokenUtils;
import com.example.kakao.entity.InterestWebtoon;
import com.example.kakao.entity.enums.UserTypeEnum;
import com.example.kakao.repository.InterestWebtoonRepository;
import com.example.kakao.user.UserResponse.InterestWebtoonDTO;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserJPARepository userJPARepository;
    private final InterestWebtoonRepository interestWebtoonRepository;





    // 관심웹툰알람끄기
    @Transactional
    public UserResponse.InterestWebtoonDTO interestAlarmOff(int userId, int webtoonId) {

        List<InterestWebtoon> interestWebtoonList = interestWebtoonRepository.findByUserIdAndWebtoonId(userId, webtoonId);

        if (interestWebtoonList.size() != 1) {
            throw new Exception400("관심웹툰이아닌데");
        }

        InterestWebtoon interestWebtoon = interestWebtoonList.get(0);

        if(interestWebtoon.getIsAlarm() == false){
            throw new Exception400("이미알람끄져있음");
        }

        interestWebtoon.setIsAlarm(false);

        UserResponse.InterestWebtoonDTO responseDTO = new UserResponse.InterestWebtoonDTO(interestWebtoon);
        return responseDTO;
    }

    // 관심웹툰알람켜기
    @Transactional
    public UserResponse.InterestWebtoonDTO interestAlarmOn(int userId, int webtoonId) {

        List<InterestWebtoon> interestWebtoonList = interestWebtoonRepository.findByUserIdAndWebtoonId(userId, webtoonId);

        if (interestWebtoonList.size() != 1) {
            throw new Exception400("관심웹툰이아닌데");
        }

        InterestWebtoon interestWebtoon = interestWebtoonList.get(0);

        if(interestWebtoon.getIsAlarm() == true){
            throw new Exception400("이미알람켜져있음");
        }

        interestWebtoon.setIsAlarm(true);

        UserResponse.InterestWebtoonDTO responseDTO = new UserResponse.InterestWebtoonDTO(interestWebtoon);
        return responseDTO;
    }


    
    // 관심웹툰목록
    public List<UserResponse.InterestWebtoonDTO> interest(int userId) {

        List<InterestWebtoon> interestWeboonList = interestWebtoonRepository.findByUserId(userId);
        List<UserResponse.InterestWebtoonDTO> responseDTOList = interestWeboonList.stream()
                .map(t -> new UserResponse.InterestWebtoonDTO(t))
                .collect(Collectors.toList());

        return responseDTOList;
    }




    @Transactional
    public void join(UserRequest.JoinDTO requestDTO) {
        try {
            User user = requestDTO.toEntity();
            user.setUserTypeEnum(UserTypeEnum.NORMAL); // 일반 가입창으로 가입하면 무조건 노말유저

            user.setCookie(0); // 가입하면 기본 쿠키 무조건 0

            userJPARepository.save(user);
        } catch (Exception e) {
            throw new Exception500("unknown server error");
        }
    }


    public UserResponse.loginResponseDTO login(UserRequest.LoginDTO requestDTO) {
        System.out.println("로그1");
        User userPS = userJPARepository.findByEmailAndPassword(requestDTO.getEmail(), requestDTO.getPassword())
                .orElseThrow(() -> new Exception400("email이나 password가 틀림 : " + requestDTO.getEmail()));
        // System.out.println("테스트"+userPS); // onetown author 있으면 무한참조오류

        String jwt = JwtTokenUtils.create(userPS);

        UserResponse.loginResponseDTO responseDTO = new UserResponse.loginResponseDTO(userPS);
        responseDTO.setJwt(jwt);

        System.out.println("로그2");

        return responseDTO;
    }

    @Transactional
    public UserResponse.updateResponseDTO update(UserRequest.UpdateDTO requestDTO, User sessionUser) {

        User user = userJPARepository.findById(sessionUser.getId())
                .orElseThrow(() -> new Exception400("오류 : " + requestDTO.getEmail()));

        System.out.println(requestDTO.getEmail());
        System.out.println(sessionUser.getEmail());
        if (!(requestDTO.getEmail().equals(sessionUser.getEmail()))) {
            throw new Exception400("로그인 유저랑 변경하려는 유저가 다름 : " + requestDTO.getEmail());
        }

        user.setUsername(requestDTO.getUsername());
        user.setPassword(requestDTO.getPassword());
        user.setCookie(requestDTO.getCookie());

        UserResponse.updateResponseDTO responseDTO = new UserResponse.updateResponseDTO(user);

        return responseDTO;
    }
}