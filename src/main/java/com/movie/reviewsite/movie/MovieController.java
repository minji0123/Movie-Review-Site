package com.movie.reviewsite.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private MovieService movieService;


    // movie 등록 view 페이지
    @GetMapping("/detail/new")
    public String newMoviePage(){
        return"/content/newDetail";
    }

    // movie 등록 post
    @PostMapping("/detail/create")
    public String createMovie(MovieDto movieDto){

       MovieEntity movieEntity = movieService.create(movieDto);

        return "redirect:/detail";
    }

    // movieDetail 화면 전체 view 페이지
    @GetMapping("/detail")
    public String allMoviePage(Model model){
        List<MovieEntity> movieEntityList = movieRepository.findAll();
        model.addAttribute("movieList", movieEntityList);
        return"/content/detail";
    }


    // movie detail view 페이지


    // movie 수정 view 페이지
    @GetMapping("/detail/update/{id}")
    public String updateMoviePage(@PathVariable Long id,Model model){
        MovieEntity movieEntity = movieRepository.findById(id).orElse(null);
        model.addAttribute("movieEntity", movieEntity);
        return "/content/detail";
    }

    // movie 수정 patch
    @PatchMapping("/detail/edit/{id}")
    public String editMovie(@PathVariable Long id, MovieDto movieDto){
        MovieEntity movieEntity = movieService.edit(id, movieDto);

        return "redirect:/detail";
    }

}
