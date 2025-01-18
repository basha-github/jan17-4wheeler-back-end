package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentMarks;

public interface StudentMarksRepo extends JpaRepository<StudentMarks, Integer>{

}
