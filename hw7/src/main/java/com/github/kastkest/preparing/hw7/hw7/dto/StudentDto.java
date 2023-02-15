package com.github.kastkest.preparing.hw7.hw7.dto;

import com.github.kastkest.preparing.hw7.hw7.entities.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class StudentDto {

    private Long id;
    private String name;
    private Integer age;

    public StudentDto(Student student) {
        this.id = student.getId();
        this.name = student.getName();
        this.age = student.getAge();
    }
}
