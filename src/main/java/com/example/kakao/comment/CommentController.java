package com.example.kakao.comment;

import com.example.kakao._core.utils.ApiUtils;
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
public class CommentController {

    private final CommentService commentService; // 자바에서 final 변수는 반드시 초기화되어야 함.
    private final HttpSession session;


    // 댓글 좋아요
    @PostMapping("/comments/like/{commentId}")
    public ResponseEntity<?> like(@PathVariable int commentId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        CommentResponse.LikeDTO responseDTO = commentService.like(sessionUser.getId(), commentId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }


    // 댓글 싫어요
    @PostMapping("/comments/dislike/{commentId}")
    public ResponseEntity<?> dislike(@PathVariable int commentId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        CommentResponse.LikeDTO responseDTO = commentService.dislike(sessionUser.getId(), commentId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }


    // 댓글 좋아요/싫어요 삭제
    @DeleteMapping("/comments/likecancel/{commentId}")
    public ResponseEntity<?> likecancel(@PathVariable int commentId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        CommentResponse.LikeDTO responseDTO = commentService.likecancel(sessionUser.getId(), commentId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }


    // 에피소드의 댓글  보기
    @GetMapping("/comments/{episodeId}")
    public ResponseEntity<?> findById(@PathVariable int episodeId) {

        List<CommentResponse.FindAllDTO> responseDTOList = commentService.findAll(episodeId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTOList));
    }


    // 댓글작성
    @PostMapping("/comments/{episodeId}")
    public ResponseEntity<?> save(@RequestBody @Valid CommentRequest.SaveRequestDTO requestDTO, Errors errors, @PathVariable int episodeId) {

        User sessionUser = (User) session.getAttribute("sessionUser");

        CommentResponse.SaveCommentDTO responseDTO = commentService.save(requestDTO, sessionUser.getId(), episodeId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }


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