package com.example.kakao.author;

import com.example.kakao._core.errors.exception.Exception403;
import com.example.kakao._core.utils.ApiUtils;
import com.example.kakao._entity.enums.UserTypeEnum;
import com.example.kakao.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
public class AuthorController {

    private final AuthorService authorService; // 자바에서 final 변수는 반드시 초기화되어야 함.
    private final HttpSession session;





    
    
    // {
    //     "title" : "작가글제목",
    //     "text" : "작가글본문"
    //     "photo" : "MultipartFile??"
    // }
    // 작가의글 추가
    @PostMapping("/authors/board")
    // public ResponseEntity<?> createBoard(@RequestBody @Valid AuthorRequest.CreateBoardDTO requestDTO, MultipartFile photo, Errors errors) {
    public ResponseEntity<?> createBoard(AuthorRequest.CreateBoardDTO requestDTO, MultipartFile photo) {

        User sessionUser = (User) session.getAttribute("sessionUser");

        if ( !(sessionUser.getUserTypeEnum().equals(UserTypeEnum.AUTHOR)) ) {
            throw new Exception403("작가만 가능함");
        }

        AuthorResponse.CreateBoardDTO responseDTO = authorService.createBoard(requestDTO, sessionUser);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }




    // {
    //     "userId" : 1,
    //     "authorNickname" : "유저닉네임같게",
    //     "authorPhoto" : "defaultAuthorPhoto.jpg",
    //     "siteURL" : "https://naver.com",
    //     "introduce" : "작가소개"
    // }
    // 작가 추가
    @PostMapping("/authors")
    public ResponseEntity<?> create(@RequestBody @Valid AuthorRequest.CreateDTO requestDTO, Errors errors) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        if ( !(sessionUser.getUserTypeEnum().equals(UserTypeEnum.ADMIN)) ) {
            throw new Exception403("어드민만 가능함");
        }

        AuthorResponse.CreateDTO responseDTO = authorService.create(requestDTO);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }



    // 관심작가 추가
    @PostMapping("/authors/interest/{authorId}")
    public ResponseEntity<?> interestSave(@PathVariable int authorId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        AuthorResponse.InterestDTO responseDTO = authorService.interestSave(sessionUser.getId(), authorId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }

    // 관심작가 제거
    @DeleteMapping("/authors/interest/{authorId}")
    public ResponseEntity<?> interestDelete(@PathVariable int authorId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        AuthorResponse.InterestDTO responseDTO = authorService.interestDelete(sessionUser.getId(), authorId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }

}