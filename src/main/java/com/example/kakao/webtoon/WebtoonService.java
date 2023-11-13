package com.example.kakao.webtoon;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception401;
import com.example.kakao._core.errors.exception.Exception404;
import com.example.kakao._core.utils.ImageUtils;
import com.example.kakao._entity.AdvertisingMain;
import com.example.kakao._entity.AdvertisingSub;
import com.example.kakao._entity.InterestWebtoon;
import com.example.kakao._entity.RecentWebtoon;
import com.example.kakao._entity.WebtoonAuthor;
import com.example.kakao._entity.enums.WebtoonSpeciallyEnum;
import com.example.kakao._repository.AdvertisingMainRepository;
import com.example.kakao._repository.AdvertisingSubRepository;
import com.example.kakao._repository.InterestWebtoonRepository;
import com.example.kakao._repository.RecentWebtoonRepository;
import com.example.kakao._repository.WebtoonAuthorRepository;
import com.example.kakao.author.Author;
import com.example.kakao.author.AuthorJPARepository;
import com.example.kakao.episode.Episode;
import com.example.kakao.episode.EpisodeRepository;
import com.example.kakao.user.User;
import com.example.kakao.user.UserJPARepository;
import com.example.kakao.webtoon.WebtoonResponse.FindByIdDTO.EpisodeDTO;

import lombok.RequiredArgsConstructor;

import org.apache.logging.log4j.util.PropertySource.Comparator;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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
    private final WebtoonAuthorRepository webtoonAuthorRepository;
    private final AuthorJPARepository authorRepository;


    
    
    
    // 웹툰 추가
    @Transactional
    public WebtoonResponse.CreateDTO create(WebtoonRequest.CreateDTO requestDTO) {
        
        // System.out.println(requestDTO);
        // try {
        //     System.out.println(requestDTO.getImage().getBytes());
        //     System.out.println(requestDTO.getImage().getSize());
        // } catch (IOException e) {
        //     System.out.println("오류");
        //     e.printStackTrace();
        // }

        if(requestDTO.getAgeLimit()>20 || requestDTO.getAgeLimit()<0){
            throw new Exception400("나이제한오류");
        }
            
        String pattern = "^(월|화|수|목|금|토|일)(?!.*\\1).*+$";
        if( !(requestDTO.getWebtoonWeekDayEnum().matches(pattern)) ){
            throw new Exception400("요일오류");
        }
        

        List<Webtoon> titleCheckList = webtoonRepository.findByTitle(requestDTO.getTitle());
        if(titleCheckList.size() != 0){
            throw new Exception400("웹툰제목중복 : "+requestDTO.getTitle());
        }
        
        List<Author> authorTempList = authorRepository.findAll();
        List<String> authorNameList = requestDTO.getAuthorNameList();

        List<Integer> authorIdList = authorTempList.stream()
                .filter(author -> authorNameList.contains(author.getAuthorNickname()))
                .map(author -> author.getId())
                .collect(Collectors.toList());
                
        if(authorIdList.size() != authorNameList.size()){
            throw new Exception400("작가이름없음");
        }
        
        String imageFileName = ImageUtils.updateImage(requestDTO.getImage(), "WebtoonThumbnail/");

        Webtoon webtoon = requestDTO.toEntity();
        webtoon.setImage(imageFileName);
        
        webtoonRepository.save(webtoon);
        // Webtoon webtoon = webtoonRepository.findByTitle(requestDTO.getTitle()).get(0);

        List<WebtoonAuthor> webtoonAuthorList = authorIdList.stream()
                .map( authorId -> WebtoonAuthor.builder()
                        .author(Author.builder().id(authorId).build())
                        .webtoon(webtoon)
                        .build() )
                .collect(Collectors.toList());
        webtoonAuthorList.stream()
                .map(t -> webtoonAuthorRepository.save(t))
                .collect(Collectors.toList());
                
        WebtoonResponse.CreateDTO responseDTO = new WebtoonResponse.CreateDTO(webtoon);
        return responseDTO;
    }



    // 웹툰 수정
    @Transactional
    public WebtoonResponse.CreateDTO update(WebtoonRequest.UpdateDTO requestDTO) {
        
        System.out.println(requestDTO);

        List<Webtoon> tempWebtoonList = webtoonRepository.findByTitle(requestDTO.getTitle());
        if(tempWebtoonList.size() != 1){
            throw new Exception400("웹툰찾기오류 : "+requestDTO.getTitle());
        }
        Webtoon webtoon = tempWebtoonList.get(0);

        if( !(requestDTO.getIntro().isEmpty()) ){
            webtoon.setIntro(requestDTO.getIntro());
        }

        if(requestDTO.getAgeLimit() != null){
            if(requestDTO.getAgeLimit()>20 || requestDTO.getAgeLimit()<0){
                throw new Exception400("나이제한오류");
            }
            webtoon.setAgeLimit(requestDTO.getAgeLimit());
        }

        if( !(requestDTO.getWebtoonWeekDayEnum().isEmpty()) ){
            String pattern = "^(월|화|수|목|금|토|일)(?!.*\\1).*+$";
            if( !(requestDTO.getWebtoonWeekDayEnum().matches(pattern)) ){
                throw new Exception400("요일오류");
            }
            webtoon.setWebtoonWeekDayEnum(requestDTO.getWebtoonWeekDayEnum());
        }

        if( !(requestDTO.getWebtoonSpeciallyEnum().isEmpty()) ){
            String pattern = "없음|휴재|완결|무료|순위|신작";
            if( !(requestDTO.getWebtoonSpeciallyEnum().matches(pattern)) ){
                throw new Exception400("기타오류");
            }
            webtoon.setWebtoonSpeciallyEnum(WebtoonSpeciallyEnum.valueOf(requestDTO.getWebtoonSpeciallyEnum()));
        }

        if( !(requestDTO.getAddAuthorName().isEmpty()) ){
            Author author = authorRepository.findByAuthorNickname(requestDTO.getAddAuthorName())
                .orElseThrow(() -> new Exception400("작가추가오류"));

            WebtoonAuthor webtoonAuthor = WebtoonAuthor.builder()
                    .author(author)
                    .webtoon(webtoon)
                    .build();

            try {
                webtoonAuthorRepository.save(webtoonAuthor);
            } catch (Exception e) {
                throw new Exception400("이미 작가임 "+requestDTO.getAddAuthorName());
            }
        }

        if( !(requestDTO.getDeleteAuthorName().isEmpty()) ){
            Author author = authorRepository.findByAuthorNickname(requestDTO.getDeleteAuthorName())
                .orElseThrow(() -> new Exception400("작가삭제오류"));

            webtoonAuthorRepository.deleteByWebtoonIdAndAuthorId(webtoon.getId(), author.getId());
        }
        
        if(requestDTO.getImage().getSize() > 0){
            String imageFileName = ImageUtils.updateImage(requestDTO.getImage(), "WebtoonThumbnail/");
            webtoon.setImage(imageFileName);
        }
                
        WebtoonResponse.CreateDTO responseDTO = new WebtoonResponse.CreateDTO(webtoon);
        return responseDTO;
    }



    // 최근본웹툰 목록
    @Transactional
    public List<WebtoonResponse.RecentDTO> recentFindAll(int sessionUserId) {

        List<RecentWebtoon> recentWebtoonList = recentWebtoonRepository.findByUserId(sessionUserId);

        Map<Integer, RecentWebtoon> filterMap = recentWebtoonList.stream()
        .collect(Collectors.toMap(
            recentWebtoon -> recentWebtoon.getWebtoon().getId(), // Map의 키 Integer
            recentWebtoon -> recentWebtoon, // Map의 밸류 RecentWebtoon
            (a, b) -> a.getUpdatedAt().after(b.getUpdatedAt()) ? a : b 
            ));
            
        List<RecentWebtoon> filterList = new ArrayList<>(filterMap.values());

        List<WebtoonResponse.RecentDTO> responseDTOList = filterList.stream()
                .map(recentWebtoon -> new WebtoonResponse.RecentDTO(recentWebtoon))
                .collect(Collectors.toList());

        responseDTOList = responseDTOList.stream()
                .map(recentDTO -> {
                        int totalCount = recentWebtoonList.stream()
                                // .map(recentWebtoon -> recentWebtoon.getWebtoon())
                                // .findFirst()
                                .filter(recentWebtoon -> recentWebtoon.getWebtoon().getId() == recentDTO.getWebtoonId())
                                .findFirst()
                                .map(recentWebtoon -> recentWebtoon.getWebtoon().getEpisodeList().size())
                                .orElse(-1);

                        int viewCount = (int) recentWebtoonList.stream()
                                .filter(recentWebtoon -> recentWebtoon.getWebtoon().getId() == recentDTO.getWebtoonId())
                                .count();

                        recentDTO.setTotalCount(totalCount);
                        recentDTO.setViewCount(viewCount);
                        // System.err.println("테스트"+totalCount);
                        // System.err.println("테스트"+viewCount);
                    return recentDTO;
                })
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



    // 메인 광고 제거
    @Transactional
    public WebtoonResponse.AdvertisingMainDTO advertisingMainDelete(int advertisingMainId) {
        
        AdvertisingMain advertisingMain = advertisingMainRepository.findById(advertisingMainId)
                .orElseThrow(() -> new Exception404(advertisingMainId + "없음"));

        WebtoonResponse.AdvertisingMainDTO responseDTO = new WebtoonResponse.AdvertisingMainDTO(advertisingMain);

        advertisingMainRepository.delete(advertisingMain);
        
        return responseDTO;
    }




    // 서브 광고 추가
    @Transactional
    public WebtoonResponse.AdvertisingSubDTO advertisingSubSave(WebtoonRequest.AdvertisingSubDTO requestDTO) {

        AdvertisingSub advertisingSub = AdvertisingSub.builder()
                .linkURL(requestDTO.getLinkURL())
                .photo("Advertising/" + ImageUtils.updateImage(requestDTO.getPhoto(), "Advertising/"))
                .build();
      
        try {
            advertisingSubRepository.save(advertisingSub);
        } catch (Exception e) {
            throw new Exception400("실패");
        }

        WebtoonResponse.AdvertisingSubDTO responseDTO = new WebtoonResponse.AdvertisingSubDTO(advertisingSub);

        return responseDTO;
    }





    // 메인 광고 추가
    @Transactional
    public WebtoonResponse.AdvertisingMainDTO advertisingMainSave(WebtoonRequest.AdvertisingMainDTO requestDTO) {

        AdvertisingMain advertisingMain;

        if(requestDTO.getIsWebLink() == true){

            if(requestDTO.getPhoto()==null || requestDTO.getPhoto().isEmpty() 
            || requestDTO.getLinkURL() == null || requestDTO.getLinkURL().isEmpty() 
            || requestDTO.getMainText() == null || requestDTO.getMainText().isEmpty() 
            || requestDTO.getSubText() == null || requestDTO.getSubText().isEmpty()){
                throw new Exception400("웹툰광고가 아니면 모두 입력해야함");
            }

            advertisingMain = AdvertisingMain.builder()
                    .linkURL(requestDTO.getLinkURL())
                    .isWebLink(true)
                    .mainText(requestDTO.getMainText())
                    .subText(requestDTO.getSubText())
                    .photo("Advertising/" + ImageUtils.updateImage(requestDTO.getPhoto(), "Advertising/"))
                    .build();
        } else{
            Webtoon webtoon;
            try {
                webtoon = webtoonRepository.findByTitle(requestDTO.getWebtoonTitle()).get(0);
            } catch (Exception e) {
                throw new Exception400(requestDTO.getWebtoonTitle()+" 제목 웹툰 없음");
            }

            advertisingMain = AdvertisingMain.builder()
                    .webtoon(webtoon)
                    .isWebLink(false)
                    .mainText(requestDTO.getMainText() == null || requestDTO.getMainText().isEmpty() ? webtoon.getTitle() : requestDTO.getMainText() )
                    .subText(requestDTO.getSubText() == null || requestDTO.getSubText().isEmpty() ? 
                            webtoon.getWebtoonAuthorList().stream()
                                    .map(webtoonAuthor -> webtoonAuthor.getAuthor().getAuthorNickname())
                                    .collect(Collectors.joining("/")) 
                            : requestDTO.getSubText() )
                    .photo(requestDTO.getPhoto() == null ? 
                            webtoon.getEpisodeList().size() == 0 ?
                            "WebtoonThumbnail/" + webtoon.getImage()
                            : "EpisodeThumbnail/" + webtoon.getEpisodeList().get(0).getThumbnail() 
                                : "Advertising/" + ImageUtils.updateImage(requestDTO.getPhoto(), "Advertising/"))
                    .build();
        }

        try {
            advertisingMainRepository.save(advertisingMain);
        } catch (Exception e) {
            throw new Exception400("실패");
        }

        WebtoonResponse.AdvertisingMainDTO responseDTO = new WebtoonResponse.AdvertisingMainDTO(advertisingMain);

        return responseDTO;
    }





    // 웹툰목록보기
    // public List<WebtoonResponse.FindAllDTO> findAll(int page) {
    public List<WebtoonResponse.FindAllDTO> findAll(int sessionUserId) {
        List<Webtoon> webtoonList = webtoonRepository.findAll();

        // this.likeCommentCount = comment.getLikeCommentList().stream()
        // .map(t -> (t.getIsLike() == true) ? 1 : 0)
        // .reduce(0, (a, b) -> a + b);


        // Map<Integer, Boolean> interestMap = new HashMap<>();
        List<WebtoonResponse.FindAllDTO> DTOList = webtoonList.stream()
                // .map(webtoon -> {
                //     boolean isInterest = webtoon.getInterstWebtoonList().stream()
                //             .anyMatch(interestWebtoon -> interestWebtoon.getUser().getId() == sessionUserId);
                //     interestMap.put(webtoon.getId(), isInterest);
                //     return webtoon;
                // })
                // .map(webtoon -> {
                //     double totalStarCount = webtoon.getEpisodeList().stream()
                //             .map(episode -> episode.getStarCount())
                //             .reduce(0.0, (a, b) -> a + b);
                //     webtoon.setStarCount(totalStarCount);
                //     return webtoon;
                // })
                // .map(webtoon -> {
                //     double totalStarScore = webtoon.getEpisodeList().stream()
                //             .map(episode -> episode.getStarScore())
                //             .reduce(0.0, (a, b) -> a + b);
                //     webtoon.setStarScore(totalStarScore);
                //     return webtoon;
                // })
                // .map(webtoon -> new WebtoonResponse.FindAllDTO(webtoon, interestMap.get(webtoon.getId())))
                .map(webtoon -> {
                    double totalStarCount = webtoon.getEpisodeList().stream()
                            .map(episode -> episode.getStarCount())
                            .reduce(0.0, (a, b) -> a + b);
                    webtoon.setStarCount(totalStarCount);

                    double totalStarScore = webtoon.getEpisodeList().stream()
                            .map(episode -> episode.getStarScore())
                            .reduce(0.0, (a, b) -> a + b);
                    webtoon.setStarScore(totalStarScore);

                    boolean isInterest = webtoon.getInterstWebtoonList().stream()
                            .anyMatch(interestWebtoon -> interestWebtoon.getUser().getId() == sessionUserId);
                            
                    return new WebtoonResponse.FindAllDTO(webtoon, isInterest);
                })
                .collect(Collectors.toList());



        return DTOList;
    }

    // 웹에서
    public List<WebtoonResponse.FindAllDTO2> findAll2(int sessionUserId) {
        List<Webtoon> webtoonList = webtoonRepository.findAll();

        // this.likeCommentCount = comment.getLikeCommentList().stream()
        // .map(t -> (t.getIsLike() == true) ? 1 : 0)
        // .reduce(0, (a, b) -> a + b);


        // Map<Integer, Boolean> interestMap = new HashMap<>();
        List<WebtoonResponse.FindAllDTO2> DTOList = webtoonList.stream()
                // .map(webtoon -> {
                //     boolean isInterest = webtoon.getInterstWebtoonList().stream()
                //             .anyMatch(interestWebtoon -> interestWebtoon.getUser().getId() == sessionUserId);
                //     interestMap.put(webtoon.getId(), isInterest);
                //     return webtoon;
                // })
                // .map(webtoon -> {
                //     double totalStarCount = webtoon.getEpisodeList().stream()
                //             .map(episode -> episode.getStarCount())
                //             .reduce(0.0, (a, b) -> a + b);
                //     webtoon.setStarCount(totalStarCount);
                //     return webtoon;
                // })
                // .map(webtoon -> {
                //     double totalStarScore = webtoon.getEpisodeList().stream()
                //             .map(episode -> episode.getStarScore())
                //             .reduce(0.0, (a, b) -> a + b);
                //     webtoon.setStarScore(totalStarScore);
                //     return webtoon;
                // })
                // .map(webtoon -> new WebtoonResponse.FindAllDTO(webtoon, interestMap.get(webtoon.getId())))
                .map(webtoon -> {
                    double totalStarCount = webtoon.getEpisodeList().stream()
                            .map(episode -> episode.getStarCount())
                            .reduce(0.0, (a, b) -> a + b);
                    webtoon.setStarCount(totalStarCount);

                    double totalStarScore = webtoon.getEpisodeList().stream()
                            .map(episode -> episode.getStarScore())
                            .reduce(0.0, (a, b) -> a + b);
                    webtoon.setStarScore(totalStarScore);

                    boolean isInterest = webtoon.getInterstWebtoonList().stream()
                            .anyMatch(interestWebtoon -> interestWebtoon.getUser().getId() == sessionUserId);
                            
                    return new WebtoonResponse.FindAllDTO2(webtoon, isInterest);
                })
                .collect(Collectors.toList());



        return DTOList;
    }




    // 웹툰상세보기
    public WebtoonResponse.FindByIdDTO findById(int webtoonId, int sessionUserId) {

        Webtoon webtoon;

        if(webtoonId == -1){ // 랜덤웹툰보기
            List<Webtoon> webtoonRandomList = webtoonRepository.findAll();
            int randomInt = (int) (Math.random() * webtoonRandomList.size());
            webtoon = webtoonRandomList.get(randomInt);
        } else{
            webtoon = webtoonRepository.findById(webtoonId)
                    .orElseThrow(() -> new Exception404(webtoonId + "없음"));
        }

        webtoon.setStarScore( // 에피소드 별점 점수 합계 (분자값) 계산
                webtoon.getEpisodeList().stream()
                        .map(episode -> episode.getStarScore())
                        .reduce(0.0, (a, b) -> a + b)
        );
        webtoon.setStarCount( // 에피소드 별점 횟수 합계 (분모값) 계산
                webtoon.getEpisodeList().stream()
                        .map(episode -> episode.getStarCount())
                        .reduce(0.0, (a, b) -> a + b)
        );

        WebtoonResponse.FindByIdDTO responseDTO = new WebtoonResponse.FindByIdDTO(webtoon);

        // 개인별 좋아요/알람 반영
        List<InterestWebtoon> interestWebtoonList = interestWebtoonRepository.findByUserIdAndWebtoonId(sessionUserId, webtoonId);
        if (interestWebtoonList.size() == 0) {
            responseDTO.setIsInterest(false);
            responseDTO.setIsAlarm(false);
        }
        if (interestWebtoonList.size() == 1) {
            responseDTO.setIsInterest(true);
            responseDTO.setIsAlarm(interestWebtoonList.get(0).getIsAlarm());
        }


        List<RecentWebtoon> recentWebtoonList = recentWebtoonRepository.findByUserIdAndWebtoonId(sessionUserId, webtoonId);
        if(recentWebtoonList.size()==0){
            return responseDTO;
        }

        // 개인별 에피소드 조회 여부 반영
        List<Integer> idList = recentWebtoonList.stream()
                .map(recentWebtoon -> recentWebtoon.getEpisode().getId())
                .collect(Collectors.toList());

        List<EpisodeDTO> episodeDTOList = responseDTO.getEpisodeList().stream()
                .map(episodeDTO -> {
                        if(idList.contains(episodeDTO.getEpisodeId())){
                            episodeDTO.setIsView(true);
                        }
                        return episodeDTO;
                    })
                .collect(Collectors.toList());


        // 개인별 가장 최근에 본 에피소드 반영
        Map<Integer, RecentWebtoon> filterMap = recentWebtoonList.stream()
                .collect(Collectors.toMap(
                        recentWebtoon -> recentWebtoon.getWebtoon().getId(), // Map의 키 Integer
                        recentWebtoon -> recentWebtoon, // Map의 밸류 RecentWebtoon
                        (a, b) -> a.getUpdatedAt().after(b.getUpdatedAt()) ? a : b 
                ));
        List<RecentWebtoon> filterList = new ArrayList<>(filterMap.values());
        int filterInt = filterList.get(0).getEpisode().getId();

        episodeDTOList.stream()
                .filter(episodeDTO -> episodeDTO.getEpisodeId() == filterInt)
                .forEach(episodeDTO -> episodeDTO.setIsLastView(true));


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
