package com.studentmanagementsystem.service;

import com.studentmanagementsystem.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student updateStudent(Student student);

    Student getStudentById(Long id);

    void deleteStudentById(Long id);
}
