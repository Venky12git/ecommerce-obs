package com.nt.Serviceimpl;

import com.nt.Service.UserRegisterService;
import com.nt.entity.UserRegister;
import com.nt.repository.UserRegisterRepo;

public class UserRegisterServiceImpl implements UserRegisterService {
	
	
	private UserRegisterRepo userRegisterRepo;

	@Override
	public String insertUserRegister(UserRegister userRegister) {
		
		userRegisterRepo.save(userRegister);
		
		return "data saved successfully";
	}

}
