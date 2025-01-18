package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentMarks;
import com.example.demo.service.StudentMarksService;

@RestController
@CrossOrigin("*")
public class StudentMarksController {
	
	@Autowired
	StudentMarksService stuMarksService;
	
	@PostMapping("/exam/marks/add/all")
	public String addAllNewStudentMarks(@RequestBody List<StudentMarks> allStuMarksList){
		
		
		String res = stuMarksService.addAllNewStudentMarks(allStuMarksList);
		
		return res;
	}
	

}
