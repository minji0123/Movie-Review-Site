package com.movie.reviewsite.grade;

import com.movie.reviewsite.movie.MovieDto;
import com.movie.reviewsite.movie.MovieEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GradeController {

    @PostMapping("/detail/create") // action
    public String create(MovieDto movieDto){

        GradeEntity gradeEntity = GradeService.create(GradeDto gradedto);

        return "redirect:/details";
    }

}
