package com.example.kakao.webtoon;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception404;
import com.example.kakao._entity.AdvertisingMain;
import com.example.kakao._entity.AdvertisingSub;
import com.example.kakao._entity.InterestWebtoon;
import com.example.kakao._entity.RecentWebtoon;
import com.example.kakao._entity.enums.WebtoonSpeciallyEnum;
import com.example.kakao._repository.AdvertisingMainRepository;
import com.example.kakao._repository.AdvertisingSubRepository;
import com.example.kakao._repository.InterestWebtoonRepository;
import com.example.kakao._repository.RecentWebtoonRepository;
import com.example.kakao.episode.Episode;
import com.example.kakao.episode.EpisodeRepository;
import com.example.kakao.user.User;
import com.example.kakao.user.UserJPARepository;
import lombok.RequiredArgsConstructor;

import org.apache.logging.log4j.util.PropertySource.Comparator;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class WebtoonService {

    private final WebtoonRepository webtoonRepository;
    private final UserJPARepository userRepository;
    private final InterestWebtoonRepository interestWebtoonRepository;
    private final AdvertisingMainRepository advertisingMainRepository;
    private final AdvertisingSubRepository advertisingSubRepository;
    private final EpisodeRepository episodeRepository;
    private final RecentWebtoonRepository recentWebtoonRepository;



    // 최근본웹툰 목록
    @Transactional
    public List<WebtoonResponse.RecentDTO> recentFindAll(int sessionUserId) {

        List<RecentWebtoon> recentWebtoonList = recentWebtoonRepository.findByUserId(sessionUserId);
        // List<RecentWebtoon> recentWebtoonList = recentWebtoonRepository.findByUserId(sessionUserId);
        
        Map<Integer, RecentWebtoon> latestByWebtoonId = recentWebtoonList.stream()
        .collect(Collectors.toMap(
            recentWebtoon -> recentWebtoon.getWebtoon().getId(), // Map의 키 Integer
            recentWebtoon -> recentWebtoon, // Map의 밸류 RecentWebtoon
            (a, b) -> a.getUpdatedAt().after(b.getUpdatedAt()) ? a : b 
            ));
            
        List<RecentWebtoon> filterList = new ArrayList<>(latestByWebtoonId.values());

        // System.out.println(recentWebtoonList.size());
        // System.out.println(filterList.size());

        // for (RecentWebtoon asd : recentWebtoonList) {
        //     System.out.println(asd.getEpisode().getDetailTitle());
        // }
        // System.out.println("테스트++++++++++++++++++++++++++++++++");
        // for (RecentWebtoon recentWebtoon2 : filterList) {
        //     System.out.println(recentWebtoon2.getEpisode().getDetailTitle());
        // }

        List<WebtoonResponse.RecentDTO> responseDTOList = filterList.stream()
                .map(recentWebtoon -> new WebtoonResponse.RecentDTO(recentWebtoon))
                .collect(Collectors.toList());

        return responseDTOList;
    }


    // 최근본웹툰 추가
    @Transactional
    public WebtoonResponse.RecentDTO recentSave(int sessionUserId, int episodeId) {
        Episode episode = episodeRepository.findById(episodeId)
                .orElseThrow(() -> new Exception404(episodeId + "없음"));

        List<RecentWebtoon> findRecentWebtoonList = recentWebtoonRepository.findByUserIdAndEpisodeId(sessionUserId, episodeId);

        RecentWebtoon recentWebtoon;
        if(findRecentWebtoonList.size()==0){
            System.out.println("테스트 if 새로만듬");
            recentWebtoon = RecentWebtoon.builder()
            .user(User.builder().id(sessionUserId).build())
            .episode(episode)
            .webtoon(episode.getWebtoon())
            .build();
            recentWebtoonRepository.save(recentWebtoon);
        } else{
            System.out.println("테스트 else 있는거임");
            recentWebtoon = findRecentWebtoonList.get(0);
            recentWebtoon.setUpdatedAt(null);
        }

        // try {
        //     recentWebtoonRepository.save(recentWebtoon); // 더티체킹으로 하면 updatedAt 갱신이 되나?
        // } catch (Exception e) {
        //     throw new Exception400("실패하면안돼는데");
        // }

        WebtoonResponse.RecentDTO responseDTO = new WebtoonResponse.RecentDTO(recentWebtoon);

        return responseDTO;
    }




    // 검색
    public List<WebtoonResponse.SearchDTO> search(String searchText) {
        List<Webtoon> webtoonList = webtoonRepository.findByWebtoonByTitleAndAuthorNickname(searchText, searchText);

        List<WebtoonResponse.SearchDTO> responseDTOList = webtoonList.stream()
                .map(webtoon -> {
                    double totalStarCount = webtoon.getEpisodeList().stream()
                            .map(episode -> episode.getStarCount())
                            .reduce(0.0, (a, b) -> a + b);
                    webtoon.setStarCount(totalStarCount);
                    return webtoon;
                })
                .map(webtoon -> {
                    double totalStarScore = webtoon.getEpisodeList().stream()
                            .map(episode -> episode.getStarScore())
                            .reduce(0.0, (a, b) -> a + b);
                    webtoon.setStarScore(totalStarScore);
                    return webtoon;
                })
                .map(webtoon -> new WebtoonResponse.SearchDTO(webtoon))
                .collect(Collectors.toList());

        return responseDTOList;
    }



    // 서브 광고
    public List<WebtoonResponse.AdvertisingSubDTO> advertisingSub() {
        
        List<AdvertisingSub> advertisingMainList = advertisingSubRepository.findAll();

        List<WebtoonResponse.AdvertisingSubDTO> responseDTOList = advertisingMainList.stream()
                .map(advertisingSub -> new WebtoonResponse.AdvertisingSubDTO(advertisingSub))
                .collect(Collectors.toList());

        return responseDTOList;
    }



    // 메인 광고
    public List<WebtoonResponse.AdvertisingMainDTO> advertisingMain() {
        
        List<AdvertisingMain> advertisingMainList = advertisingMainRepository.findAll();

        List<WebtoonResponse.AdvertisingMainDTO> responseDTOList = advertisingMainList.stream()
                .map(advertisingMain -> new WebtoonResponse.AdvertisingMainDTO(advertisingMain))
                .collect(Collectors.toList());

        return responseDTOList;
    }





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
                            .map(episode -> episode.getStarCount())
                            .reduce(0.0, (a, b) -> a + b);
                    webtoon.setStarCount(totalStarCount);
                    return webtoon;
                })
                .map(webtoon -> {
                    double totalStarScore = webtoon.getEpisodeList().stream()
                            .map(episode -> episode.getStarScore())
                            .reduce(0.0, (a, b) -> a + b);
                    webtoon.setStarScore(totalStarScore);
                    return webtoon;
                })
                .map(webtoon -> new WebtoonResponse.FindAllDTO(webtoon))
                .collect(Collectors.toList());


        return DTOList;
    }

    // 웹툰상세보기
    public WebtoonResponse.FindByIdDTO findById(int webtoonId, int sessionUserId) {

        Webtoon webtoon;
        if(webtoonId == -1){
            List<Webtoon> webtoonRandomList = webtoonRepository.findAll();
            int randomInt = (int) (Math.random() * webtoonRandomList.size());
            webtoon = webtoonRandomList.get(randomInt);
        } else{
            webtoon = webtoonRepository.findById(webtoonId)
                    .orElseThrow(() -> new Exception404(webtoonId + "없음"));
        }

        webtoon.setStarScore(
                webtoon.getEpisodeList().stream()
                        .map(episode -> episode.getStarScore())
                        .reduce(0.0, (a, b) -> a + b)
        );
        webtoon.setStarCount(
                webtoon.getEpisodeList().stream()
                        .map(episode -> episode.getStarCount())
                        .reduce(0.0, (a, b) -> a + b)
        );

        WebtoonResponse.FindByIdDTO responseDTO = new WebtoonResponse.FindByIdDTO(webtoon);

        List<InterestWebtoon> interestWebtoonList = interestWebtoonRepository.findByUserIdAndWebtoonId(sessionUserId, webtoonId);
        if (interestWebtoonList.size() == 0) {
            responseDTO.setIsInterest(false);
            responseDTO.setIsAlarm(false);
        }
        if (interestWebtoonList.size() == 1) {
            responseDTO.setIsInterest(true);
            responseDTO.setIsAlarm(interestWebtoonList.get(0).getIsAlarm());
        }

        return responseDTO;
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
                .orElseThrow(() -> new Exception404(webtoonId + "없음"));
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
                .orElseThrow(() -> new Exception404(webtoonId + "없음"));
        int webtoonTotalInterest = webtoon.getInterstWebtoonList().size();

        if (iwCheckList.size() == 0) {
            throw new Exception400("이미삭제함");
        }

        interestWebtoonRepository.deleteById(iwCheckList.get(0).getId());

        WebtoonResponse.InterestDTO responseDTO = new WebtoonResponse.InterestDTO(iwCheckList.get(0), --webtoonTotalInterest);

        return responseDTO;
    }

    public List<WebtoonResponse.EndRecommendationDTO> endRecommendation() {
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
