package com.example.kakao.episode;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception401;
import com.example.kakao._core.errors.exception.Exception403;
import com.example.kakao._core.errors.exception.Exception404;
import com.example.kakao._core.utils.ImageUtils;
import com.example.kakao._entity.AuthorBoard;
import com.example.kakao._entity.EpisodePhoto;
import com.example.kakao._entity.LikeEpisode;
import com.example.kakao._entity.enums.UserTypeEnum;
import com.example.kakao._repository.EpisodePhotoRepository;
import com.example.kakao._repository.LikeEpisodeRepository;
import com.example.kakao.author.AuthorRequest;
import com.example.kakao.author.AuthorResponse;
import com.example.kakao.user.User;
import com.example.kakao.webtoon.Webtoon;
import com.example.kakao.webtoon.WebtoonRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class EpisodeService {

    private final EpisodeRepository episodeRepository;
    private final LikeEpisodeRepository likeEpisodeRepository;
    private final EpisodePhotoRepository episodePhotoRepository;
    private final WebtoonRepository webtoonRepository;





    // 에피소드 추가
    @Transactional
    public EpisodeResponse.CreateDTO create(EpisodeRequest.CreateDTO requestDTO, List<MultipartFile> photoList, User sessionUser) {

        Webtoon webtoon = webtoonRepository.findById(requestDTO.getWebtoonId())
                .orElseThrow(() -> new Exception404(requestDTO.getWebtoonId() + "없음"));

        if(sessionUser.getUserTypeEnum() == UserTypeEnum.AUTHOR){
            webtoon.getWebtoonAuthorList().stream()
                    .map(webtoonAuthor -> webtoonAuthor.getAuthor().getUser().getId())
                    .filter(userId -> userId == sessionUser.getId())
                    .findFirst()
                    .orElseThrow(() -> new Exception403("어드민이 아니고 웹툰"+requestDTO.getWebtoonId()+"의 작가도 아님"));
        }
        
        if(requestDTO.getThumbnailPhoto()==null){
            throw new Exception400("썸네일 없음");
        }

        String thumbnailFileName = ImageUtils.updateImage(requestDTO.getThumbnailPhoto(), "EpisodeThumbnail/");

        Episode episode = Episode.builder()
                .webtoon(Webtoon.builder().id(requestDTO.getWebtoonId()).build())
                .detailTitle(requestDTO.getDetailTitle())
                .authorText(requestDTO.getAuthorText())
                .thumbnail(thumbnailFileName)
                .cookieCost(0)
                .starCount(0.0)
                .starScore(0.0)
                .build();

        try {
            episodeRepository.save(episode);
        } catch (Exception e) {
            throw new Exception400("에피소드타이틀중복");
        }
        
        System.err.println("episode세이브됨");
        System.err.println(episode.getId());
        System.err.println("2episode세이브됨");

        try {
            photoList.stream()
                    .map(multipartFile -> {
                        System.err.println("스트림실행에피소드포토저장1-1");
                        String fileName = ImageUtils.updateImage(multipartFile, "EpisodePhoto/");
                        EpisodePhoto episodePhoto = EpisodePhoto.builder().episode(episode).photoURL(fileName).build();
                        episodePhotoRepository.save(episodePhoto);
                        System.err.println("스트림실행에피소드포토저장1-2");
                        return episodePhoto;
                    })
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.err.println("스트림 캐치로");
            throw new Exception400("에피소드 사진 없음");
        }

        System.out.println("스트림끝");
        

        EpisodeResponse.CreateDTO responseDTO = new EpisodeResponse.CreateDTO(episode);
        return responseDTO;
    }





    // 에피소드 좋아요
    @Transactional
    public EpisodeResponse.LikeDTO like(int userId, int episodeId) {

        Episode episode = episodeRepository.findById(episodeId)
                .orElseThrow(() -> new Exception404(episodeId + "없음"));

        List<LikeEpisode> leList = likeEpisodeRepository.findByUserIdAndEpisodeId(userId, episodeId);

        // 좋아요랑 별점 테이블 하나로 처리하려고
        if (leList.size() != 0) {
            LikeEpisode le = leList.get(0);

            if (le.getIsLike() == null || le.getIsLike() == false) {
                le.setIsLike(true);
                EpisodeResponse.LikeDTO responseDTO = new EpisodeResponse.LikeDTO(le);
                return responseDTO;
            }
            throw new Exception400("이미했음");
        }


        LikeEpisode le = LikeEpisode.builder()
                .user(User.builder().id(userId).build())
                .episode(Episode.builder().id(episodeId).build())
                .isLike(true)
                .build();

        likeEpisodeRepository.save(le);

        EpisodeResponse.LikeDTO responseDTO = new EpisodeResponse.LikeDTO(le);
        return responseDTO;
    }


    // 에피소드 좋아요 취소
    @Transactional
    public EpisodeResponse.LikeDTO likeCancel(int userId, int episodeId) {

        Episode episode = episodeRepository.findById(episodeId)
                .orElseThrow(() -> new Exception404(episodeId + "없음"));

        List<LikeEpisode> leList = likeEpisodeRepository.findByUserIdAndEpisodeId(userId, episodeId);

        // 좋아요랑 별점 테이블 하나로 처리하려고
        if (leList.size() != 0) {
            LikeEpisode le = leList.get(0);

            if (le.getIsLike() == null || le.getIsLike() == true) {
                le.setIsLike(false);
                EpisodeResponse.LikeDTO responseDTO = new EpisodeResponse.LikeDTO(le);
                return responseDTO;
            }
            throw new Exception400("이미했음");
        }


        LikeEpisode le = LikeEpisode.builder()
                .user(User.builder().id(userId).build())
                .episode(Episode.builder().id(episodeId).build())
                .isLike(false)
                .build();

        likeEpisodeRepository.save(le);

        EpisodeResponse.LikeDTO responseDTO = new EpisodeResponse.LikeDTO(le);
        return responseDTO;
    }


    // 에피소드 별점 주기
    @Transactional
    public EpisodeResponse.StarDTO starSave(int userId, int episodeId, int score) {

        Episode episode = episodeRepository.findById(episodeId)
                .orElseThrow(() -> new Exception404(episodeId + "없음"));

        double afterCount = episode.getStarCount() + 1;
        double afterScore = episode.getStarScore() + score;


        List<LikeEpisode> leList = likeEpisodeRepository.findByUserIdAndEpisodeId(userId, episodeId);

        // 좋아요랑 별점 테이블 하나로 처리하려고
        if (leList.size() != 0) {
            LikeEpisode le = leList.get(0);

            if (le.getIsStar() == null || le.getIsStar() == false) {
                le.setIsStar(true);

                episode.setStarCount(afterCount);
                episode.setStarScore(afterScore);

                EpisodeResponse.StarDTO responseDTO = new EpisodeResponse.StarDTO(le, afterCount, afterScore);
                return responseDTO;
            }
            throw new Exception400("이미했음");
        }


        LikeEpisode le = LikeEpisode.builder()
                .user(User.builder().id(userId).build())
                .episode(Episode.builder().id(episodeId).build())
                .isStar(true)
                .build();

        episode.setStarCount(afterCount);
        episode.setStarScore(afterScore);

        likeEpisodeRepository.save(le);

        EpisodeResponse.StarDTO responseDTO = new EpisodeResponse.StarDTO(le, afterCount, afterScore);
        return responseDTO;
    }


    // 에피소드 한편 보기
    public EpisodeResponse.FindByIdDTO findById(int episodeId, Integer userId) {
        System.out.println("테스트31");
        Episode episode = episodeRepository.findById(episodeId)
                .orElseThrow(() -> new Exception404(episodeId + "없음"));
        // if (userId != null) {

            System.out.println("테스트32");

            List<LikeEpisode> myLikeEpisode = likeEpisodeRepository.findByUserIdAndEpisodeId(userId, episodeId);

            System.out.println("테스트33");
            EpisodeResponse.FindByIdDTO responseDTO = new EpisodeResponse.FindByIdDTO(episode, myLikeEpisode);
            System.out.println("테스트34여기안나옴");

            return responseDTO;


        // } else {
        //    EpisodeResponse.FindByIdDTO responseDTO = new EpisodeResponse.FindByIdDTO(episode, null);
        //    responseDTO.setLike(false);
        //    return responseDTO;            
        // }
        

       
        // if(responseDTO.getWebtoonId() != webtoonId){
        //     throw new Exception400(webtoonId+"웹툰에 "+episodeId+"에피소드가 속하지않음");
        // }


    }


    // (기능1) 상품 목록보기
    // public List<WebtoonResponse.FindAllDTO> findAll(int page) {
    // public List<EpisodeResponse.FindAllDTO> findAll() {
    //     List<Webtoon> webtoonList = webtoonRepository.findAll();

    //     List<EpisodeResponse.FindAllDTO> dtoList =  webtoonList.stream()
    //             .map( webtoon -> new EpisodeResponse.FindAllDTO(webtoon) )
    //             .collect(Collectors.toList());

    //     return dtoList;
    // }

    // // (기능2) 상품 상세보기
    // public ProductResponse.FindByIdDTO findById(int id) {
    //     return null;
    // }

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
