package com.example.kakao.webtoon;

import com.example.kakao._core.errors.exception.Exception403;
import com.example.kakao._core.utils.ApiUtils;
import com.example.kakao.entity.enums.UserTypeEnum;
import com.example.kakao.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

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
    @GetMapping("/webtoons/{id}")
    public ResponseEntity<?> findById(@PathVariable int id) {
        WebtoonResponse.FindByIdDTO DTO = webtoonService.findById(id);
        return ResponseEntity.ok().body(ApiUtils.success(DTO));
    }


    // 웹툰 추가
    @PostMapping("/webtoons/author/{id}")
    public ResponseEntity<?> update(@RequestBody @Valid WebtoonRequest.CreateDTO requestDTO, Errors errors) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        if (!(sessionUser.getUserTypeEnum().equals(UserTypeEnum.ADMIN)) // && !(sessionUser.getUserTypeEnum().equals(UserTypeEnum.AUTHOR))
        ) {
            throw new Exception403("일반유저못함");
        }

        // webtoonService.create(requestDTO);
        // TODO

        return ResponseEntity.ok().body(ApiUtils.success("responseDTO임시"));
    }

}