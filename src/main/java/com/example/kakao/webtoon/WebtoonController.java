package com.example.kakao.webtoon;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kakao._core.errors.exception.Exception401;
import com.example.kakao._core.errors.exception.Exception403;
import com.example.kakao._core.utils.ApiUtils;
import com.example.kakao.entity.enums.UserTypeEnum;
import com.example.kakao.user.User;
import com.example.kakao.user.UserRequest;
import com.example.kakao.user.UserResponse;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class WebtoonController {

    private final WebtoonService webtoonService; // 자바에서 final 변수는 반드시 초기화되어야 함.
    private final HttpSession session;


    // 웹툰 전체목록
    @GetMapping("/webtoons")
    public ResponseEntity<?> findAll(@RequestParam(value = "page", defaultValue = "0") Integer page) {
        System.out.println("테스트 : findAll()");
        // List<WebtoonResponse.FindAllDTO> responseDTOs = webtoonService.findAll(page);
        List<WebtoonResponse.FindAllDTO> DTOList = webtoonService.findAll();
        return ResponseEntity.ok().body(ApiUtils.success(DTOList));
    }

    // 웹툰 상세보기
    @GetMapping("/webtoons/{webtoonId}")
    public ResponseEntity<?> findById(@PathVariable int webtoonId) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        
        WebtoonResponse.FindByIdDTO responseDTO = webtoonService.findById(webtoonId, sessionUser.getId());
        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }

    // 관심웹툰 추가
    @PostMapping("/webtoons/interest/{webtoonId}")
    public ResponseEntity<?> interestSave(@PathVariable int webtoonId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        // System.out.println(sessionUser.getId());
        // System.out.println(webtoonId);

        WebtoonResponse.InterestDTO responseDTO = webtoonService.interestSave(sessionUser.getId(), webtoonId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }

    // 관심웹툰 제거
    @DeleteMapping("/webtoons/interest/{webtoonId}")
    public ResponseEntity<?> interestDelete(@PathVariable int webtoonId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        WebtoonResponse.InterestDTO responseDTO = webtoonService.interestDelete(sessionUser.getId(), webtoonId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }


    // 웹툰 추가
    @PostMapping("/webtoons/author/{id}")
    public ResponseEntity<?> update(@RequestBody @Valid WebtoonRequest.CreateDTO requestDTO, Errors errors) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        
        if ( !(sessionUser.getUserTypeEnum().equals(UserTypeEnum.ADMIN)) // && !(sessionUser.getUserTypeEnum().equals(UserTypeEnum.AUTHOR)) 
        ) {
            throw new Exception403("일반유저못함");
        }

        // webtoonService.create(requestDTO);
        // TODO
        
        return ResponseEntity.ok().body(ApiUtils.success("responseDTO임시"));
    }

}