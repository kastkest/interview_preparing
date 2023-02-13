package com.github.kastkest.preparing.hw7.hw7.entities;

import com.github.kastkest.preparing.hw7.hw7.dto.StudentDto;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    private Long id;

    private String name;

    private Integer age;


}
