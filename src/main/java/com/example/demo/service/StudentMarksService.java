package com.example.demo.service;

import java.util.ArrayList;
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

	public List<StudentMarks> fetchAllStudentsAbove60Marks() {
		
		
		List<StudentMarks> allStudents = stuMarksRepo.findAll();
		
		StudentMarks eachStu = null;
		
		List<StudentMarks> all60MarksStusList = new ArrayList<StudentMarks>();
		
		for(int i=0;i<allStudents.size();i++) {
			
			eachStu = allStudents.get(i);
			
			if( (eachStu.getMaths() >= 60) 
					&& (eachStu.getSci() >= 60)
					&&(eachStu.getEng() >= 60)
				) {
				
				all60MarksStusList.add(eachStu);
			}
			
		}
		
		
		return all60MarksStusList;
	}

	public List<StudentMarks> fetchAllStudentsAbove70Marks() {

		
		
		List<StudentMarks> allStudents = stuMarksRepo.findAll();
		
		StudentMarks eachStu = null;
		
		List<StudentMarks> all60MarksStusList = new ArrayList<StudentMarks>();
		
		for(int i=0;i<allStudents.size();i++) {
			
			eachStu = allStudents.get(i);
			
			if( (eachStu.getMaths() >= 70) 
					&& (eachStu.getSci() >= 70)
					&&(eachStu.getEng() >= 70)
				) {
				
				all60MarksStusList.add(eachStu);
			}
			
		}
		
		
		return all60MarksStusList;
	}

}
