package com.movie.reviewsite.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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

        if(target==null){
            return null;
        }

        target.patch(movieEntity);
        return movieRepository.save(target);
    }

    public MovieEntity delete(Long id){
        MovieEntity movieEntity = movieRepository.findById(id).orElse(null);

        if(movieEntity==null){
            return null;
        }

        movieRepository.delete(movieEntity);
        return movieEntity;
    }
}
