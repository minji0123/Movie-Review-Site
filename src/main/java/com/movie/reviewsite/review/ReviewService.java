package com.movie.reviewsite.review;

import com.movie.reviewsite.movie.MovieEntity;
import com.movie.reviewsite.movie.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MovieRepository movieRepository;

    public ReviewEntity create(ReviewDto reviewDto){
        MovieEntity target = movieRepository.findById(reviewDto.getMovieId()).orElse(null);
        reviewDto.setMovieTitle(target.getTitle());

        ReviewEntity reviewEntity = reviewDto.toEntity();

        return reviewRepository.save(reviewEntity);
    }

    public ReviewEntity edit(Long id, ReviewDto reviewDto){
        ReviewEntity reviewEntity = reviewDto.toEntity();
        ReviewEntity target = reviewRepository.findById(id).orElse(null);

        if(target == null){
            return null;
        }

        target.patch(reviewEntity);
        return reviewRepository.save(target);
    }

    public ReviewEntity delete(Long id){
        ReviewEntity target = reviewRepository.findById(id).orElse(null);

        if(target == null){
            return null;
        }

        reviewRepository.delete(target);
        return target;
    }
}
