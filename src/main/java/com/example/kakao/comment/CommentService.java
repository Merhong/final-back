package com.example.kakao.comment;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception404;
import com.example.kakao.author.Author;
import com.example.kakao.author.AuthorJPARepository;
import com.example.kakao.entity.LikeComment;
import com.example.kakao.entity.LikeEpisode;
import com.example.kakao.entity.WebtoonAuthor;
import com.example.kakao.episode.Episode;
import com.example.kakao.episode.EpisodeRepository;
import com.example.kakao.episode.EpisodeResponse;
import com.example.kakao.repository.LikeCommentRepository;
import com.example.kakao.user.User;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class CommentService {

    private final CommentJPARepository commentRepository;
    private final EpisodeRepository episodeRepository;
    private final LikeCommentRepository likeCommentRepository;



    // 댓글 좋아요
    @Transactional
    public CommentResponse.LikeDTO like(int userId, int commentId) {

        Comment comment = commentRepository.findById(commentId)
            .orElseThrow(() -> new Exception404(commentId+"없음"));
        
        List<LikeComment> lcList = likeCommentRepository.findByUserIdAndCommentId(userId, commentId);
        
        if(lcList.size() != 0){
            LikeComment lc = lcList.get(0);
            
            if( lc.getIsLike()==null  ||  lc.getIsLike()==false ){
                lc.setIsLike(true);
                CommentResponse.LikeDTO responseDTO = new CommentResponse.LikeDTO(lc);
                return responseDTO;
            }
            throw new Exception400("이미했음");
        }

        LikeComment lc = LikeComment.builder()
                .user(User.builder().id(userId).build())
                .comment(Comment.builder().id(commentId).build())
                .isLike(true)
                .build();

        try {
            likeCommentRepository.save(lc);
        } catch (Exception e) {
            throw new Exception400("이미했음");
        }

        CommentResponse.LikeDTO responseDTO = new CommentResponse.LikeDTO(lc);
        return responseDTO;
    }



    // 댓글 싫어요
    @Transactional
    public CommentResponse.LikeDTO dislike(int userId, int commentId) {
        
        Comment comment = commentRepository.findById(commentId)
            .orElseThrow(() -> new Exception404(commentId+"없음"));

        List<LikeComment> lcList = likeCommentRepository.findByUserIdAndCommentId(userId, commentId);
        
        if(lcList.size() != 0){
            LikeComment lc = lcList.get(0);
            
            if( lc.getIsLike()==null  ||  lc.getIsLike()==true ){
                lc.setIsLike(false);
                CommentResponse.LikeDTO responseDTO = new CommentResponse.LikeDTO(lc);
                return responseDTO;
            }
            throw new Exception400("이미했음");
        }

        LikeComment lc = LikeComment.builder()
                .user(User.builder().id(userId).build())
                .comment(Comment.builder().id(commentId).build())
                .isLike(false)
                .build();

        try {
            likeCommentRepository.save(lc);
        } catch (Exception e) {
            throw new Exception400("이미했음");
        }

        CommentResponse.LikeDTO responseDTO = new CommentResponse.LikeDTO(lc);
        return responseDTO;
    }



    // 댓글 좋아요/싫어요 삭제
    @Transactional
    public CommentResponse.LikeDTO likecancel(int userId, int commentId) {

        Comment comment = commentRepository.findById(commentId)
            .orElseThrow(() -> new Exception404(commentId+"없음"));

        List<LikeComment> lcList = likeCommentRepository.findByUserIdAndCommentId(userId, commentId);
        
        if(lcList.size() == 0){
            throw new Exception400("이미했음");
        }

        LikeComment lc = lcList.get(0);

        CommentResponse.LikeDTO responseDTO = new CommentResponse.LikeDTO(lc);

        likeCommentRepository.deleteById(lc.getId());

        return responseDTO;
    }






    // 에피소드의 모든 댓글 보기
    public List<CommentResponse.FindAllDTO> findAll(int episodeId) {

        List<WebtoonAuthor> webtoonAuthorList = episodeRepository.findById(episodeId)
                .orElseThrow(() -> new Exception404("오류"))
                .getWebtoon().getWebtoonAuthorList();
        List<Integer> authorUserIdList = webtoonAuthorList.stream()
                .map(webtoonAuthor -> webtoonAuthor.getAuthor().getUser().getId())
                .collect(Collectors.toList());

                
        List<Comment> commentList = commentRepository.findByEpisodeId(episodeId);
        List<CommentResponse.FindAllDTO> responseDTOList = commentList.stream()
                .map( t -> new CommentResponse.FindAllDTO(t, authorUserIdList) )
                .collect(Collectors.toList());

        return responseDTOList;
    }


    // 댓글 작성
    @Transactional
    public CommentResponse.SaveCommentDTO save(CommentRequest.SaveRequestDTO requestDTO, int userId, int episodeId) {

        Episode episode = episodeRepository.findById(episodeId)
            .orElseThrow(() -> new Exception404(episodeId+"없음"));

        Comment comment = Comment.builder()
                .user(User.builder().id(userId).build())
                .episode(Episode.builder().id(episodeId).build())
                .isDelete(false)
                .build();
        comment.setText(requestDTO.getText());

        commentRepository.save(comment);

        CommentResponse.SaveCommentDTO responseDTO = new CommentResponse.SaveCommentDTO(comment);

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
