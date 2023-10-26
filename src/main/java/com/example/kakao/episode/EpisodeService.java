package com.example.kakao.episode;

import com.example.kakao._core.errors.exception.Exception404;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class EpisodeService {

    private final EpisodeRepository episodeRepository;

    public EpisodeResponse.FindByIdDTO findById(int episodeId) {
        Episode episode = episodeRepository.findById(episodeId)
                .orElseThrow(() -> new Exception404(episodeId + "없음"));

        EpisodeResponse.FindByIdDTO responseDTO = new EpisodeResponse.FindByIdDTO(episode);

        // if(responseDTO.getWebtoonId() != webtoonId){
        //     throw new Exception400(webtoonId+"웹툰에 "+episodeId+"에피소드가 속하지않음");
        // }

        return responseDTO;
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
