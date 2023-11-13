package com.example.kakao.user;

import com.example.kakao.MyWithRestDoc;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
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

    @Test
    public void join_test() throws Exception {
        // given
        UserRequest.JoinDTO requestDTO =
                new UserRequest.JoinDTO();
        requestDTO.setEmail("testID001@naver.com");
        requestDTO.setPassword("1234");
        requestDTO.setUsername("testID001");
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
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.email").value("admin@naver.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.username").value("관리자"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.userTypeEnum").value("ADMIN"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }
}