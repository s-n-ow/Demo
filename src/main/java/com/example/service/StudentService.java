package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.StudentRepository;

import lombok.NoArgsConstructor;

import com.example.entity.Student;


@Service
@NoArgsConstructor
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents () {
        return studentRepository.findAll();//this findall method is provided by the jparepsoitory.
    }
}
//we'll write the query to get all the records from student table using studentrepository.