package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MyUser;
import com.example.demo.repo.MyUserRepo;

@Service
public class MyUserService {

	@Autowired
	MyUserRepo myUserRepo;
	
	
	public Boolean checkUserIsValid(String uName, String password) {
		
		Boolean res = false;
		
		MyUser myUser = myUserRepo.findById(uName).orElse(new MyUser());
		
		if(myUser.getUserName() != null) {
			
			if(myUser.getUserName().contentEquals(uName)) {
				if(myUser.getPassword().contentEquals(password)) {
					
					res = true;
				}
			}
		}
		
		
		return res;
	}

}
