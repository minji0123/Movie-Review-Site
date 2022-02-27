package com.movie.reviewsite.movie;

import lombok.*;

import javax.persistence.*;

// 영화 id, 제목, 내용, 감독,

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

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false)
    private String content;

}
