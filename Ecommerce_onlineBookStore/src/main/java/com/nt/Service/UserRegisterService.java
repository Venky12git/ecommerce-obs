package com.nt.Service;

import org.springframework.stereotype.Service;

import com.nt.entity.UserRegister;
import com.nt.model.UserRequestDto;


public interface UserRegisterService {
	
	
          public UserRegister insertUserRegister(UserRequestDto userRequestDto);

		 
}
