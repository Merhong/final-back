package com.example.kakao.episode;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.utils.ApiUtils;
import com.example.kakao.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@RestController
public class EpisodeController {

    private final EpisodeService episodeService; // 자바에서 final 변수는 반드시 초기화되어야 함.
    private final HttpSession session;

    // 에피소드 1편 보기
    @GetMapping("/episodes/{episodeId}")
    public ResponseEntity<?> findById(@PathVariable int episodeId) {
        System.out.println("여기 실행되는 거 아닌가???????");
        // System.out.println(webtoonId+"/"+episodeId);
        //로그인 한 경우와 안 한 경우로 나눔
        if (session != null) {
        
            User sessionUser = (User) session.getAttribute("sessionUser");
            EpisodeResponse.FindByIdDTO responseDTO = episodeService.findById(episodeId, sessionUser.getId());
            return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
        }else{
        
            EpisodeResponse.FindByIdDTO responseDTO = episodeService.findById(episodeId, null);
            return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
        }
        
        
    }


    // 에피소드 좋아요
    @PostMapping("/episodes/like/{episodeId}")
    public ResponseEntity<?> like(@PathVariable int episodeId) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        EpisodeResponse.LikeDTO responseDTO = episodeService.like(sessionUser.getId(), episodeId);
        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }
    // 에피소드 싫어요 기능은 원래 없음


    // 에피소드 좋아요 취소
    @PostMapping("/episodes/likecancel/{episodeId}")
    public ResponseEntity<?> likeCancel(@PathVariable int episodeId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        EpisodeResponse.LikeDTO responseDTO = episodeService.likeCancel(sessionUser.getId(), episodeId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }
    // 에피소드 싫어요 기능은 원래 없음


    // 에피소드 별점 주기
    @PostMapping("/episodes/star/{episodeId}")
    public ResponseEntity<?> starSave(@PathVariable int episodeId, Integer score) {
        
        if (score == null) {
            throw new Exception400("score null임");
        }

        if (!(0 <= score && score <= 10)) {
            throw new Exception400("1~10점만");
        }

        User sessionUser = (User) session.getAttribute("sessionUser");

        EpisodeResponse.StarDTO responseDTO = episodeService.starSave(sessionUser.getId(), episodeId, score);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }
    // 별점 준거 취소나 변경 원래 불가능함


    // (기능1) 상품 목록보기
    // @GetMapping("/webtoons")
    // public ResponseEntity<?> findAll(@RequestParam(value = "page", defaultValue = "0") Integer page) {
    //     System.out.println("테스트 : findAll()");
    //     // List<WebtoonResponse.FindAllDTO> responseDTOs = webtoonService.findAll(page);
    //     List<EpisodeResponse.FindAllDTO> responseDTOs = episodeService.findAll();
    //     return ResponseEntity.ok().body(ApiUtils.success(responseDTOs));
    // }

    // // (기능2) 상품 상세보기
    // @GetMapping("/products/{id}")
    // public ResponseEntity<?> findById(@PathVariable int id) {
    //     ProductResponse.FindByIdDTO responseDTO = productService.findById(id);
    //     return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    // }

    // // 상품조회 + 옵션조회
    // @GetMapping("/products/{id}/v1")
    // public ResponseEntity<?> findByIdV1(@PathVariable int id) {
    //     ProductResponse.FindByIdV1DTO responseDTO = productService.findByIdV1(id);
    //     return ResponseEntity.ok(responseDTO);
    // }

    // // 상품조회 양방향 매핑
    // @GetMapping("/products/{id}/v2")
    // public ResponseEntity<?> findByIdV2(@PathVariable int id) {
    //     ProductResponse.FindByIdV2DTO responseDTO = productService.findByIdV2(id);
    //     return ResponseEntity.ok(responseDTO);
    // }

    // // 옵션조회
    // @GetMapping("/products/{id}/v3")
    // public ResponseEntity<?> findByIdV3(@PathVariable int id) {
    //     ProductResponse.FindByIdV3DTO responseDTO = productService.findByIdV3(id);
    //     return ResponseEntity.ok(responseDTO);
    // }

    // // 옵션조회
    // @GetMapping("/products/{id}/v4")
    // public ResponseEntity<?> findByIdV4(@PathVariable int id) {
    //     List<Option> responseDTO = productService.findByIdV4(id);
    //     return ResponseEntity.ok(responseDTO);
    // }
}