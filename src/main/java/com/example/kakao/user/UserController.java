package com.example.kakao.user;

import com.example.kakao._core.utils.ApiUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;
    private final HttpSession session;


    
    // MY댓글목록보기
    @GetMapping("/users/comments")
    public ResponseEntity<?> comment() {
        User sessionUser = (User) session.getAttribute("sessionUser");

        List<UserResponse.MyCommentDTO> responseDTOList = userService.comment(sessionUser.getId());

        return ResponseEntity.ok().body(ApiUtils.success(responseDTOList));
    }


    // 관심 작가 알람켜기
    @PostMapping("/users/interest/author/alarmon/{authorId}")
    public ResponseEntity<?> interestAuthorAlarmOn(@PathVariable int authorId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        UserResponse.InterestAuthorDTO responseDTO = userService.interestAuthorAlarmOn(sessionUser.getId(), authorId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }


    // 관심 작가 알람끄기
    @PostMapping("/users/interest/author/alarmoff/{authorId}")
    public ResponseEntity<?> interestAuthorAlarmOff(@PathVariable int authorId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        UserResponse.InterestAuthorDTO responseDTO = userService.interestAuthorAlarmOff(sessionUser.getId(), authorId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }


    // 관심웹툰알람끄기
    @PostMapping("/users/interest/alarmoff/{webtoonId}")
    public ResponseEntity<?> interestAlarmOff(@PathVariable int webtoonId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        UserResponse.InterestWebtoonDTO responseDTO = userService.interestAlarmOff(sessionUser.getId(), webtoonId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }

    // 관심웹툰알람켜기
    @PostMapping("/users/interest/alarmon/{webtoonId}")
    public ResponseEntity<?> interestAlarmOn(@PathVariable int webtoonId) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        UserResponse.InterestWebtoonDTO responseDTO = userService.interestAlarmOn(sessionUser.getId(), webtoonId);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }

    // MY관심웹툰목록보기
    @GetMapping("/users/interest")
    public ResponseEntity<?> interest() {
        User sessionUser = (User) session.getAttribute("sessionUser");

        List<UserResponse.InterestWebtoonDTO> responseDTOList = userService.interest(sessionUser.getId());

        return ResponseEntity.ok().body(ApiUtils.success(responseDTOList));
    }

    // MY관심작가목록보기
    @GetMapping("/users/interest/author")
    public ResponseEntity<?> interestAuthor() {
        User sessionUser = (User) session.getAttribute("sessionUser");

        List<UserResponse.InterestAuthorDTO> responseDTOList = userService.interestAuthor(sessionUser.getId());

        return ResponseEntity.ok().body(ApiUtils.success(responseDTOList));
    }


    // 회원가입
    @PostMapping("/join")
    public ResponseEntity<?> join(@RequestBody @Valid UserRequest.JoinDTO requestDTO, Errors errors) {
        userService.join(requestDTO);
        return ResponseEntity.ok().body(ApiUtils.success(null));
    }

    // 로그인
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid UserRequest.LoginDTO requestDTO, Errors errors) {
        UserResponse.loginResponseDTO responseDTO = userService.login(requestDTO);
        return ResponseEntity.ok().header("Authorization", "Bearer " + responseDTO.getJwt()).body(ApiUtils.success(responseDTO));
    }

    // 업데이트 //  쿠키 추가
    @PutMapping("/users")
    public ResponseEntity<?> update(@RequestBody @Valid UserRequest.UpdateDTO requestDTO, Errors errors) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        UserResponse.updateResponseDTO responseDTO = userService.update(requestDTO, sessionUser);

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
    }

    // JWT는 로그아웃 할 때 서버로 요청할 필요가 없음.(어짜피 스테스리스로 서버에 정보가 없으니까)
    // 로그아웃
    // @GetMapping("/logout")
    // public ResponseEntity<?> logout(){
    //     session.invalidate();
    //     return ResponseEntity.ok().body(ApiUtils.success(null));
    // }


}
