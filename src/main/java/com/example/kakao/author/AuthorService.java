package com.example.kakao.author;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception404;
import com.example.kakao._core.utils.ImageUtils;
import com.example.kakao._entity.AuthorBoard;
import com.example.kakao._entity.InterestAuthor;
import com.example.kakao._entity.enums.UserTypeEnum;
import com.example.kakao._repository.AuthorBoardRepository;
import com.example.kakao._repository.InterestAuthorRepository;
import com.example.kakao.user.User;
import com.example.kakao.user.UserJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class AuthorService {

    private final AuthorJPARepository authorRepository;
    private final InterestAuthorRepository interestAuthorRepository;
    private final UserJPARepository userRepository;
    private final AuthorBoardRepository authorBoardRepository;







    // 작가페이지 (작가별 작가의글)
    public AuthorResponse.AuthorDetailDTO authorDetail(int authorId, int sessionUserId) {
        Author author = authorRepository.findById(authorId)
                .orElseThrow(() -> new Exception404(authorId+"작가없음"));

        AuthorResponse.AuthorDetailDTO responseDTO = new AuthorResponse.AuthorDetailDTO(author);

        
        List<InterestAuthor> interestAuthorList = interestAuthorRepository.findByUserIdAndAuthorId(sessionUserId, authorId);
        if (interestAuthorList.size() == 0) {
            responseDTO.setIsInterest(false);
        }
        if (interestAuthorList.size() == 1) {
            responseDTO.setIsInterest(true);
        }

        return responseDTO;
    }




    // 작가의글 추가
    @Transactional
    public AuthorResponse.CreateBoardDTO createBoard(AuthorRequest.CreateBoardDTO requestDTO, User sessionUser) {

        String fileName = ImageUtils.updateImage(requestDTO.getPhoto(), "AuthorBoard/");

        AuthorBoard authorBoard = AuthorBoard.builder()
                .author(authorRepository.findByUserId(sessionUser.getId())
                        .orElseThrow(() -> new Exception404("작가가없음")))
                .title(requestDTO.getTitle())
                .text(requestDTO.getText())
                .photo(fileName)
                .build();

        authorBoardRepository.save(authorBoard);
        
        AuthorResponse.CreateBoardDTO responseDTO = new AuthorResponse.CreateBoardDTO(authorBoard);
        return responseDTO;
    }





    // 작가 추가
    @Transactional
    public AuthorResponse.CreateDTO create(AuthorRequest.CreateDTO requestDTO) {
        
        User authorUser = userRepository.findById(requestDTO.getUserId())
                .orElseThrow(() -> new Exception404("유저없음 "+requestDTO.getUserId()));

        if(authorUser.getUserTypeEnum()!=UserTypeEnum.NORMAL){
            throw new Exception400("일반유저아님 "+requestDTO.getUserId());
        }

        Author author = requestDTO.toEntity();
        authorRepository.save(author);

        authorUser.setUserTypeEnum(UserTypeEnum.AUTHOR);


        AuthorResponse.CreateDTO responseDTO = new AuthorResponse.CreateDTO(author);
        return responseDTO;
    }




    // 작가 수정
    @Transactional
    public AuthorResponse.UpdateDTO update(AuthorRequest.UpdateDTO requestDTO, User sessionUser) {

        Author author = authorRepository.findByUserId(sessionUser.getId())
                .orElseThrow(() -> new Exception404("작가수정실패 작가못찾음"));
        
        if( requestDTO.getAuthorPhoto() != null && !(requestDTO.getAuthorPhoto().isEmpty()) ){
            String fileName = ImageUtils.updateImage(requestDTO.getAuthorPhoto(), "AuthorPhoto/");
            author.setAuthorPhoto(fileName);
            author.getAuthorPhoto();
        System.err.println("실행1");
        }
        if( requestDTO.getIntroduce() != null && !(requestDTO.getIntroduce().isEmpty()) ){
            author.setIntroduce(requestDTO.getIntroduce());
        }
        if( requestDTO.getSiteURL() != null && !(requestDTO.getSiteURL().isEmpty()) ){
            author.setSiteURL(requestDTO.getSiteURL());
        }

        System.err.println("실행2");

        AuthorResponse.UpdateDTO responseDTO = new AuthorResponse.UpdateDTO(author);
        return responseDTO;
    }



    // 관심작가추가
    @Transactional
    public AuthorResponse.InterestDTO interestSave(int userId, int authorId) {

        InterestAuthor ia = InterestAuthor.builder()
                .user(User.builder().id(userId).build())
                .author(Author.builder().id(authorId).build())
                .isAlarm(true)
                .build();

        Author author = authorRepository.findById(authorId)
                .orElseThrow(() -> new Exception404(authorId + "없음"));

        try {
            interestAuthorRepository.save(ia);
        } catch (Exception e) {
            throw new Exception400("이미관심작가임");
        }

        AuthorResponse.InterestDTO responseDTO = new AuthorResponse.InterestDTO(ia);

        return responseDTO;
    }

    // 관심작가 제거
    @Transactional
    public AuthorResponse.InterestDTO interestDelete(int userId, int authorId) {

        List<InterestAuthor> iaCheckList = interestAuthorRepository.findByUserIdAndAuthorId(userId, authorId);

        Author author = authorRepository.findById(authorId)
                .orElseThrow(() -> new Exception404(authorId + "없음"));

        if (iaCheckList.size() == 0) {
            throw new Exception400("이미삭제함");
        }

        interestAuthorRepository.deleteById(iaCheckList.get(0).getId());

        AuthorResponse.InterestDTO responseDTO = new AuthorResponse.InterestDTO(iaCheckList.get(0));

        return responseDTO;
    }


    // // 상품조회 + 옵션조회
    // public ProductResponse.FindByIdV1DTO findByIdV1(int id) {
    //     Product productPS = productJPARepository.findById(id)
    //             .orElseThrow(() -> new Exception404("해당 id의 상품을 찾을 수 없습니다 : " + id));

    //     List<Option> optionsPS = optionJPARepository.findByProductId(id);

    //     return new ProductResponse.FindByIdV1DTO(productPS, optionsPS);
    // }

    // // 양방향 조회
    // public ProductResponse.FindByIdV2DTO findByIdV2(int id) {
    //     Product productPS = productJPARepository.findById(id)
    //             .orElseThrow(() -> new Exception404("해당 id의 상품을 찾을 수 없습니다 : " + id));
    //     System.out.println("아직 option을 Lazy Loading 하기 전입니다 =============");
    //     return new ProductResponse.FindByIdV2DTO(productPS);
    // }

    // // 옵션만 조회
    // public ProductResponse.FindByIdV3DTO findByIdV3(int id) {
    //     List<Option> optionsPS = optionJPARepository.findByProductId(id);
    //     return new ProductResponse.FindByIdV3DTO(optionsPS);
    // }

    // // 엔티티 응답
    // public List<Option> findByIdV4(int id) {
    //     List<Option> optionsPS = optionJPARepository.findByProductId(id);
    //     return optionsPS;
    // }
}
