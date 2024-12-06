package com.dba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dba.model.AdminLogin;
import com.dba.repository.AdminLoginRepo;

@Service
public class AdminLoginService {
@Autowired
AdminLoginRepo adminloginrepo;

public boolean login(String username,String password) {

	AdminLogin validate=adminloginrepo.findByUsernameAndPassword(username, password);
	if(validate!=null)
	{
		return true;
	}
	return false;
}
}
