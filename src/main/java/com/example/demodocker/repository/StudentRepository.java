package com.example.demodocker.repository;

import com.example.demodocker.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
