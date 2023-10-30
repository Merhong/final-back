package com.example.kakao.comment;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception404;
import com.example.kakao.entity.LikeComment;
import com.example.kakao.entity.LikeReComment;
import com.example.kakao.entity.ReComment;
import com.example.kakao.episode.Episode;
import com.example.kakao.episode.EpisodeRepository;
import com.example.kakao.repository.LikeCommentRepository;
import com.example.kakao.repository.LikeReCommentRepository;
import com.example.kakao.repository.ReCommentRepository;
import com.example.kakao.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class CommentService {

    private final CommentJPARepository commentRepository;
    private final LikeCommentRepository likeCommentRepository;
    private final EpisodeRepository episodeRepository;
    private final ReCommentRepository reCommentRepository;
    private final LikeReCommentRepository likeReCommentRepository;




    // 대댓글 작성
    @Transactional
    public CommentResponse.ReCommentDTO reCommentSave(CommentRequest.SaveRequestDTO requestDTO, User sessionUser, int commentId) {

        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(() -> new Exception404(commentId + "없음"));

        ReComment reComment = ReComment.builder()
                .text(requestDTO.getText())
                .user(sessionUser)
                .comment(Comment.builder().id(commentId).build())
                .isDelete(false)
                .likeReCommentList(new ArrayList<LikeReComment>())
                .build();

        reCommentRepository.save(reComment);

        
        // List<Integer> authorUserIdList = episodeRepository.findById(episodeId)
        //         .orElseThrow(() -> new Exception404("오류"))
        //         .getWebtoon().getWebtoonAuthorList()
        //         .stream()
        //         .map(webtoonAuthor -> webtoonAuthor.getAuthor().getUser().getId())
        //         .collect(Collectors.toList());

        CommentResponse.ReCommentDTO responseDTO = new CommentResponse.ReCommentDTO(reComment, sessionUser.getId());

        return responseDTO;
    }





    // 대댓글 좋아요
    @Transactional
    public CommentResponse.LikeReCommentDTO reCommentLike(int userId, int reCommentId) {

        ReComment reComment = reCommentRepository.findById(reCommentId)
                .orElseThrow(() -> new Exception404(reCommentId + "없음"));

        List<LikeReComment> likeReComentList = likeReCommentRepository.findByUserIdAndReCommentId(userId, reCommentId);

        if (likeReComentList.size() != 0) {
            LikeReComment likeReComent = likeReComentList.get(0);

            if (likeReComent.getIsLike() == null || likeReComent.getIsLike() == false) {
                likeReComent.setIsLike(true);
                CommentResponse.LikeReCommentDTO responseDTO = new CommentResponse.LikeReCommentDTO(likeReComent, reComment.getComment().getId());
                return responseDTO;
            }
            throw new Exception400("이미했음");
        }

        LikeReComment likeReComent = LikeReComment.builder()
                .user(User.builder().id(userId).build())
                .reComment(ReComment.builder().id(reCommentId).build())
                .isLike(true)
                .build();

        try {
            likeReCommentRepository.save(likeReComent);
        } catch (Exception e) {
            throw new Exception400("이미했음");
        }

        CommentResponse.LikeReCommentDTO responseDTO = new CommentResponse.LikeReCommentDTO(likeReComent, reComment.getComment().getId());
        return responseDTO;
    }



    // 대댓글 싫어요
    @Transactional
    public CommentResponse.LikeReCommentDTO reCommentDislike(int userId, int reCommentId) {

        ReComment reComment = reCommentRepository.findById(reCommentId)
                .orElseThrow(() -> new Exception404(reCommentId + "없음"));

        List<LikeReComment> likeReComentList = likeReCommentRepository.findByUserIdAndReCommentId(userId, reCommentId);

        if (likeReComentList.size() != 0) {
            LikeReComment likeReComent = likeReComentList.get(0);

            if (likeReComent.getIsLike() == null || likeReComent.getIsLike() == true) {
                likeReComent.setIsLike(false);
                CommentResponse.LikeReCommentDTO responseDTO = new CommentResponse.LikeReCommentDTO(likeReComent, reComment.getComment().getId());
                return responseDTO;
            }
            throw new Exception400("이미했음");
        }

        LikeReComment likeReComent = LikeReComment.builder()
                .user(User.builder().id(userId).build())
                .reComment(ReComment.builder().id(reCommentId).build())
                .isLike(false)
                .build();

        try {
            likeReCommentRepository.save(likeReComent);
        } catch (Exception e) {
            throw new Exception400("이미했음");
        }

        CommentResponse.LikeReCommentDTO responseDTO = new CommentResponse.LikeReCommentDTO(likeReComent, reComment.getComment().getId());
        return responseDTO;
    }



    // 대댓글 좋아요/싫어요 삭제
    @Transactional
    public CommentResponse.LikeReCommentDTO reCommentLikecancel(int userId, int reCommentId) {

        ReComment reComment = reCommentRepository.findById(reCommentId)
                .orElseThrow(() -> new Exception404(reCommentId + "없음"));

        List<LikeReComment> likeReComentList = likeReCommentRepository.findByUserIdAndReCommentId(userId, reCommentId);

        if (likeReComentList.size() == 0) {
            throw new Exception400("이미했음");
        }

        LikeReComment likeReComent = likeReComentList.get(0);

        CommentResponse.LikeReCommentDTO responseDTO = new CommentResponse.LikeReCommentDTO(likeReComent, reComment.getComment().getId());

        likeReCommentRepository.deleteById(likeReComent.getId());

        return responseDTO;
    }




    // 댓글 좋아요
    @Transactional
    public CommentResponse.LikeDTO like(int userId, int commentId) {

        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(() -> new Exception404(commentId + "없음"));

        List<LikeComment> lcList = likeCommentRepository.findByUserIdAndCommentId(userId, commentId);

        if (lcList.size() != 0) {
            LikeComment lc = lcList.get(0);

            if (lc.getIsLike() == null || lc.getIsLike() == false) {
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
                .orElseThrow(() -> new Exception404(commentId + "없음"));

        List<LikeComment> lcList = likeCommentRepository.findByUserIdAndCommentId(userId, commentId);

        if (lcList.size() != 0) {
            LikeComment lc = lcList.get(0);

            if (lc.getIsLike() == null || lc.getIsLike() == true) {
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
                .orElseThrow(() -> new Exception404(commentId + "없음"));

        List<LikeComment> lcList = likeCommentRepository.findByUserIdAndCommentId(userId, commentId);

        if (lcList.size() == 0) {
            throw new Exception400("이미했음");
        }

        LikeComment lc = lcList.get(0);

        CommentResponse.LikeDTO responseDTO = new CommentResponse.LikeDTO(lc);

        likeCommentRepository.deleteById(lc.getId());

        return responseDTO;
    }


    // 에피소드의 모든 댓글 보기
    public List<CommentResponse.CommentDTO> findAll(int episodeId, int userId) {

        List<Integer> authorUserIdList = episodeRepository.findById(episodeId)
                .orElseThrow(() -> new Exception404("오류"))
                .getWebtoon().getWebtoonAuthorList()
                .stream()
                .map(webtoonAuthor -> webtoonAuthor.getAuthor().getUser().getId())
                .collect(Collectors.toList());

        List<Comment> commentList = commentRepository.findByEpisodeId(episodeId, Sort.by(Sort.Order.desc("id")));
        System.out.println("실행됨");
        // List<Comment> commentList = commentRepository.findByEpisodeId(episodeId);
        List<CommentResponse.CommentDTO> responseDTOList = commentList.stream()
                .map(t -> new CommentResponse.CommentDTO(t, authorUserIdList, userId))
                .collect(Collectors.toList());

        return responseDTOList;
    }


    // 댓글 작성
    @Transactional
    public CommentResponse.CommentDTO save(CommentRequest.SaveRequestDTO requestDTO, User sessionUser, int episodeId) {

        Episode episode = episodeRepository.findById(episodeId)
                .orElseThrow(() -> new Exception404(episodeId + "없음"));

        Comment comment = Comment.builder()
                .text(requestDTO.getText())
                .user(sessionUser)
                .episode(Episode.builder().id(episodeId).build())
                .isDelete(false)
                .reCommentList(new ArrayList<ReComment>())
                .likeCommentList(new ArrayList<LikeComment>())
                .build();

        commentRepository.save(comment);

        
        List<Integer> authorUserIdList = episodeRepository.findById(episodeId)
                .orElseThrow(() -> new Exception404("오류"))
                .getWebtoon().getWebtoonAuthorList()
                .stream()
                .map(webtoonAuthor -> webtoonAuthor.getAuthor().getUser().getId())
                .collect(Collectors.toList());

        CommentResponse.CommentDTO responseDTO = new CommentResponse.CommentDTO(comment, authorUserIdList, sessionUser.getId());

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
