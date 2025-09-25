package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.Service.UserRegisterService;
import com.nt.entity.UserRegister;

 

@RestController
public class UserRegisterController {
	@Autowired
	private UserRegisterService userregsiterservice;

	@PostMapping("/userregisters")
	public String createUserRegister(@RequestBody UserRegister userRegister) {
		
		userregsiterservice.insertUserRegister(userRegister);
		
		
		return"you are registered sucessfully";
	}
}
