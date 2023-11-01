package com.example.kakao.webtoon;

import com.example.kakao._core.errors.exception.Exception403;
import com.example.kakao._core.utils.ApiUtils;
import com.example.kakao._entity.enums.UserTypeEnum;
import com.example.kakao.user.User;
import com.example.kakao.webtoon.WebtoonResponse.EndRecommendationDTO;
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


    
    // 메인 광고
    @GetMapping("/webtoons/advertising/main")
    public ResponseEntity<?> advertisingMain() {
        List<WebtoonResponse.AdvertisingMainDTO> responseDTOList = webtoonService.advertisingMain();
        return ResponseEntity.ok().body(ApiUtils.success(responseDTOList));
    }



    // 웹툰 전체목록
    @GetMapping("/webtoons")
    public ResponseEntity<?> findAll(@RequestParam(value = "page", defaultValue = "0") Integer page) {
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

    // 웹툰 랜덤작품 상세보기
    @GetMapping("/webtoons/random")
    public ResponseEntity<?> findByRandom() {
        User sessionUser = (User) session.getAttribute("sessionUser");

        WebtoonResponse.FindByIdDTO responseDTO = webtoonService.findById(-1, sessionUser.getId());
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
    @PostMapping("/webtoons")
    public ResponseEntity<?> create(@RequestBody @Valid WebtoonRequest.CreateDTO requestDTO, Errors errors) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        if (!(sessionUser.getUserTypeEnum().equals(UserTypeEnum.ADMIN)) // && !(sessionUser.getUserTypeEnum().equals(UserTypeEnum.AUTHOR))
        ) {
            throw new Exception403("어드민만 가능함");
        }

        // webtoonService.create(requestDTO);
        // TODO

        return ResponseEntity.ok().body(ApiUtils.success("responseDTO임시"));
    }

    @GetMapping("/webtoons/recommend")
    public ResponseEntity<?> endRecommendation() {
        List<EndRecommendationDTO> endRecommendationDTOList = webtoonService.endRecommendation();
        return ResponseEntity.ok().body(ApiUtils.success(endRecommendationDTOList));
    }


}