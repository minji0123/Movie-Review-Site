package com.movie.reviewsite.grade;

import com.movie.reviewsite.grade.GradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface GradeRepository extends JpaRepository<GradeEntity, Long> {

    ArrayList<GradeEntity> findAll();

}
