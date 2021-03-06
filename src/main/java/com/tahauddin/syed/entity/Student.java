package com.tahauddin.syed.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Student_Table")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student implements Serializable {

    private static final Long serialVersionId = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String studentName;

    private String course;


}
