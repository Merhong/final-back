package com.example.kakao.comment;

import com.example.kakao.MyWithRestDoc;
import com.example.kakao._core.filter.JwtAuthorizationFilter;
import com.example.kakao.user.UserRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureRestDocs(uriScheme = "http", uriHost = "localhost", uriPort = 5000)
// @AutoConfigureMockMvc
@SpringBootTest
public class CommentControllerTest extends MyWithRestDoc {

    // @Autowired
    // private MockMvc mvc;

    String jwt="Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJtZXRhY29kaW5nLWtleSIsImlkIjozLCJlbWFpbCI6ImFkbWluQG5hdmVyLmNvbSIsImNvb2tpZSI6MCwidXNlcm5hbWUiOiLqtIDrpqzsnpAiLCJ1c2VyVHlwZUVudW0iOiJBRE1JTiIsImV4cCI6MTcwMDQ0ODc1M30.kBxBp7O8wG_s0xQb_p-myFaMKuuNRBVWWXaKAIpmsoUTX5wt1agnvlflS9pQ1hGBhgjGNpWPqw3ACHh-5BAR1Q";

    
    @Test
    public void find_by_id_test() throws Exception {
        // given
        // UserRequest.UpdateDTO requestDTO = new UserRequest.UpdateDTO();
        // requestDTO.setEmail("admin@naver.com");
        // requestDTO.setPassword("1234");
        // requestDTO.setUsername("newName");
        // requestDTO.setCookie(7);

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");
        int episodeId = 1;
       
        
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .get("/comments/"+episodeId)
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void save_test() throws Exception {
        // given
        CommentRequest.SaveRequestDTO requestDTO = new CommentRequest.SaveRequestDTO();
        requestDTO.setText("댓글등록내용");

        ObjectMapper om = new ObjectMapper();
        String requestBody = om.writeValueAsString(requestDTO);
        System.out.println("================================");
        System.out.println(requestBody);
        System.out.println("================================");

        int episodeId = 1;
        
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .post("/comments/"+episodeId)
                        .content(requestBody)
                        .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }
    

    @Test
    public void delete_test() throws Exception {
        // given
        // CommentRequest.SaveRequestDTO requestDTO = new CommentRequest.SaveRequestDTO();
        // requestDTO.setText("댓글등록내용");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        int commentId = 18;
        
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .delete("/comments/"+commentId)
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }


    @Test
    public void like_test() throws Exception {
        // given
        // CommentRequest.SaveRequestDTO requestDTO = new CommentRequest.SaveRequestDTO();
        // requestDTO.setText("댓글등록내용");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        int commentId = 5;
        
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .post("/comments/like/"+commentId)
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

        
    
    @Test
    public void dislike_test() throws Exception {
        // given
        // CommentRequest.SaveRequestDTO requestDTO = new CommentRequest.SaveRequestDTO();
        // requestDTO.setText("댓글등록내용");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        int commentId = 6;
        
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .post("/comments/dislike/"+commentId)
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

        
    
    @Test
    public void likecancel_test() throws Exception {
        // given
        // CommentRequest.SaveRequestDTO requestDTO = new CommentRequest.SaveRequestDTO();
        // requestDTO.setText("댓글등록내용");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        int commentId = 1;
        
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .delete("/comments/likecancel/"+commentId)
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

        
    
    @Test
    public void re_comment_save_test() throws Exception {
        // given
        CommentRequest.SaveRequestDTO requestDTO = new CommentRequest.SaveRequestDTO();
        requestDTO.setText("대댓글등록내용");

        ObjectMapper om = new ObjectMapper();
        String requestBody = om.writeValueAsString(requestDTO);
        System.out.println("================================");
        System.out.println(requestBody);
        System.out.println("================================");

        int commentId = 1;
        
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .post("/recomments/"+commentId)
                        .content(requestBody)
                        .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

        
    
    @Test
    public void re_comment_delete_test() throws Exception {
        // given
        // CommentRequest.SaveRequestDTO requestDTO = new CommentRequest.SaveRequestDTO();
        // requestDTO.setText("대댓글등록내용");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        int reCommentId = 11;
        
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .delete("/recomments/"+reCommentId)
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

        
    
    @Test
    public void re_comment_like_test() throws Exception {
        // given
        // CommentRequest.SaveRequestDTO requestDTO = new CommentRequest.SaveRequestDTO();
        // requestDTO.setText("대댓글등록내용");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        int reCommentId = 2;
        
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .post("/recomments/like/"+reCommentId)
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

        
    
    @Test
    public void re_comment_dislike_test() throws Exception {
        // given
        // CommentRequest.SaveRequestDTO requestDTO = new CommentRequest.SaveRequestDTO();
        // requestDTO.setText("대댓글등록내용");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        int reCommentId = 3;
        
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .post("/recomments/dislike/"+reCommentId)
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

        
    
    @Test
    public void re_comment_likecancel_test() throws Exception {
        // given
        // CommentRequest.SaveRequestDTO requestDTO = new CommentRequest.SaveRequestDTO();
        // requestDTO.setText("대댓글등록내용");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        int reCommentId = 1;
        
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .delete("/recomments/likecancel/"+reCommentId)
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }
















}