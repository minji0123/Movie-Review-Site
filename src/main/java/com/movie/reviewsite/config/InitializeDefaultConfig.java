package com.movie.reviewsite.config;

import com.movie.reviewsite.review.ReviewService;
import com.movie.reviewsite.user.UserEntity;
import com.movie.reviewsite.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class InitializeDefaultConfig {

    @Autowired
    private UserService userService;

    @Autowired
    private ReviewService reviewService;
    // 유저 등록, 리뷰 등록
    @Bean
    public void initializeDefaultUser() {
        System.out.println("유저 등록, 리뷰 등록");
//        UserEntity userEntity
    }
}
