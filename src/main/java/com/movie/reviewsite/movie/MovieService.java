package com.movie.reviewsite.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public MovieEntity create(MovieDto movieDto){
        MovieEntity movieEntity = movieDto.toEntity(); //dto -> entity

        return movieRepository.save(movieEntity);
    }

    public MovieEntity edit(Long id, MovieDto movieDto){
        MovieEntity movieEntity = movieDto.toEntity();
        MovieEntity target = movieRepository.findById(id).orElse(null);

        target.patch(movieEntity);
        return movieRepository.save(target);
    }

}
