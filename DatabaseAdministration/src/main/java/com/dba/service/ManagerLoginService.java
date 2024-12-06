package com.dba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dba.model.ManagerLogin;
import com.dba.repository.ManagerLoginRepo;

@Service
public class ManagerLoginService {
@Autowired
ManagerLoginRepo managerloginrepo;

public boolean managerlogin(String username, String password) {
	ManagerLogin validate= managerloginrepo.findByUsernameAndPassword(username, password);
	if(validate!=null)
	{
		return true;
	}
	else
	{
		return false;	
	}
	
}


}
