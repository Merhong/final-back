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

    String jwt="Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJtZXRhY29kaW5nLWtleSIsImlkIjozLCJlbWFpbCI6ImFkbWluQG5hdmVyLmNvbSIsImNvb2tpZSI6MCwidXNlcm5hbWUiOiLqtIDrpqzsnpAiLCJ1c2VyVHlwZUVudW0iOiJBRE1JTiIsImV4cCI6MTcwMDQ0ODc1M30.kBxBp7O8wG_s0xQb_p-myFaMKuuNRBVWWXaKAIpmsoUTX5wt1agnvlflS9pQ1hGBhgjGNpWPqw3ACHh-5BAR1Q";

    
    @Test
    public void find_all_test() throws Exception {
        // given
        // HttpHeaders headers = new HttpHeaders();
        // headers.add("Authorization", jwt);
        
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
    public void find_by_id_test() throws Exception {
        // given
       
        int webtoonId = 101;

        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .get("/webtoons/"+webtoonId)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.id").value(101))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("외모지상주의"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }


    @Test
    public void find_by_random_test() throws Exception {
        // given
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .get("/webtoons/random")
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.id").value(101))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("외모지상주의"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void interest_save_test() throws Exception {
        // given
        int webtoonId = 105;
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .post("/webtoons/interest/"+webtoonId)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.webtoonId").value(105))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("외모지상주의"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void interest_delete_test() throws Exception {
        // given
        int webtoonId = 101;
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .delete("/webtoons/interest/"+webtoonId)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.webtoonId").value(101))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("외모지상주의"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void advertising_main_delete_test() throws Exception {
        // given
        int id = 1;
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .delete("/webtoons/advertising/main/"+id)
                        .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.id").value(1))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("외모지상주의"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void advertising_sub_test() throws Exception {
        // given
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .get("/webtoons/advertising/sub")
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
    public void advertising_main_test() throws Exception {
        // given
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .get("/webtoons/advertising/main")
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
    public void search_test() throws Exception {
        // given
        String searchText = "세";
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .get("/search?searchText="+searchText)
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
    public void recent_save_test() throws Exception {
        // given
        int episodeId = 111;
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .post("/webtoons/recent/"+episodeId)
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
    public void recent_find_all_test() throws Exception {
        // given
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .get("/webtoons/recent")
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
    public void end_recommendation_test() throws Exception {
        // given
       
        // when
        ResultActions resultActions = mockMvcAddFilter.perform(
                MockMvcRequestBuilders
                        .get("/webtoons/recommend")
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