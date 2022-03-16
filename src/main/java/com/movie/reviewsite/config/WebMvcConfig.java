package com.movie.reviewsite.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// todo: 영우님 개인 프로젝트에서는 springSecurity 와 함께 구현되어서 몰랐을 수도 있음
// 이미지를 출력할 때는 spring 에게 해당 경로를 허락해줘야 함
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    // todo: 허락해줄 경로를 설정해줌. 앞에 file:/// 를 붙여줌
    String PermittedPath = "file:///" +System.getProperty("user.dir") + "/src/main/resources/static/";

//    @Value("${uploadPath}")
//    String path;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**") // PermittedPath 경로들/+a
                .addResourceLocations(PermittedPath); // 로컬에 저장된 파일을 읽어 올 root 경로 설정
//                .addResourceLocations(path); // 로컬에 저장된 파일을 읽어 올 root 경로 설정
    }
}
