package com.bridgelabz.loginregistration.serviceimpl;

import com.bridgelabz.loginregistration.repository.UserRepository;
import com.bridgelabz.loginregistration.service.LoginService;

public class LoginImpl implements LoginService {

	public boolean userLoginCheck(String username, String password) {
		
		return UserRepository.login(username,password);
	}
	
}
