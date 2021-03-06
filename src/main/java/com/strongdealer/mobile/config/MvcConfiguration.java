package com.strongdealer.mobile.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfiguration implements WebMvcConfigurer {

    //파일 업로드 처리를 위한 빈 추가
    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();

        multipartResolver.setDefaultEncoding("UTF-8");
        multipartResolver.setMaxUploadSize(20 * 1024 * 1024);

        return multipartResolver;
    }
}
