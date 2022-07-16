package com.tahauddin.syed.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class StudentDto implements Serializable {

    private static final Long serialVersionId = 2L;

    private final String studentName;
    private final String course;
}
