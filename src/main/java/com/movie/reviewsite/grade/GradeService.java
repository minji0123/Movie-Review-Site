package com.movie.reviewsite.grade;

import com.movie.reviewsite.movie.MovieRepository;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@ToString
public class GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    @Autowired
    private MovieRepository movieRepository;

    public List<GradeDto> grades(Long movieId) {
        List<GradeEntity> grades = gradeRepository.findByMovieId(movieId);

        List<GradeDto dtos = new ArrayList<GradeDto>();
        for(int i=0; i<grades.size(); i++){
            GradeEntity g = grades.get(i);
            GradeDto dto = GradeDto.createGradeDto(g);
            dtos.add(dto);
        }

        return dtos;
    }

    public GradeEntity show(Long id) {
        return gradeRepository.findById(id).orElse(null);
    }

    public GradeEntity create(GradeDto dto) {
        GradeEntity gradeEntity = dto.toEntity();
        if(gradeEntity.getId() != null){
            return null; // 생성시 id 중복 방지
        }
        return gradeRepository.save(gradeEntity);
    }

    public GradeEntity update(Long id, GradeDto dto) {
        GradeEntity gradeEntity = dto.toEntity();

        GradeEntity target = gradeRepository.findById(id).orElse(null);

        if (target == null){
            return null;  // 잘못된 요청 응답
        }
        target.patch(gradeEntity);
        GradeEntity updated = gradeRepository.save(target);
        return updated;
    }

    public GradeEntity delete(Long id) {
        GradeEntity target = gradeRepository.findById(id).orElse(null);

        if(target == null){
            return null; // 잘못된 요청 처리(대상 id가 없을때)
        }
        gradeRepository.delete(target);
        return target;
    }

}
