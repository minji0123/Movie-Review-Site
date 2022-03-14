package com.movie.reviewsite.config;

import com.movie.reviewsite.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.httpBasic().disable(); // basic authentication is disabled (form 인증이 아닐 때 인증을 시도하는 것을 막는다.)
        http.csrf(); // post 방식의 csrf
        http.rememberMe(); // remember me

//        http.authorizeRequests()
                // view 페이지 완성 후 지정 예정


        // 로그인
        http.formLogin()
                .loginPage("/login") // 페이지는 login.html
                .defaultSuccessUrl("/") // 요청성공하면 / url 로 이동
                .permitAll(); // 모두 허용!


    }
}
