package com.movie.reviewsite.movie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    // detail 화면 view 페이지
    @GetMapping("/detail")
    public String detailPage(){
        return"/content/detail";
    }

}
