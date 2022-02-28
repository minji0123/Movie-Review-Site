package com.movie.reviewsite.grade;

import com.movie.reviewsite.movie.MovieEntity;
import lombok.AllArgsConstructor;
import lombok.ToString;


@ToString
@AllArgsConstructor
public class GradeDto {

    private Long id;
    //@JsonProperty("movie_id")
    //private MovieEntity movie;
    private String title;
    private Integer grade;
    private String body;

    public static GradeDto createGradeDto(GradeEntity grade) {
        return new GradeDto(
                grade.getId(), grade.getTitle(),
                grade.getGrade(), grade.getBody()
        );
    }

    public GradeEntity toEntity(){
        return new GradeEntity(id, movie, title, grade, body);
    }

}
