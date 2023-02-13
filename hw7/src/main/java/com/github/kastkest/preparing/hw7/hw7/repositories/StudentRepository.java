package com.github.kastkest.preparing.hw7.hw7.repositories;

import com.github.kastkest.preparing.hw7.hw7.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}
