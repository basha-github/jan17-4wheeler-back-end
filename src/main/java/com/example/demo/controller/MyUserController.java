package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.MyUser;
import com.example.demo.service.MyUserService;

@RestController
@CrossOrigin("*")
public class MyUserController {
	
	@Autowired
	MyUserService myUserSer;
	
	
	@GetMapping("four-wheeler/user/isValidUser")
	public Boolean checkUser(@RequestParam String  uName,String password) {
		
		System.out.println("from React Data----->");
		System.out.println("User NAme----->"+uName);
		System.out.println("Password----->"+password);
		
		Boolean res = myUserSer.checkUserIsValid(uName,password);
		
		return res;
	}
	
	
	@PostMapping("/varun-motors/user/add")
	public String addNewUser(@RequestBody MyUser myUser){
		
		System.out.println("data---->"+myUser);
		
		String res = myUserSer.addNewUserRecord(myUser);
		
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
