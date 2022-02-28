package com.movie.reviewsite.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GradeApiController {

    @Autowired
    private GradeService gradeService;

    @GetMapping("/api/grades") // 전체보기
    public List<GradeEntity> index(){
        return gradeService.index();
    }

    @GetMapping("/api/grades/{id}") // 검색한 id 하나만 보기
    public GradeEntity show(@PathVariable Long id){
        return gradeService.show(id);
    }

    @PostMapping("/api/grades")
    public ResponseEntity<GradeEntity> create(@RequestBody GradeDto dto){
        GradeEntity created= gradeService.create(dto);
        return (created != null) ?
                ResponseEntity.status(HttpStatus.OK).body(created)
                : ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @PatchMapping("/api/grades/{id}")
    public ResponseEntity<GradeEntity> update(@PathVariable Long id,
                                              @RequestBody GradeDto dto){
        GradeEntity updated = gradeService.update(id, dto);
        return (updated != null) ?
                ResponseEntity.status(HttpStatus.OK).body(updated)
                : ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    @DeleteMapping("/api/grades/{id}")
    public ResponseEntity<GradeEntity> delete(@PathVariable Long id){
        GradeEntity deleted = gradeService.delete(id);
        return (deleted != null) ?
                ResponseEntity.status(HttpStatus.OK).body(deleted)
                : ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

}
