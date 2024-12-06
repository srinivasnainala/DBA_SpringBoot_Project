package com.dba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dba.model.AdminLogin;
import com.dba.service.AdminLoginService;

@Controller
public class AdminLoginController {
@Autowired
AdminLoginService adminloginservice;

@GetMapping("/adminlogin")
public String adlogin()
{
	return "adminlogin";
}
@PostMapping("/adminlogin")
public String login(Model model,String username,String password)
{
	if(adminloginservice.login(username,password))
	{
		return "Home";
	}
	else
	{
		model.addAttribute("error", "InvalidCredentials");
	return "adminlogin";
	}
}
@GetMapping("/home")
public String home()
{
	return "Home";
}

}
