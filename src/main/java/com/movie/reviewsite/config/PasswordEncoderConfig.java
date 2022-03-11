package com.movie.reviewsite.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

// 비번은 db 에 그냥 안넣고 암호화 해준 다음에 db 에 넣어야 하는데, 그걸 PasswordEncoderConfig 가 해준다.
// passwordEncoder 를 사용하기 전에 꼭 Bean 을 주입하기!

@Configuration
public class PasswordEncoderConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
