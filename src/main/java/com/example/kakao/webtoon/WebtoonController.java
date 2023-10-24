package com.example.kakao.webtoon;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kakao._core.utils.ApiUtils;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class WebtoonController {

    private final WebtoonService webtoonService; // 자바에서 final 변수는 반드시 초기화되어야 함.

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