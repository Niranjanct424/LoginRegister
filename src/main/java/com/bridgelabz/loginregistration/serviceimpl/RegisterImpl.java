package com.bridgelabz.loginregistration.serviceimpl;

import com.bridgelabz.loginregistration.model.Register;
import com.bridgelabz.loginregistration.repository.UserRepository;
import com.bridgelabz.loginregistration.service.RegisterService;
import com.bridgelabz.loginregistration.utility.Utility;

public class RegisterImpl implements RegisterService {

	UserRepository userRepo = Utility.getUserRepo();
	public int registerUser(Register regInfo) {
		return userRepo.addUser(regInfo);
	}

}
