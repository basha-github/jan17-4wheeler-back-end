package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.MyUser;

public interface MyUserRepo extends JpaRepository<MyUser, String>{

}
