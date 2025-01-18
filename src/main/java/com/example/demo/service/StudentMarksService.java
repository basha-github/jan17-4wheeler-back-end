package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentMarks;
import com.example.demo.repo.StudentMarksRepo;

@Service
public class StudentMarksService {
	
	@Autowired
	StudentMarksRepo stuMarksRepo;

	public String addAllNewStudentMarks(List<StudentMarks> allStuMarksList) {
		String res = "";
		
		try {
			stuMarksRepo.saveAll(allStuMarksList);
			res = "successfully added all students marks";
		}catch(Exception e) {
			res = "not able to save into DB";
		}
		return res;
	}

}
