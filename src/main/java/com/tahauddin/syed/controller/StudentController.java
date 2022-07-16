package com.tahauddin.syed.controller;

import com.tahauddin.syed.dto.StudentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/student")
public class StudentController {


    @GetMapping("/{id}")
    public Mono<ResponseEntity<StudentDto>> getStudent(@PathVariable("id") Long id){
        StudentDto studentDto = StudentDto.builder().studentName("Syed Tahauddin").course("Java").build();
        return Mono.just(ResponseEntity.ok(studentDto));
    }




}
