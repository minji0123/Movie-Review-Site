package com.movie.reviewsite.user;

import com.movie.reviewsite.movie.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    /*
    * admin 은 영화를 등록한다.
    * admin 은 유저들이 작성한 리뷰를 확인할 수 있다.
    * admin 은 유저들이 작성한 평점을 확인할 수 있다.*/
    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public String getReviewForAdmin(Authentication authentication, Model model) {

        // 인증받은 유저를 담는다.
        // 유저가 작성한 리뷰들을 조회한다.
        // 유저가 작성한 평점들을 조회한다.
        // 뷰에 넣어준다.
        UserEntity userEntity = (UserEntity) authentication.getPrincipal();
//        List<>



        return "admin/index";
    }
}
