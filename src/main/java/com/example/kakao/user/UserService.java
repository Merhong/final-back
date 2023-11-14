package com.example.kakao.user;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception500;
import com.example.kakao._core.utils.JwtTokenUtils;
import com.example.kakao._entity.InterestAuthor;
import com.example.kakao._entity.InterestWebtoon;
import com.example.kakao._entity.ReComment;
import com.example.kakao._entity.enums.UserTypeEnum;
import com.example.kakao._repository.InterestAuthorRepository;
import com.example.kakao._repository.InterestWebtoonRepository;
import com.example.kakao._repository.ReCommentRepository;
import com.example.kakao.author.Author;
import com.example.kakao.comment.Comment;
import com.example.kakao.comment.CommentJPARepository;
import com.example.kakao.user.UserResponse.InterestAuthorDTO;
import com.example.kakao.user.UserResponse.InterestWebtoonDTO;
import com.example.kakao.webtoon.Webtoon;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserJPARepository userJPARepository;
    private final InterestWebtoonRepository interestWebtoonRepository;
    private final InterestAuthorRepository interestAuthorRepository;
    private final CommentJPARepository commentRepository;
    private final ReCommentRepository reCommentRepository;




    
    
    // MY댓글목록
    public List<UserResponse.MyCommentDTO> comment(int userId) {

        List<Comment> onlyCommentList = commentRepository.findByUserId(userId, Sort.by(Sort.Order.desc("id")));
        
        List<UserResponse.MyCommentDTO> onlyCommentDTOList = onlyCommentList.stream()
        .filter(comment -> comment.getIsDelete() == false)
        .map(comment -> new UserResponse.MyCommentDTO(comment, userId))
        .collect(Collectors.toList());
        
        
        List<ReComment> onlyReCommentList = reCommentRepository.findByUserId(userId, Sort.by(Sort.Order.desc("id")));

        List<UserResponse.MyCommentDTO> onlyReCommentDTOList = onlyReCommentList.stream()
        .filter(reComment -> reComment.getIsDelete() == false)
        .map(reComment -> new UserResponse.MyCommentDTO(reComment, userId))
        .collect(Collectors.toList());
        
        List<UserResponse.MyCommentDTO> responseDTOList = new ArrayList<>();
        responseDTOList.addAll(onlyCommentDTOList);
        responseDTOList.addAll(onlyReCommentDTOList);

        // responseDTOList.sort((dto1, dto2) -> dto1.getCreatedAt().compareTo(dto2.getCreatedAt()));
        responseDTOList.sort(Collections.reverseOrder((dto1, dto2) -> dto1.getCreatedAt().compareTo(dto2.getCreatedAt())));

        return responseDTOList;
    }





    // 관심웹툰알람끄기
    @Transactional
    public UserResponse.InterestWebtoonDTO interestAlarmOff(int userId, int webtoonId) {

        List<InterestWebtoon> interestWebtoonList = interestWebtoonRepository.findByUserIdAndWebtoonId(userId, webtoonId);

        if (interestWebtoonList.size() != 1) {
            throw new Exception400("관심웹툰이아닌데");
        }

        InterestWebtoon interestWebtoon = interestWebtoonList.get(0);

        if(interestWebtoon.getIsAlarm() == false){
            throw new Exception400("이미알람끄져있음");
        }

        interestWebtoon.setIsAlarm(false);

        UserResponse.InterestWebtoonDTO responseDTO = new UserResponse.InterestWebtoonDTO(interestWebtoon);
        return responseDTO;
    }

    // 관심웹툰알람켜기
    @Transactional
    public UserResponse.InterestWebtoonDTO interestAlarmOn(int userId, int webtoonId) {

        List<InterestWebtoon> interestWebtoonList = interestWebtoonRepository.findByUserIdAndWebtoonId(userId, webtoonId);

        if (interestWebtoonList.size() != 1) {
            throw new Exception400("관심웹툰이아닌데");
        }

        InterestWebtoon interestWebtoon = interestWebtoonList.get(0);

        if(interestWebtoon.getIsAlarm() == true){
            throw new Exception400("이미알람켜져있음");
        }

        interestWebtoon.setIsAlarm(true);

        UserResponse.InterestWebtoonDTO responseDTO = new UserResponse.InterestWebtoonDTO(interestWebtoon);
        return responseDTO;
    }


    
    // MY 관심웹툰목록
    public List<UserResponse.InterestWebtoonDTO> interest(int userId) {

        List<InterestWebtoon> interestWeboonList = interestWebtoonRepository.findByUserId(userId, Sort.by(Sort.Order.desc("id")));
        List<UserResponse.InterestWebtoonDTO> responseDTOList = interestWeboonList.stream()
                .map(t -> new UserResponse.InterestWebtoonDTO(t))
                .collect(Collectors.toList());

        return responseDTOList;
    }

    

    // 관심 작가 알림켜기
    @Transactional
    public UserResponse.InterestAuthorDTO interestAuthorAlarmOn(int userId, int authorId) {

        List<InterestAuthor> interestAuthorList = interestAuthorRepository.findByUserIdAndAuthorId(userId, authorId);

        if (interestAuthorList.size() != 1) {
            throw new Exception400("관심웹툰이아닌데");
        }

        InterestAuthor interestAuthor = interestAuthorList.get(0);

        if(interestAuthor.getIsAlarm() == true){
            throw new Exception400("이미알람켜져있음");
        }

        interestAuthor.setIsAlarm(true);

        UserResponse.InterestAuthorDTO responseDTO = new UserResponse.InterestAuthorDTO(interestAuthor);
        return responseDTO;
    }




    // 관심 작가 알림끄기
    @Transactional
    public UserResponse.InterestAuthorDTO interestAuthorAlarmOff(int userId, int authorId) {

        List<InterestAuthor> interestAuthorList = interestAuthorRepository.findByUserIdAndAuthorId(userId, authorId);

        if (interestAuthorList.size() != 1) {
            throw new Exception400("관심웹툰이아닌데");
        }

        InterestAuthor interestAuthor = interestAuthorList.get(0);

        if(interestAuthor.getIsAlarm() == false){
            throw new Exception400("이미알람꺼져있음");
        }

        interestAuthor.setIsAlarm(false);

        UserResponse.InterestAuthorDTO responseDTO = new UserResponse.InterestAuthorDTO(interestAuthor);
        return responseDTO;
    }



    // MY 관심작가목록
    public UserResponse.MyAuthorAllDTO interestAuthor(int userId) {

        List<InterestAuthor> interestAuthorList = interestAuthorRepository.findByUserId(userId, Sort.by(Sort.Order.desc("id")));

        List<UserResponse.InterestAuthorDTO> interestAuthorDTOList = interestAuthorList.stream()
                .map(t -> new UserResponse.InterestAuthorDTO(t))
                .collect(Collectors.toList());



        List<Author> myAuthorList = interestAuthorList.stream()
                .map(interestAuthor -> interestAuthor.getAuthor())
                .collect(Collectors.toList());

        // List<Author> recommendAuthorList = interestWebtoonRepository.findByUserId(userId).stream()
        //         .flatMap(interestWebtoon -> interestWebtoon.getWebtoon().getWebtoonAuthorList().stream())
        //         .map(webtoonAuthor -> webtoonAuthor.getAuthor())
        //         .distinct()
        //         .filter(author -> !(myAuthorList.contains(author)) )
        //         .collect(Collectors.toList());

        Map<Integer, String> AuthorIdWebtoonTitleMap = new HashMap<>();
        
        List<UserResponse.RecommendAuthorDTO> recommendAuthorDTOList = interestWebtoonRepository.findByUserId(userId).stream()
                // .map(interestWebtoon -> interestWebtoon.getWebtoon())
                .flatMap(interestWebtoon -> interestWebtoon.getWebtoon().getWebtoonAuthorList().stream())
                .map(webtoonAuthor -> {
                    AuthorIdWebtoonTitleMap.put(webtoonAuthor.getAuthor().getId(), webtoonAuthor.getWebtoon().getTitle());
                    return webtoonAuthor.getAuthor();
                })
                // .map(webtoonAuthor -> webtoonAuthor.getAuthor())
                .distinct()
                .filter(author -> !(myAuthorList.contains(author)) )
                .map(author -> new UserResponse.RecommendAuthorDTO(author, AuthorIdWebtoonTitleMap.get(author.getId())))
                .collect(Collectors.toList());

        

        UserResponse.MyAuthorAllDTO responseDTO = new UserResponse.MyAuthorAllDTO(interestAuthorDTOList, recommendAuthorDTOList);

        return responseDTO;
    }




    @Transactional
    public void join(UserRequest.JoinDTO requestDTO) {
        try {
            User user = requestDTO.toEntity();
            user.setUserTypeEnum(UserTypeEnum.NORMAL); // 일반 가입창으로 가입하면 무조건 노말유저
            user.setCookie(0); // 가입하면 기본 쿠키 무조건 0
            userJPARepository.save(user);
        } catch (Exception e) {
            throw new Exception500("unknown server error");
        }
    }

    public UserResponse.loginResponseDTO autologin(User sessionUser) {

        User userPS = userJPARepository.findById(sessionUser.getId())
                .orElseThrow(() -> new Exception400("자동로그인 오류"));

        String jwt = JwtTokenUtils.create(userPS);

        UserResponse.loginResponseDTO responseDTO = new UserResponse.loginResponseDTO(userPS);
        responseDTO.setJwt(jwt);


        return responseDTO;
    }


    public UserResponse.loginResponseDTO login(UserRequest.LoginDTO requestDTO) {
        System.out.println("로그1");
        User userPS = userJPARepository.findByEmailAndPassword(requestDTO.getEmail(), requestDTO.getPassword())
                .orElseThrow(() -> new Exception400("email이나 password가 틀림 : " + requestDTO.getEmail()));
        // System.out.println("테스트"+userPS); // onetown author 있으면 무한참조오류

        String jwt = JwtTokenUtils.create(userPS);

        UserResponse.loginResponseDTO responseDTO = new UserResponse.loginResponseDTO(userPS);
        responseDTO.setJwt(jwt);

        System.out.println("로그2");

        return responseDTO;
    }

    @Transactional
    public UserResponse.UpdateResponseDTO update(UserRequest.UpdateDTO requestDTO, User sessionUser) {

        User user = userJPARepository.findById(sessionUser.getId())
                .orElseThrow(() -> new Exception400("오류 : " + requestDTO.getEmail()));

        System.out.println(requestDTO.getEmail());
        System.out.println(sessionUser.getEmail());
        if (!(requestDTO.getEmail().equals(sessionUser.getEmail()))) {
            throw new Exception400("로그인 유저랑 변경하려는 유저가 다름 : " + requestDTO.getEmail());
        }

        user.setUsername(requestDTO.getUsername());
        user.setPassword(requestDTO.getPassword());
        user.setCookie(requestDTO.getCookie());

        UserResponse.UpdateResponseDTO responseDTO = new UserResponse.UpdateResponseDTO(user);

        return responseDTO;
    }

}