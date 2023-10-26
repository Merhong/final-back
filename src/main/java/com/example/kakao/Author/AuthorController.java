package com.example.kakao.author;

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
public class AuthorController {

    private final AuthorService authorService; // 자바에서 final 변수는 반드시 초기화되어야 함.
    private final HttpSession session;


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