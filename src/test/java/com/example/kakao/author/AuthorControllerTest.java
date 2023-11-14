package com.example.kakao.author;

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
public class AuthorControllerTest extends MyWithRestDoc {

    // @Autowired
    // private MockMvc mvc;

    String jwt="Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJtZXRhY29kaW5nLWtleSIsImlkIjoxLCJlbWFpbCI6InNzYXJAbmF2ZXIuY29tIiwiY29va2llIjowLCJ1c2VybmFtZSI6IuyMgCIsInVzZXJUeXBlRW51bSI6Ik5PUk1BTCIsImV4cCI6MTcwMDUzNTYyNn0.MBlr8g9sUvq9RsKtQnhxcxUPMlWZqaaDQBsE5JcaqMtUUKloViwN5339IWgg65VopDxi_VOTikc389jApBI-qg";

    
    @Test
    public void author_detail_test() throws Exception {
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
        int authorId = 101;
       
        
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .get("/authors/"+authorId)
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
    public void interest_save_test() throws Exception {
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
        int authorId = 103;
       
        
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .post("/authors/interest/"+authorId)
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
    public void interest_delete_test() throws Exception {
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
        int authorId = 101;
       
        
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .delete("/authors/interest/"+authorId)
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