package com.example.kakao.admin;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception403;
import com.example.kakao._entity.enums.UserTypeEnum;
import com.example.kakao.author.AuthorRequest;
import com.example.kakao.author.AuthorResponse;
import com.example.kakao.author.AuthorService;
import com.example.kakao.episode.EpisodeRequest;
import com.example.kakao.episode.EpisodeResponse;
import com.example.kakao.episode.EpisodeService;
import com.example.kakao.user.User;
import com.example.kakao.webtoon.WebtoonRequest;
import com.example.kakao.webtoon.WebtoonResponse;
import com.example.kakao.webtoon.WebtoonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class AdminController {

    private final WebtoonService webtoonService;
    private final EpisodeService episodeService;
    private final AuthorService authorService;

    @Autowired
    private AdminService adminService;

    @Autowired
    private final HttpSession session;

    // mustache admin 홈페이지
    @GetMapping({"/admin", "/"})
    public String index(HttpSession session, Model model) {

        AdminResponse.LoginResponseDTO loginResponseDTO = (AdminResponse.LoginResponseDTO) session.getAttribute("sessionUser");

        try {
            // 일반유저 로그인
            if (loginResponseDTO.getUserTypeEnum() == UserTypeEnum.NORMAL) {
                session.invalidate(); // 세션 날리고 401코드 날려줌
                return "error/401";
            }
            // 관리자 로그인
            if (loginResponseDTO.getUserTypeEnum() == UserTypeEnum.ADMIN) {
                return "index"; // 관리자 페이지로 이동
            }
            // 작가 로그인
            if (loginResponseDTO.getUserTypeEnum() == UserTypeEnum.AUTHOR) {
                return "author/authorMainForm"; // 작가 페이지로 이동
            }
            else return "loginForm";
            // 예외시 로그인 페이지로 이동
        } catch (Exception e) {
            session.invalidate(); // 세션 날리고 로그인창으로 이동시킴
            return "loginForm";
        }
    }

    @GetMapping("/error/401")
    public String error401() {
        return "error/401";
    }

    @GetMapping("/error/404")
    public String error404() {
        return "error/404";
    }

    @GetMapping("/error/500")
    public String error500() {
        return "error/500";
    }

    @GetMapping("/adminLoginForm")
    public String adminLoginForm() {
        return "loginForm";
    }

    @GetMapping("/adminJoinForm")
    public String adminJoinForm() {
        return "joinForm";
    }


    // 로그아웃
    // 브라우저 GET /logout 요청을 함(request 1)
    // 서버는 / 주소를 응답의 헤더에 담음(Location) 상태코드 302 응답
    // 브라우저는 GET / 로 재요청을 함.(request 2)
    // index 페이지 응답받고 렌더링함.
    @GetMapping("/logout")
    public String logout(HttpServletResponse response) {
        // 서버쪽 세션 무효화(삭제), 브라우저의 jSessionID는 남아있음.
        session.invalidate();

        return "loginForm";
    }

    // 관리자 로그인
    @PostMapping("/loginAdmin")
    public String loginAdmin(@Valid AdminRequest.LoginDTO requestDTO, BindingResult bindingResult, HttpSession session, Model model) {
        // 유효성 검사는 @Valid AOP로 진행

        try {
            // 핵심 로직
            // 로그인 메서드 호출하여 로그인
            AdminResponse.LoginResponseDTO sessionUser = adminService.loginAdmin(requestDTO);

            // 로그인 성공시 session에 sessionUser 정보를 담는다.
            session.setAttribute("sessionUser", sessionUser);
            // 로그인 후 홈페이지로 리다이렉트
            return "redirect:/";

        } catch (Exception e) {
            model.addAttribute("errorMessage", "로그인에 실패했습니다. 다시 시도하세요.");
            System.out.println("로그인 실패!!!");
            return "loginForm";
        }
    }

    // 관리자 계정 생성
    @PostMapping("/joinAdmin")
    public String joinAdmin(@Valid AdminRequest.JoinDTO requestDTO) {
        /* 유효성 검사(Validation Check)
        null 입력 값을 제거한다.
        정상 접근은 절대 이 조건문을 못 탄다.
        공격자들이 이 조건문을 타게 됨.(PostMan 사용 같은것)
        따라서 친절하게 리턴 해줄 필요가 없음. 여기선 Error 페이지로 리턴
        */

        adminService.joinAdmin(requestDTO);
        // json데이터 확인용
        // return ResponseEntity.ok().body(ApiUtils.success(null));
        return "loginForm";
    }


    @GetMapping("advertisingSubForm")
    public String advertisingSubForm(HttpSession session) {
        System.out.println("광고폼");

        AdminResponse.LoginResponseDTO loginResponseDTO = (AdminResponse.LoginResponseDTO) session.getAttribute("sessionUser");

        if (loginResponseDTO == null || !(loginResponseDTO.getUserTypeEnum() == UserTypeEnum.ADMIN)) {
            System.out.println("통과못함");
            return "redirect:/loginForm";
        }

        return "advertising/advertisingSubForm";
    }


    @GetMapping("advertisingMainForm")
    public String advertisingMainForm(HttpSession session) {
        System.out.println("광고폼");

        AdminResponse.LoginResponseDTO loginResponseDTO = (AdminResponse.LoginResponseDTO) session.getAttribute("sessionUser");

        if (loginResponseDTO == null || !(loginResponseDTO.getUserTypeEnum() == UserTypeEnum.ADMIN)) {
            System.out.println("통과못함");
            return "redirect:/loginForm";
        }

        return "advertising/advertisingMainForm";
    }


    @GetMapping("episodeForm")
    public String episodeForm(HttpSession session) {
        System.out.println("에피소드폼");

        AdminResponse.LoginResponseDTO loginResponseDTO = (AdminResponse.LoginResponseDTO) session.getAttribute("sessionUser");

        if (loginResponseDTO == null || (!(loginResponseDTO.getUserTypeEnum() == UserTypeEnum.ADMIN) && !(loginResponseDTO.getUserTypeEnum() == UserTypeEnum.AUTHOR))) {
            System.out.println("통과못함");
            return "redirect:/loginForm";
        }

        return "episode/episodeForm";
    }


    @GetMapping("webtoonForm")
    public String webtoonForm(HttpSession session) {
        System.out.println("웹툰폼");

        AdminResponse.LoginResponseDTO loginResponseDTO = (AdminResponse.LoginResponseDTO) session.getAttribute("sessionUser");

        if (loginResponseDTO == null || !(loginResponseDTO.getUserTypeEnum() == UserTypeEnum.ADMIN)) {
            System.out.println("통과못함");
            return "redirect:/loginForm";
        }

        return "webtoon/webtoonForm";
    }


    @GetMapping("authorBoardForm")
    public String authorBoardForm(HttpSession session) {
        System.out.println("작가의글폼");

        AdminResponse.LoginResponseDTO loginResponseDTO = (AdminResponse.LoginResponseDTO) session.getAttribute("sessionUser");

        if (loginResponseDTO == null || !(loginResponseDTO.getUserTypeEnum() == UserTypeEnum.AUTHOR)) {
            System.out.println("통과못함");
            return "redirect:/loginForm";
        }

        return "author/authorBoardForm";
    }


    @GetMapping("authorUpdateForm")
    public String authorUpdateForm(HttpSession session) {
        System.out.println("작가정보수정폼");

        AdminResponse.LoginResponseDTO loginResponseDTO = (AdminResponse.LoginResponseDTO) session.getAttribute("sessionUser");

        if (loginResponseDTO == null || !(loginResponseDTO.getUserTypeEnum() == UserTypeEnum.AUTHOR)) {
            System.out.println("통과못함");
            return "redirect:/loginForm";
        }

        return "/author/authorUpdateForm";
    }


    @GetMapping("authorForm")
    public String authorForm(HttpSession session) {
        System.out.println("작가등록폼");

        AdminResponse.LoginResponseDTO loginResponseDTO = (AdminResponse.LoginResponseDTO) session.getAttribute("sessionUser");

        if (loginResponseDTO == null || !(loginResponseDTO.getUserTypeEnum() == UserTypeEnum.ADMIN)) {
            System.out.println("통과못함");

            return "redirect:/loginForm";
        }

        return "/author/authorForm";
    }

    // 작가 추가
    @PostMapping("/add/authors")
    // public ResponseEntity<?> create(AuthorRequest.CreateDTO requestDTO) {
    public String createAuthor(AuthorRequest.CreateDTO requestDTO) {
        // User sessionUser = (User) session.getAttribute("sessionUser");
        AdminResponse.LoginResponseDTO loginResponseDTO = (AdminResponse.LoginResponseDTO) session.getAttribute("sessionUser");
        if (!(loginResponseDTO.getUserTypeEnum().equals(UserTypeEnum.ADMIN))) {
            throw new Exception403("어드민만 가능함");
        }

        AuthorResponse.CreateDTO responseDTO = authorService.create(requestDTO);

        // return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
        return "redirect:/admin";
    }


    // 작가 수정
    // Put이 맞는데 html from에서 안됨
    @PostMapping("/add/authors/update")
    // public ResponseEntity<?> update(@Valid AuthorRequest.UpdateDTO requestDTO, MultipartFile authorPhoto, HttpSession session) {
    public String update(@Valid AuthorRequest.UpdateDTO requestDTO, MultipartFile authorPhoto, HttpSession session) {
        // User sessionUser = (User) session.getAttribute("sessionUser");
        AdminResponse.LoginResponseDTO loginResponseDTO = (AdminResponse.LoginResponseDTO) session.getAttribute("sessionUser");
        if (!(loginResponseDTO.getUserTypeEnum().equals(UserTypeEnum.AUTHOR))) {
            throw new Exception403("작가만 가능함");
        }

        AuthorResponse.UpdateDTO responseDTO = authorService.update(requestDTO, loginResponseDTO.getId());

        // return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
        return "redirect:/admin";
    }


    // // 작가의글 추가
    @PostMapping("/add/authors/board")
    // public ResponseEntity<?> createBoard(AuthorRequest.CreateBoardDTO requestDTO, MultipartFile photo, HttpSession session) {
    public String createBoard(AuthorRequest.CreateBoardDTO requestDTO, MultipartFile photo, HttpSession session) {
        // User sessionUser = (User) session.getAttribute("sessionUser");
        AdminResponse.LoginResponseDTO loginResponseDTO = (AdminResponse.LoginResponseDTO) session.getAttribute("sessionUser");
        if (!(loginResponseDTO.getUserTypeEnum().equals(UserTypeEnum.AUTHOR))) {
            throw new Exception403("작가만 가능함");
        }

        AuthorResponse.CreateBoardDTO responseDTO = authorService.createBoard(requestDTO, loginResponseDTO.getId());

        // return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
        return "redirect:/admin";
    }



    @GetMapping("webtoonUpdateForm")
    public String webtoonUpdateForm(HttpSession session) {
        System.out.println("웹툰업데이트폼");

        AdminResponse.LoginResponseDTO loginResponseDTO = (AdminResponse.LoginResponseDTO) session.getAttribute("sessionUser");

        if (loginResponseDTO == null || !(loginResponseDTO.getUserTypeEnum() == UserTypeEnum.ADMIN)) {
            System.out.println("통과못함");
            return "redirect:/loginForm";
        }

        return "webtoon/webtoonUpdateForm";
    }

    // 웹툰 수정
    @PostMapping("/add/webtoons/update")
    // public ResponseEntity<?> webtoonCreate(WebtoonRequest.CreateDTO requestDTO, MultipartFile image) {
    public String webtoonUpdate(WebtoonRequest.UpdateDTO requestDTO, MultipartFile image, HttpSession session) {
        // User sessionUser = (User) session.getAttribute("sessionUser");
        AdminResponse.LoginResponseDTO loginResponseDTO = (AdminResponse.LoginResponseDTO) session.getAttribute("sessionUser");
        if (!(loginResponseDTO.getUserTypeEnum().equals(UserTypeEnum.ADMIN))) {
            throw new Exception403("어드민만 가능함");
        }

        WebtoonResponse.CreateDTO responseDTO = webtoonService.update(requestDTO);

        // return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
        return "redirect:/admin";
    }


    // 웹툰 추가
    @PostMapping("/add/webtoons")
    // public ResponseEntity<?> webtoonCreate(WebtoonRequest.CreateDTO requestDTO, MultipartFile image) {
    public String webtoonCreate(WebtoonRequest.CreateDTO requestDTO, MultipartFile image, HttpSession session) {
        // User sessionUser = (User) session.getAttribute("sessionUser");
        AdminResponse.LoginResponseDTO loginResponseDTO = (AdminResponse.LoginResponseDTO) session.getAttribute("sessionUser");
        if (!(loginResponseDTO.getUserTypeEnum().equals(UserTypeEnum.ADMIN))) {
            throw new Exception403("어드민만 가능함");
        }

        WebtoonResponse.CreateDTO responseDTO = webtoonService.create(requestDTO);

        // return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
        return "redirect:/admin";
    }


    // 에피소드 추가
    @PostMapping("/add/episodes")
    // public ResponseEntity<?> create(EpisodeRequest.CreateDTO requestDTO, MultipartFile thumbnailPhoto, List<MultipartFile> photoList, HttpSession session) throws IOException {
    public String episodeCreate(EpisodeRequest.CreateDTO requestDTO, MultipartFile thumbnailPhoto, List<MultipartFile> photoList, HttpSession session) {
        // User sessionUser = (User) session.getAttribute("sessionUser");
        AdminResponse.LoginResponseDTO loginResponseDTO = (AdminResponse.LoginResponseDTO) session.getAttribute("sessionUser");
        if (!(loginResponseDTO.getUserTypeEnum().equals(UserTypeEnum.ADMIN)) && !(loginResponseDTO.getUserTypeEnum().equals(UserTypeEnum.AUTHOR))) {
            throw new Exception403("작가나 어드민만 가능함");
        }

        User sessionUser = User.builder()
                .id(loginResponseDTO.getId())
                .userTypeEnum(loginResponseDTO.getUserTypeEnum())
                .build();

        EpisodeResponse.CreateDTO responseDTO = episodeService.create(requestDTO, photoList, sessionUser);

        // return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
        return "redirect:/admin";
    }


    // 메인 광고 추가
    @PostMapping("/add/advertising/main")
    // public ResponseEntity<?> advertisingMainSave(WebtoonRequest.AdvertisingMainDTO requestDTO, MultipartFile photo, HttpSession session) {
    public String advertisingMainSave(WebtoonRequest.AdvertisingMainDTO requestDTO, MultipartFile photo, HttpSession session) {
        // User sessionUser = (User) session.getAttribute("sessionUser");
        AdminResponse.LoginResponseDTO loginResponseDTO = (AdminResponse.LoginResponseDTO) session.getAttribute("sessionUser");

        if (!(loginResponseDTO.getUserTypeEnum().equals(UserTypeEnum.ADMIN))) {
            throw new Exception403("어드민만 가능함");
        }

        if (requestDTO.getIsWebLink() == null) {
            throw new Exception400("isWebLink없음");
        }

        WebtoonResponse.AdvertisingMainDTO responseDTO = webtoonService.advertisingMainSave(requestDTO);

        // return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
        return "redirect:/admin";
    }


    // 서브 광고 추가
    @PostMapping("/add/advertising/sub")
    // public ResponseEntity<?> advertisingSubSave(WebtoonRequest.AdvertisingSubDTO requestDTO, MultipartFile photo, HttpSession session) {
    public String advertisingSubSave(WebtoonRequest.AdvertisingSubDTO requestDTO, MultipartFile photo, HttpSession session) {
        // User sessionUser = (User) session.getAttribute("sessionUser");

        AdminResponse.LoginResponseDTO loginResponseDTO = (AdminResponse.LoginResponseDTO) session.getAttribute("sessionUser");

        if (!(loginResponseDTO.getUserTypeEnum().equals(UserTypeEnum.ADMIN))) {
            throw new Exception403("어드민만 가능함");
        }

        WebtoonResponse.AdvertisingSubDTO responseDTO = webtoonService.advertisingSubSave(requestDTO);


        // return ResponseEntity.ok().body(ApiUtils.success(responseDTO));
        return "redirect:/admin";
    }

}
