package com.github.kastkest.preparing.hw7.hw7.services;

import com.github.kastkest.preparing.hw7.hw7.dto.StudentDto;
import com.github.kastkest.preparing.hw7.hw7.entities.Student;
import com.github.kastkest.preparing.hw7.hw7.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    public void addStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setName(studentDto.getName());
        student.setAge(studentDto.getAge());
        studentRepository.save(student);
    }

    public void updateStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setName(studentDto.getName());
        student.setAge(studentDto.getAge());
        studentRepository.save(student);
    }

    public void deleteStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setName(studentDto.getName());
        student.setAge(studentDto.getAge());
        studentRepository.delete(student);
    }
}
