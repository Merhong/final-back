package com.example.kakao.user;

import com.example.kakao.MyWithRestDoc;
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
public class UserControllerTest extends MyWithRestDoc {

    // @Autowired
    // private MockMvc mvc;
    String jwt="Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJtZXRhY29kaW5nLWtleSIsImlkIjoxLCJlbWFpbCI6InNzYXJAbmF2ZXIuY29tIiwiY29va2llIjowLCJ1c2VybmFtZSI6IuyMgCIsInVzZXJUeXBlRW51bSI6Ik5PUk1BTCIsImV4cCI6MTcwMDUzNTYyNn0.MBlr8g9sUvq9RsKtQnhxcxUPMlWZqaaDQBsE5JcaqMtUUKloViwN5339IWgg65VopDxi_VOTikc389jApBI-qg";

  

    @Test
    public void join_test() throws Exception {
        // given
        UserRequest.JoinDTO requestDTO =
                new UserRequest.JoinDTO();
        requestDTO.setEmail("testID002@naver.com");
        requestDTO.setPassword("1234");
        requestDTO.setUsername("testID002");
        ObjectMapper om = new ObjectMapper();
        String requestBody = om.writeValueAsString(requestDTO);
        System.out.println("================================");
        System.out.println(requestBody);
        System.out.println("================================");

        // when
        ResultActions resultActions = mockMvc.perform(
                MockMvcRequestBuilders
                        .post("/join")
                        .content(requestBody)
                        .contentType(MediaType.APPLICATION_JSON)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);

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
    public void login_test() throws Exception {
        // given
        UserRequest.LoginDTO requestDTO =
                new UserRequest.LoginDTO();
        requestDTO.setEmail("admin@naver.com");
        requestDTO.setPassword("1234");
        ObjectMapper om = new ObjectMapper();
        String requestBody = om.writeValueAsString(requestDTO);
        System.out.println("================================");
        System.out.println(requestBody);
        System.out.println("================================");

        // when
        ResultActions resultActions = mockMvc.perform(
                MockMvcRequestBuilders
                        .post("/login")
                        .content(requestBody)
                        .contentType(MediaType.APPLICATION_JSON)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.email").value("admin@naver.com"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.username").value("관리자"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.userTypeEnum").value("ADMIN"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void update_test() throws Exception {
        // given
        UserRequest.UpdateDTO requestDTO = new UserRequest.UpdateDTO();
        requestDTO.setEmail("ssar@naver.com");
        requestDTO.setPassword("1234");
        requestDTO.setUsername("newName");
        requestDTO.setCookie(7);

        ObjectMapper om = new ObjectMapper();
        String requestBody = om.writeValueAsString(requestDTO);
        System.out.println("================================");
        System.out.println(requestBody);
        System.out.println("================================");
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .put("/users")
                        .content(requestBody)
                        .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.id").value(1))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("외모지상주의"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void autologin_test() throws Exception {
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
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .post("/autologin")
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.id").value(1))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("외모지상주의"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void interest_author_test() throws Exception {
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
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .get("/users/interest/author")
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.id").value(1))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("외모지상주의"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void interest_test() throws Exception {
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
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .get("/users/interest")
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.id").value(1))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("외모지상주의"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void interest_alarm_off_test() throws Exception {
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
        int webtoonId = 101;
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .post("/users/interest/alarmoff/"+webtoonId)
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.id").value(1))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("외모지상주의"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }


    @Test
    public void interest_alarm_on_test() throws Exception {
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
        int webtoonId = 102;
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .post("/users/interest/alarmon/"+webtoonId)
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.id").value(1))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("외모지상주의"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }


    @Test
    public void interest_author_alarm_off_test() throws Exception {
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
        int authorId = 105;
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .post("/users/interest/author/alarmoff/"+authorId)
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.id").value(1))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("외모지상주의"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void interest_author_alarm_on_test() throws Exception {
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
        int authorId = 104;
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .post("/users/interest/author/alarmon/"+authorId)
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.id").value(1))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("외모지상주의"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void comment_test() throws Exception {
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
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .get("/users/comments")
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.id").value(1))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("외모지상주의"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }












}