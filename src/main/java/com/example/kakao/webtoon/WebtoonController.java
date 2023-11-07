package com.example.kakao.webtoon;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception403;
import com.example.kakao._core.utils.ApiUtils;
import com.example.kakao._entity.enums.UserTypeEnum;
import com.example.kakao.user.User;
import com.example.kakao.webtoon.WebtoonResponse.EndRecommendationDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class WebtoonController {

    private final WebtoonService webtoonService; // 자바에서 final 변수는 반드시 초기화되어야 함.
    private final HttpSession session;




    // 최근본웹툰 목록
    @GetMapping("/webtoons/recent")
    public ResponseEntity<?> recentFindAll() {
        User sessionUser = (User) session.getAttribute("sessionUser");

        List<WebtoonResponse.RecentDTO> responseDTOList = webtoonService.recentFindAll(sessionUser.getId());

        return ResponseEntity.ok().body(ApiUtils.success(responseDTOList));
    }



    
    // 최근본웹툰 추가
    @PostMapping("/webtoons/recent/{episodeId}")
    public ResponseEntity<?> recentSave(@PathVariable int episodeId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        WebtoonResponse.RecentDTO responseDTO = webtoonService.recentSave(sessionUser.getId(), episodeId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }



    // 검색
    @GetMapping("/search")
    public ResponseEntity<?> search(String searchText) {
        List<WebtoonResponse.SearchDTO> responseDTOList = webtoonService.search(searchText);
        return ResponseEntity.ok().body(ApiUtils.success(responseDTOList));
    }




    // 서브 광고
    @GetMapping("/webtoons/advertising/sub")
    public ResponseEntity<?> advertisingSub() {
        List<WebtoonResponse.AdvertisingSubDTO> responseDTOList = webtoonService.advertisingSub();
        return ResponseEntity.ok().body(ApiUtils.success(responseDTOList));
    }


    
    // 메인 광고
    @GetMapping("/webtoons/advertising/main")
    public ResponseEntity<?> advertisingMain() {
        List<WebtoonResponse.AdvertisingMainDTO> responseDTOList = webtoonService.advertisingMain();
        return ResponseEntity.ok().body(ApiUtils.success(responseDTOList));
    }




    // 메인 광고 제거
    @DeleteMapping("/webtoons/advertising/main/{advertisingMainId}")
    public ResponseEntity<?> advertisingMainDelete(@PathVariable int advertisingMainId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        if ( !(sessionUser.getUserTypeEnum().equals(UserTypeEnum.ADMIN)) ) {
            throw new Exception403("어드민만 가능함");
        }

        WebtoonResponse.AdvertisingMainDTO responseDTO = webtoonService.advertisingMainDelete(advertisingMainId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }





    // 메인 광고 추가
    @PostMapping("/webtoons/advertising/main")
    public ResponseEntity<?> advertisingMainSave(WebtoonRequest.AdvertisingMainDTO requestDTO, MultipartFile photo) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        if ( !(sessionUser.getUserTypeEnum().equals(UserTypeEnum.ADMIN)) ) {
            throw new Exception403("어드민만 가능함");
        }
        
        if(requestDTO.getIsWebLink() == null){
            throw new Exception400("isWebLink없음");
        }

        WebtoonResponse.AdvertisingMainDTO responseDTO = webtoonService.advertisingMainSave(requestDTO);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }



    // 서브 광고 추가
    @PostMapping("/webtoons/advertising/sub")
    public ResponseEntity<?> advertisingSubSave(WebtoonRequest.AdvertisingSubDTO requestDTO, MultipartFile photo) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        if ( !(sessionUser.getUserTypeEnum().equals(UserTypeEnum.ADMIN)) ) {
            throw new Exception403("어드민만 가능함");
        }

        WebtoonResponse.AdvertisingSubDTO responseDTO = webtoonService.advertisingSubSave(requestDTO);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }






    // 웹툰 전체목록
    @GetMapping("/webtoons")
    public ResponseEntity<?> findAll(@RequestParam(value = "page", defaultValue = "0") Integer page) {
        // List<WebtoonResponse.FindAllDTO> responseDTOs = webtoonService.findAll(page);

        
        User sessionUser = (User) session.getAttribute("sessionUser");

        List<WebtoonResponse.FindAllDTO> DTOList = webtoonService.findAll(sessionUser.getId());
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


    // {
    //     "authorIdList" : [101, 102], // userId아님
    //     "title" : "웹3툰제목1",
    //     "intro" : "웹툰설명1",
    //     "image" : "default_webtoon_Thumbnail.jpg",
    //     "ageLimit" : 8,
    //     "webtoonWeekDayEnum" : "월",
    //     "webtoonSpeciallyEnum" : "신작"
    // }
    // 웹툰 추가
    @PostMapping("/webtoons")
    // public ResponseEntity<?> create(@RequestBody @Valid WebtoonRequest.CreateDTO requestDTO, Errors errors) {
    public ResponseEntity<?> create(WebtoonRequest.CreateDTO requestDTO, MultipartFile image) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        if ( !(sessionUser.getUserTypeEnum().equals(UserTypeEnum.ADMIN)) ) {
            throw new Exception403("어드민만 가능함");
        }

        WebtoonResponse.CreateDTO responseDTO = webtoonService.create(requestDTO);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }



    @GetMapping("/webtoons/recommend")
    public ResponseEntity<?> endRecommendation() {
        List<EndRecommendationDTO> endRecommendationDTOList = webtoonService.endRecommendation();
        return ResponseEntity.ok().body(ApiUtils.success(endRecommendationDTOList));
    }


}