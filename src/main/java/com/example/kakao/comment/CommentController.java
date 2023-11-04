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




    
    // 대댓글 작성
    @PostMapping("/recomments/{commentId}")
    public ResponseEntity<?> reCommentSave(@RequestBody @Valid CommentRequest.SaveRequestDTO requestDTO, Errors errors, @PathVariable int commentId) {

        User sessionUser = (User) session.getAttribute("sessionUser");

        CommentResponse.ReCommentDTO responseDTO = commentService.reCommentSave(requestDTO, sessionUser, commentId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }




    // 대댓글 좋아요
    @PostMapping("/recomments/like/{reCommentId}")
    public ResponseEntity<?> reCommentLike(@PathVariable int reCommentId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        CommentResponse.LikeReCommentDTO responseDTO = commentService.reCommentLike(sessionUser.getId(), reCommentId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }


    // 대댓글 싫어요
    @PostMapping("/recomments/dislike/{reCommentId}")
    public ResponseEntity<?> reCommentDislike(@PathVariable int reCommentId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        CommentResponse.LikeReCommentDTO responseDTO = commentService.reCommentDislike(sessionUser.getId(), reCommentId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }



    // 대댓글 좋아요/싫어요 삭제
    @DeleteMapping("/recomments/likecancel/{reCommentId}")
    public ResponseEntity<?> reCommentLikecancel(@PathVariable int reCommentId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        CommentResponse.LikeReCommentDTO responseDTO = commentService.reCommentLikecancel(sessionUser.getId(), reCommentId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }

    // 대댓글 삭제
    @DeleteMapping("/recomments/{reCommentId}")
    public ResponseEntity<?> reCommentDelete(@PathVariable int reCommentId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        CommentResponse.ReCommentDeleteDTO responseDTO = commentService.reCommentDelete(sessionUser.getId(), reCommentId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }




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


    // 댓글 삭제
    @DeleteMapping("/comments/{commentId}")
    public ResponseEntity<?> delete(@PathVariable int commentId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        CommentResponse.DeleteDTO responseDTO = commentService.delete(sessionUser.getId(), commentId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }


    // 댓글작성
    @PostMapping("/comments/{episodeId}")
    public ResponseEntity<?> save(@RequestBody @Valid CommentRequest.SaveRequestDTO requestDTO, Errors errors, @PathVariable int episodeId) {

        User sessionUser = (User) session.getAttribute("sessionUser");

        CommentResponse.CommentDTO responseDTO = commentService.save(requestDTO, sessionUser, episodeId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }




    // 에피소드의 댓글  보기
    @GetMapping("/comments/{episodeId}")
    public ResponseEntity<?> findById(@PathVariable int episodeId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        List<CommentResponse.CommentDTO> responseDTOList = commentService.findAll(episodeId, sessionUser.getId());

        return ResponseEntity.ok().body(ApiUtils.success(responseDTOList));
    }


    
}