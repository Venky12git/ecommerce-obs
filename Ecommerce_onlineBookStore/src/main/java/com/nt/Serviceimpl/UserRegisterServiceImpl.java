package com.nt.Serviceimpl;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Service.UserRegisterService;
import com.nt.entity.UserRegister;
import com.nt.model.UserRequestDto;
import com.nt.repository.UserRegisterRepo;
@Service
public class UserRegisterServiceImpl implements UserRegisterService {
	
	@Autowired
	private UserRegisterRepo userRegisterRepo;

	

	@Override
	public UserRegister insertUserRegister(UserRequestDto userRequestDto) {
		UserRegister user=new UserRegister();
		try {
			user.setFullName(userRequestDto.getFullName());
			user.setContactno(userRequestDto.getContactId());
			user.setEmail(userRequestDto.getEmail());
			user.setPassword(Base64.getEncoder().encodeToString(userRequestDto.getPassword().getBytes()));
			userRegisterRepo.save(user);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return user ;
	}

}
