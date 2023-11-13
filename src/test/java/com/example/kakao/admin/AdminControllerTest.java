package com.example.kakao.admin;

import com.example.kakao.MyWithRestDoc;
import com.example.kakao._core.filter.JwtAuthorizationFilter;
import com.example.kakao._entity.enums.UserTypeEnum;
import com.example.kakao.user.UserRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.nio.file.*;
import java.util.List;

@AutoConfigureRestDocs(uriScheme = "http", uriHost = "localhost", uriPort = 5000)
// @AutoConfigureMockMvc
@SpringBootTest
public class AdminControllerTest extends MyWithRestDoc {

    // @Autowired
    // private MockMvc mvc;

    String jwt="Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJtZXRhY29kaW5nLWtleSIsImlkIjozLCJlbWFpbCI6ImFkbWluQG5hdmVyLmNvbSIsImNvb2tpZSI6MCwidXNlcm5hbWUiOiLqtIDrpqzsnpAiLCJ1c2VyVHlwZUVudW0iOiJBRE1JTiIsImV4cCI6MTcwMDQ0ODc1M30.kBxBp7O8wG_s0xQb_p-myFaMKuuNRBVWWXaKAIpmsoUTX5wt1agnvlflS9pQ1hGBhgjGNpWPqw3ACHh-5BAR1Q";

    
    @Test
    public void login_admin_test() throws Exception {
        // given
        // AdminRequest.LoginDTO requestDTO = new AdminRequest.LoginDTO();
        // requestDTO.setEmail("admin@naver.com");
        // requestDTO.setPassword("1234");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        // int authorId = 101;
       
        
        // when
        ResultActions resultActions = mockMvc.perform(
                MockMvcRequestBuilders
                        .post("/loginAdmin")
                        .param("email", "admin@naver.com")
                        .param("password", "1234")
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        // .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                // .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void index_test() throws Exception {
        // given
        // AdminRequest.LoginDTO requestDTO = new AdminRequest.LoginDTO();
        // requestDTO.setEmail("admin@naver.com");
        // requestDTO.setPassword("1234");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        // int authorId = 101;
       
        
        // when
        ResultActions resultActions = mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/admin")
                        // .param("email", "admin@naver.com")
                        // .param("password", "1234")
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        // .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                // .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void admin_detail_test() throws Exception {
        // given
        // AdminRequest.LoginDTO requestDTO = new AdminRequest.LoginDTO();
        // requestDTO.setEmail("admin@naver.com");
        // requestDTO.setPassword("1234");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        int webtoonId = 101;
       
        
        // when
        ResultActions resultActions = mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/detailForm/"+webtoonId)
                        // .param("email", "admin@naver.com")
                        // .param("password", "1234")
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        // .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                // .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void admin_author_detail_test() throws Exception {
        // given
        // AdminRequest.LoginDTO requestDTO = new AdminRequest.LoginDTO();
        // requestDTO.setEmail("admin@naver.com");
        // requestDTO.setPassword("1234");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        int authorId = 101;
       
        
        // when
        ResultActions resultActions = mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/authorForm/"+authorId)
                        // .param("email", "admin@naver.com")
                        // .param("password", "1234")
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        // .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                // .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void create_author_test() throws Exception {
        // given
        // AdminRequest.LoginDTO requestDTO = new AdminRequest.LoginDTO();
        // requestDTO.setEmail("admin@naver.com");
        // requestDTO.setPassword("1234");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        // int authorId = 101;
       
        MockHttpSession session = new MockHttpSession();

        AdminResponse.LoginResponseDTO loginResponseDTO = new AdminResponse.LoginResponseDTO();
        loginResponseDTO.setId(3);
        loginResponseDTO.setEmail("admin@naver.com");
        loginResponseDTO.setUsername("관리자");
        loginResponseDTO.setUserTypeEnum(UserTypeEnum.ADMIN);
        loginResponseDTO.setIsAuthor(false);

        session.setAttribute("sessionUser", loginResponseDTO);
        
        // when
        ResultActions resultActions = mockMvc.perform(
                MockMvcRequestBuilders
                        .post("/add/authors")
                        .session(session)
                        .param("nickname", "쌀")
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        // .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                // .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void update_author_test() throws Exception {
        // given
        // AdminRequest.LoginDTO requestDTO = new AdminRequest.LoginDTO();
        // requestDTO.setEmail("admin@naver.com");
        // requestDTO.setPassword("1234");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        // int authorId = 101;
       
        MockHttpSession session = new MockHttpSession();

        AdminResponse.LoginResponseDTO loginResponseDTO = new AdminResponse.LoginResponseDTO();
        loginResponseDTO.setId(101);
        loginResponseDTO.setEmail("dummyAuthor101@naver.com");
        loginResponseDTO.setUsername("박태준");
        loginResponseDTO.setUserTypeEnum(UserTypeEnum.AUTHOR);
        loginResponseDTO.setIsAuthor(true);

        session.setAttribute("sessionUser", loginResponseDTO);
        
        Path path = Paths.get("C:/src/final/final-back/images/AuthorPhoto/defaultAuthorPhoto.jpg");
        String originalFileName = "defaultAuthorPhoto.jpg";
        String contentType = "image/jpeg";
        byte[] content = Files.readAllBytes(path);
        MockMultipartFile file = new MockMultipartFile("authorPhoto", originalFileName, contentType, content);

        System.out.println(file.getSize());

        // when
        ResultActions resultActions = mockMvc.perform(
                MockMvcRequestBuilders
                        .multipart("/add/authors/update")
                        .file(file)
                        // .post("/add/authors/update")
                        .session(session)
                        .param("introduce", "안녕하세요.")
                        .param("siteURL", "https://www.naver.com/")
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        // .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                // .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void create_board_test() throws Exception {
        // given
        // AdminRequest.LoginDTO requestDTO = new AdminRequest.LoginDTO();
        // requestDTO.setEmail("admin@naver.com");
        // requestDTO.setPassword("1234");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        // int authorId = 101;
       
        MockHttpSession session = new MockHttpSession();

        AdminResponse.LoginResponseDTO loginResponseDTO = new AdminResponse.LoginResponseDTO();
        loginResponseDTO.setId(101);
        loginResponseDTO.setEmail("dummyAuthor101@naver.com");
        loginResponseDTO.setUsername("박태준");
        loginResponseDTO.setUserTypeEnum(UserTypeEnum.AUTHOR);
        loginResponseDTO.setIsAuthor(true);

        session.setAttribute("sessionUser", loginResponseDTO);
        
        Path path = Paths.get("C:/src/final/final-back/images/AuthorPhoto/defaultAuthorPhoto.jpg");
        String originalFileName = "defaultAuthorPhoto.jpg";
        String contentType = "image/jpeg";
        byte[] content = Files.readAllBytes(path);
        MockMultipartFile file = new MockMultipartFile("photo", originalFileName, contentType, content);

        System.out.println(file.getSize());

        // when
        ResultActions resultActions = mockMvc.perform(
                MockMvcRequestBuilders
                        .multipart("/add/authors/board")
                        .file(file)
                        // .post("/add/authors/update")
                        .session(session)
                        .param("title", "작가의글 타이틀")
                        .param("text", "작가의글 내용")
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        // .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                // .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void webtoon_update_test() throws Exception {
        // given
        // AdminRequest.LoginDTO requestDTO = new AdminRequest.LoginDTO();
        // requestDTO.setEmail("admin@naver.com");
        // requestDTO.setPassword("1234");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        // int authorId = 101;
       
        MockHttpSession session = new MockHttpSession();

        AdminResponse.LoginResponseDTO loginResponseDTO = new AdminResponse.LoginResponseDTO();
        loginResponseDTO.setId(3);
        loginResponseDTO.setEmail("admin@naver.com");
        loginResponseDTO.setUsername("관리자");
        loginResponseDTO.setUserTypeEnum(UserTypeEnum.ADMIN);
        loginResponseDTO.setIsAuthor(false);

        session.setAttribute("sessionUser", loginResponseDTO);
        
        Path path = Paths.get("C:/src/final/final-back/images/AuthorPhoto/defaultAuthorPhoto.jpg");
        String originalFileName = "defaultAuthorPhoto.jpg";
        String contentType = "image/jpeg";
        byte[] content = Files.readAllBytes(path);
        MockMultipartFile file = new MockMultipartFile("image", originalFileName, contentType, content);

        System.out.println(file.getSize());

        // when
        ResultActions resultActions = mockMvc.perform(
                MockMvcRequestBuilders
                        .multipart("/add/webtoons/update")
                        .file(file)
                        // .post("/add/authors/update")
                        .session(session)
                        .param("title", "외모지상주의")
                        .param("intro", "소개글수정")
                        .param("deleteAuthorName", "")
                        .param("addAuthorName", "")
                        .param("webtoonSpeciallyEnum", "")
                        .param("webtoonWeekDayEnum", "")
                        .param("ageLimit", "")
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        // .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                // .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void webtoon_create_test() throws Exception {
        // given
        // AdminRequest.LoginDTO requestDTO = new AdminRequest.LoginDTO();
        // requestDTO.setEmail("admin@naver.com");
        // requestDTO.setPassword("1234");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        // int authorId = 101;
       
        MockHttpSession session = new MockHttpSession();

        AdminResponse.LoginResponseDTO loginResponseDTO = new AdminResponse.LoginResponseDTO();
        loginResponseDTO.setId(3);
        loginResponseDTO.setEmail("admin@naver.com");
        loginResponseDTO.setUsername("관리자");
        loginResponseDTO.setUserTypeEnum(UserTypeEnum.ADMIN);
        loginResponseDTO.setIsAuthor(false);

        session.setAttribute("sessionUser", loginResponseDTO);
        
        Path path = Paths.get("C:/src/final/final-back/images/AuthorPhoto/defaultAuthorPhoto.jpg");
        String originalFileName = "defaultAuthorPhoto.jpg";
        String contentType = "image/jpeg";
        byte[] content = Files.readAllBytes(path);
        MockMultipartFile file = new MockMultipartFile("image", originalFileName, contentType, content);

        System.out.println(file.getSize());

        // when
        ResultActions resultActions = mockMvc.perform(
                MockMvcRequestBuilders
                        .multipart("/add/webtoons")
                        .file(file)
                        // .post("/add/authors/update")
                        .session(session)
                        .param("title", "새웹툰")
                        .param("intro", "새웹툰소개글")
                        .param("webtoonSpeciallyEnum", "신작")
                        .param("webtoonWeekDayEnum", "월")
                        .param("ageLimit", "2")
                        .param("authorNameList", "박태준")
                        .param("authorNameList", "JP")
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        // .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                // .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void episode_create_test() throws Exception {
        // given
        // AdminRequest.LoginDTO requestDTO = new AdminRequest.LoginDTO();
        // requestDTO.setEmail("admin@naver.com");
        // requestDTO.setPassword("1234");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        // int authorId = 101;
       
        MockHttpSession session = new MockHttpSession();

        AdminResponse.LoginResponseDTO loginResponseDTO = new AdminResponse.LoginResponseDTO();
        loginResponseDTO.setId(3);
        loginResponseDTO.setEmail("admin@naver.com");
        loginResponseDTO.setUsername("관리자");
        loginResponseDTO.setUserTypeEnum(UserTypeEnum.ADMIN);
        loginResponseDTO.setIsAuthor(false);

        session.setAttribute("sessionUser", loginResponseDTO);
        
        Path path = Paths.get("C:/src/final/final-back/images/AuthorPhoto/defaultAuthorPhoto.jpg");
        String originalFileName = "defaultAuthorPhoto.jpg";
        String contentType = "image/jpeg";
        byte[] content = Files.readAllBytes(path);
        MockMultipartFile file = new MockMultipartFile("thumbnailPhoto", originalFileName, contentType, content);
        
        System.out.println(file.getSize());

        MockMultipartFile photoList = new MockMultipartFile("photoList", originalFileName, contentType, content);

        // when
        ResultActions resultActions = mockMvc.perform(
                MockMvcRequestBuilders
                        .multipart("/add/episodes")
                        .file(file)
                        .file(photoList)
                        .file(photoList)
                        .file(photoList)
                        // .post("/add/authors/update")
                        .session(session)
                        .param("webtoonTitle", "외모지상주의")
                        .param("detailTitle", "새에피소드")
                        .param("authorText", "에피소드작가의말")
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        // .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                // .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void advertising_main_save_test() throws Exception {
        // given
        // AdminRequest.LoginDTO requestDTO = new AdminRequest.LoginDTO();
        // requestDTO.setEmail("admin@naver.com");
        // requestDTO.setPassword("1234");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        // int authorId = 101;
       
        MockHttpSession session = new MockHttpSession();

        AdminResponse.LoginResponseDTO loginResponseDTO = new AdminResponse.LoginResponseDTO();
        loginResponseDTO.setId(3);
        loginResponseDTO.setEmail("admin@naver.com");
        loginResponseDTO.setUsername("관리자");
        loginResponseDTO.setUserTypeEnum(UserTypeEnum.ADMIN);
        loginResponseDTO.setIsAuthor(false);

        session.setAttribute("sessionUser", loginResponseDTO);
        
        Path path = Paths.get("C:/src/final/final-back/images/AuthorPhoto/defaultAuthorPhoto.jpg");
        String originalFileName = "defaultAuthorPhoto.jpg";
        String contentType = "image/jpeg";
        byte[] content = Files.readAllBytes(path);
        MockMultipartFile file = new MockMultipartFile("photo", originalFileName, contentType, content);
        
        System.out.println(file.getSize());


        // when
        ResultActions resultActions = mockMvc.perform(
                MockMvcRequestBuilders
                        .multipart("/add/advertising/main")
                        .file(file)
                        // .post("/add/authors/update")
                        .session(session)
                        .param("isWebLink", "false")
                        .param("webtoonTitle", "외모지상주의")
                        .param("linkURL", "")
                        .param("mainText", "")
                        .param("subText", "")
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        // .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                // .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }

    @Test
    public void advertising_sub_save_test() throws Exception {
        // given
        // AdminRequest.LoginDTO requestDTO = new AdminRequest.LoginDTO();
        // requestDTO.setEmail("admin@naver.com");
        // requestDTO.setPassword("1234");

        // ObjectMapper om = new ObjectMapper();
        // String requestBody = om.writeValueAsString(requestDTO);
        // System.out.println("================================");
        // System.out.println(requestBody);
        // System.out.println("================================");

        // int authorId = 101;
       
        MockHttpSession session = new MockHttpSession();

        AdminResponse.LoginResponseDTO loginResponseDTO = new AdminResponse.LoginResponseDTO();
        loginResponseDTO.setId(3);
        loginResponseDTO.setEmail("admin@naver.com");
        loginResponseDTO.setUsername("관리자");
        loginResponseDTO.setUserTypeEnum(UserTypeEnum.ADMIN);
        loginResponseDTO.setIsAuthor(false);

        session.setAttribute("sessionUser", loginResponseDTO);
        
        Path path = Paths.get("C:/src/final/final-back/images/AuthorPhoto/defaultAuthorPhoto.jpg");
        String originalFileName = "defaultAuthorPhoto.jpg";
        String contentType = "image/jpeg";
        byte[] content = Files.readAllBytes(path);
        MockMultipartFile file = new MockMultipartFile("photo", originalFileName, contentType, content);
        
        System.out.println(file.getSize());


        // when
        ResultActions resultActions = mockMvc.perform(
                MockMvcRequestBuilders
                        .multipart("/add/advertising/sub")
                        .file(file)
                        // .post("/add/authors/update")
                        .session(session)
                        .param("linkURL", "https://www.naver.com/")
                        // .content(requestBody)
                        // .contentType(MediaType.APPLICATION_JSON)
                        // .header(HttpHeaders.AUTHORIZATION, jwt)
        );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("================================");
        System.out.println(responseBody);
        System.out.println("================================");

        // then
        resultActions
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                // .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(2))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("cos"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("1234"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("cos@nate.com"))
                // .andExpect(MockMvcResultMatchers.jsonPath("$.errorType").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }
    
    
    










}