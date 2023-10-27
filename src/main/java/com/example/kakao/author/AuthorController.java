package com.example.kakao.author;

import com.example.kakao._core.utils.ApiUtils;
import com.example.kakao.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

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