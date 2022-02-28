package com.movie.reviewsite.movie;


import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class MovieDto {

    private Long id;

    private String imgUrl;

    private String title;

    private String content;

    private String director;

    private String actor;

    private Integer movieTime;

    private String grade;

    public MovieEntity toEntity(){
        return new MovieEntity(id, imgUrl, title, content, director,actor, movieTime, grade);
    }
}
