package com.movie.reviewsite.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@Transactional
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public List<MovieEntity> findAll(){

        return movieRepository.findAll();
    }

    @Transactional(readOnly = true)
    public MovieEntity findMovie(Long id){
        return movieRepository.findById(id).orElse(null);
    }


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
