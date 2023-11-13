package com.example.kakao.webtoon;

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
public class WebtoonControllerTest extends MyWithRestDoc {

    // @Autowired
    // private MockMvc mvc;

    @Test
    public void findAll_test() throws Exception {
        // given
        String jwt="Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJtZXRhY29kaW5nLWtleSIsImlkIjozLCJlbWFpbCI6ImFkbWluQG5hdmVyLmNvbSIsImNvb2tpZSI6MCwidXNlcm5hbWUiOiLqtIDrpqzsnpAiLCJ1c2VyVHlwZUVudW0iOiJBRE1JTiIsImV4cCI6MTcwMDQ0ODc1M30.kBxBp7O8wG_s0xQb_p-myFaMKuuNRBVWWXaKAIpmsoUTX5wt1agnvlflS9pQ1hGBhgjGNpWPqw3ACHh-5BAR1Q";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", jwt);
        
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .get("/webtoons")
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
    public void login_test() throws Exception {
        // given
        UserRequest.LoginDTO requestDTO =
                new UserRequest.LoginDTO();
        requestDTO.setEmail("ssar@naver.com");
        requestDTO.setPassword("123455555555555");
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
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.email").value("ssar@naver.com"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.username").value("쌀"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.userTypeEnum").value("NORMAL"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }
}