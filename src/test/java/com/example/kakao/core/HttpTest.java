package com.example.kakao.core;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.kakao._temp.MyBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

public class HttpTest {

    @Test
    public void get_test() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> httpEntity = new HttpEntity<>(headers);
        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> responseEntity = rt.exchange("https://jsonplaceholder.typicode.com/posts/1",
                HttpMethod.GET, httpEntity, String.class);
        System.out.println("-------------------------------------");
        System.out.println(responseEntity.getBody());
    }


    
 

    @Test
    public void post_test() throws JsonProcessingException {
        MyBody body = new MyBody("57008833-330024", 10000, "imp65088447");
        String json = new ObjectMapper().writeValueAsString(body);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        HttpEntity<String> httpEntity = new HttpEntity<>(json, headers);
        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> responseEntity = rt.exchange("https://api.iamport.kr/payments/prepare", HttpMethod.POST,
                httpEntity, String.class);
        System.out.println("-------------------------------------");
        System.out.println(responseEntity.getBody());
    }
}
