package com.example.kakao.webtoon;

import com.example.kakao._core.errors.exception.Exception404;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class WebtoonService {

    private final WebtoonRepository webtoonRepository;

    // 웹툰목록보기
    // public List<WebtoonResponse.FindAllDTO> findAll(int page) {
    public List<WebtoonResponse.FindAllDTO> findAll() {
        List<Webtoon> webtoonList = webtoonRepository.findAll();

        List<WebtoonResponse.FindAllDTO> DTOList = webtoonList.stream()
                .map(webtoon -> new WebtoonResponse.FindAllDTO(webtoon))
                .collect(Collectors.toList());

        return DTOList;
    }

    // 웹툰상세보기
    public WebtoonResponse.FindByIdDTO findById(int id) {

        Webtoon webtoon = webtoonRepository.findById(id)
                .orElseThrow(() -> new Exception404(id + "없음"));

        return new WebtoonResponse.FindByIdDTO(webtoon);
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
