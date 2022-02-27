package com.movie.reviewsite.grade;

import lombok.AllArgsConstructor;
import lombok.ToString;


@ToString
@AllArgsConstructor
public class GradeDto {

    private Long id;
    private String title;
    private Integer grade;
    private String body;

    public GradeEntity toEntity(){
        return new GradeEntity(id, title, grade, body);
    }

}
