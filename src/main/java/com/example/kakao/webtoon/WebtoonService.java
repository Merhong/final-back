package com.example.kakao.webtoon;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception401;
import com.example.kakao._core.errors.exception.Exception404;
import com.example.kakao.entity.InterestWebtoon;
import com.example.kakao.entity.enums.WebtoonSpeciallyEnum;
import com.example.kakao.repository.InterestWebtoonRepository;
import com.example.kakao.user.User;
import com.example.kakao.webtoon.WebtoonResponse;
import com.example.kakao.webtoon.WebtoonResponse.InterestDTO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class WebtoonService {

    private final WebtoonRepository webtoonRepository;
    private final InterestWebtoonRepository interestWebtoonRepository;
    

    // 웹툰목록보기
    // public List<WebtoonResponse.FindAllDTO> findAll(int page) {
    public List<WebtoonResponse.FindAllDTO> findAll() {
        List<Webtoon> webtoonList = webtoonRepository.findAll();
        

        // this.likeCommentCount = comment.getLikeCommentList().stream()
        // .map(t -> (t.getIsLike() == true) ? 1 : 0)
        // .reduce(0, (a, b) -> a + b);

        
        List<WebtoonResponse.FindAllDTO> DTOList = webtoonList.stream()
                .map(webtoon -> {
                    double totalStarCount = webtoon.getEpisodeList().stream()
                            .map( episode -> episode.getStarCount() )
                            .reduce(0.0, (a, b) -> a + b);
                    webtoon.setStarCount(totalStarCount);
                    return webtoon;
                })
                .map(webtoon -> {
                    double totalStarScore = webtoon.getEpisodeList().stream()
                            .map( episode -> episode.getStarScore() )
                            .reduce(0.0, (a, b) -> a + b);
                    webtoon.setStarScore(totalStarScore);
                    return webtoon;
                })
                .map( webtoon -> new WebtoonResponse.FindAllDTO(webtoon) )
                .collect(Collectors.toList());


        return DTOList;
    }

    // 웹툰상세보기
    public WebtoonResponse.FindByIdDTO findById(int id) {
        
        Webtoon webtoon = webtoonRepository.findById(id)
                .orElseThrow(() -> new Exception404(id+"없음"));
        
        webtoon.setStarScore(
            webtoon.getEpisodeList().stream()
                    .map( episode -> episode.getStarScore() )
                    .reduce(0.0, (a, b) -> a + b)
        );
        webtoon.setStarCount(
            webtoon.getEpisodeList().stream()
                    .map( episode -> episode.getStarCount() )
                    .reduce(0.0, (a, b) -> a + b)
        );

        return new WebtoonResponse.FindByIdDTO(webtoon);
    }

    // 관심웹툰추가
    @Transactional
    public WebtoonResponse.InterestDTO interestSave(int userId, int webtoonId) {

        // List<InterestWebtoon> iwCheckList = interestWebtoonRepository.findByUserIdAndWebtoonId(userId, webtoonId);
        // // List<WebtoonResponse.InterestDto> iw2List = iw2.stream()
        // //         .map(t -> new WebtoonResponse.InterestDto(t))
        // //         .collect(Collectors.toList());

        // if(iwCheckList.size() != 0){
        //     throw new Exception400("이미관심웹툰임");
        // }

        InterestWebtoon iw = InterestWebtoon.builder()
            .user(User.builder().id(userId).build())
            .webtoon(Webtoon.builder().id(webtoonId).build())
            .isAlarm(true)
            .build();

        Webtoon webtoon = webtoonRepository.findById(webtoonId)
            .orElseThrow(() -> new Exception404(webtoonId+"없음"));
        int webtoonTotalInterest = webtoon.getInterstWebtoonList().size();

        try {
            interestWebtoonRepository.save(iw);
        } catch (Exception e) {
            throw new Exception400("이미관심웹툰임");
        }

        WebtoonResponse.InterestDTO responseDTO = new WebtoonResponse.InterestDTO(iw, ++webtoonTotalInterest);

        return responseDTO;
    }

    // 관심웹툰 제거
    @Transactional
    public WebtoonResponse.InterestDTO interestDelete(int userId, int webtoonId) {
        
        List<InterestWebtoon> iwCheckList = interestWebtoonRepository.findByUserIdAndWebtoonId(userId, webtoonId);
        // List<WebtoonResponse.InterestDto> iw2List = iw2.stream()
        //         .map(t -> new WebtoonResponse.InterestDto(t))
        //         .collect(Collectors.toList());

        Webtoon webtoon = webtoonRepository.findById(webtoonId)
            .orElseThrow(() -> new Exception404(webtoonId+"없음"));
        int webtoonTotalInterest = webtoon.getInterstWebtoonList().size();

        if(iwCheckList.size() == 0){
            throw new Exception400("이미삭제함");
        }

        interestWebtoonRepository.deleteById(iwCheckList.get(0).getId());

        WebtoonResponse.InterestDTO responseDTO = new WebtoonResponse.InterestDTO(iwCheckList.get(0), webtoonTotalInterest);

        return responseDTO;
    }

    public List<WebtoonResponse.EndRecommendationDTO> endRecommendation(){
        List<Webtoon> webtoonList = webtoonRepository.findByWebtoonSpeciallyEnum(WebtoonSpeciallyEnum.완결);
        List<WebtoonResponse.EndRecommendationDTO> endRecommendationDTOList = webtoonList.stream()
                                                                            .map(w -> new WebtoonResponse.EndRecommendationDTO(w))
                                                                            .collect(Collectors.toList());
        return endRecommendationDTOList;                                                                  



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
}
