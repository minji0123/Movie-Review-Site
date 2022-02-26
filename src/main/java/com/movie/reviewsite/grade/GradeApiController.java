package com.movie.reviewsite.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GradeApiController {

    @Autowired
    private GradeService gradeService;

    @GetMapping("/api/Grades")
    public List<GradeEntity> index(){
        return gradeService.index();
    }


}
