package com.movie.reviewsite.movie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // main 화면 view 페이지
    @GetMapping("/")
    public String mainPage(){
        return"index";
    }


}
