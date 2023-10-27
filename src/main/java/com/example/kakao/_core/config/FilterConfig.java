package com.example.kakao._core.config;

import com.example.kakao._core.filter.JwtAuthorizationFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    FilterRegistrationBean<JwtAuthorizationFilter> jwtFilter() {
        FilterRegistrationBean<JwtAuthorizationFilter> bean =
                new FilterRegistrationBean<>(new JwtAuthorizationFilter());
        // bean.addUrlPatterns("/products/*");
        // bean.addUrlPatterns("/carts/*");
        // bean.addUrlPatterns("/webtoons/author/*");
        bean.addUrlPatterns("/user");
        bean.addUrlPatterns("/episodes/*");
        bean.addUrlPatterns("/comments/*");
        bean.addUrlPatterns("/authors/*");
        bean.addUrlPatterns("/webtoons/*");
        bean.setOrder(0); // 낮은 번호부터 실행됨
        return bean;
    }
}
