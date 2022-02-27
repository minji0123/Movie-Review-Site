package com.movie.reviewsite.grade;

import org.springframework.data.repository.CrudRepository;
import com.movie.reviewsite.grade.GradeEntity;
import java.util.ArrayList;

public interface GradeRepository extends CrudRepository<GradeEntity, Long> {

    @Override
    ArrayList<GradeEntity> findAll();

}
