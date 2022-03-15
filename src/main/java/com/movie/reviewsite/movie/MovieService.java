package com.movie.reviewsite.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.UUID;

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


    public MovieEntity create(MovieDto movieDto, MultipartFile file) throws Exception{

        String projectPath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\movieposters"; // 저장할 경로 지정
        UUID uuid = UUID.randomUUID();
        String fileName = uuid + "_" + file.getOriginalFilename(); //UUID를 이용하여 파일 고유이름을 랜덤으로 생성하여 지정해줌
        File saveFile = new File(projectPath, fileName); // 들어온 파일(영화포스터))을 받아줄 틀 생성
        file.transferTo(saveFile); // 빨간줄 뜨는건 Exception 처리

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
