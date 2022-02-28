package com.movie.reviewsite.movie;

import lombok.*;

import javax.persistence.*;

// 영화 id, 이미지 url, 제목, 내용, 감독,
// 주연, 줄거리, 상영시간, 영화등급

@Entity
@Table(name = "movie_info")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="img_url")
    private String imgUrl;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column
    private String director;

    @Column
    private String actor;

    @Column(name="movie_time")
    private Integer movieTime;

    @Column
    private String grade;

    public void patch(MovieEntity movieEntity) {
        if (movieEntity.imgUrl != null){
            this.imgUrl = movieEntity.imgUrl;
        }
        if (movieEntity.title != null){
            this.title = movieEntity.title;
        }
        if (movieEntity.content != null){
            this.content = movieEntity.content;
        }
        if (movieEntity.director != null){
            this.director = movieEntity.director;
        }
        if (movieEntity.actor != null){
            this.actor = movieEntity.actor;
        }
        if (movieEntity.movieTime != null){
            this.movieTime = movieEntity.movieTime;
        }
        if (movieEntity.grade != null){
            this.grade = movieEntity.grade;
        }

    }
}
