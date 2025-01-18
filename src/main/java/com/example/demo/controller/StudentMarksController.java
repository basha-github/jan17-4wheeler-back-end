package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/exam/marks/60")
	public List<StudentMarks>  getAll60AboveMarks(){
		
		return stuMarksService.fetchAllStudentsAbove60Marks();
		
		
	}
	
	@GetMapping("/exam/marks/70")
	public List<StudentMarks>  getAll70AboveMarks(){
		
		return stuMarksService.fetchAllStudentsAbove70Marks();
		
		
	}
	

}
