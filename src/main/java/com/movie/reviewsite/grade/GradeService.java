package com.movie.reviewsite.grade;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    public List<GradeEntity> index() {
        return gradeRepository.findAll();
    }



}
