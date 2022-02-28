package com.movie.reviewsite.grade;
import com.movie.reviewsite.movie.MovieEntity;
import lombok.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class GradeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private MovieEntity movie;

    @Column
    private String title;

    @Column
    private Integer grade;

    @Column
    private String body;

    public void patch(GradeEntity gradeEntity) {
        if(gradeEntity.title != null){
            this.title = gradeEntity.title;
        }
        if(gradeEntity.grade != null){
            this.grade = gradeEntity.grade;
        }
        if(gradeEntity.body != null){
            this.body = gradeEntity.body;
        }
    }
}
