package com.movie.reviewsite.movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository <MovieEntity, Long> {


}
