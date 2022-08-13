package com.tahauddin.syed.controller;

import com.tahauddin.syed.dto.StudentDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/student")
@Slf4j
public class StudentController {

    @GetMapping("/{id}")
    public Mono<ResponseEntity<StudentDto>> getStudent(@PathVariable("id") Long id){
        StudentDto studentDto = StudentDto.builder().studentName("Syed Tahauddin").course("Java").build();
        return Mono.just(ResponseEntity.ok(studentDto));
    }

    @PostMapping("/add")
    public Mono<ResponseEntity<Void>> addStudent(){
        log.info("add() Called...");
        return Mono.just(ResponseEntity.ok().build());
    }
}
