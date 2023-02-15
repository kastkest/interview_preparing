package com.github.kastkest.preparing.hw7.hw7.controller;


import com.github.kastkest.preparing.hw7.hw7.dto.StudentDto;
import com.github.kastkest.preparing.hw7.hw7.entities.Student;
import com.github.kastkest.preparing.hw7.hw7.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public Iterable<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Student> findById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @PostMapping
    public void addStudent(@RequestBody StudentDto studentDto) {
        studentService.addStudent(studentDto);
    }

    @PatchMapping
    public void update(@RequestBody StudentDto studentDto) {
        studentService.updateStudent(studentDto);
    }

    @DeleteMapping
    public void delete(@RequestBody StudentDto studentDto) {
        studentService.deleteStudent(studentDto);
    }
}
