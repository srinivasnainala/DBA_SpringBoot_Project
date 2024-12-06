package com.dba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dba.service.ManagerLoginService;

@Controller
public class ManagerLoginController {
@Autowired
ManagerLoginService managerloginservice;

@GetMapping("/managerlogin")
public String login(Model model)
{
	return "managerlogin";
}
@PostMapping("/managerlogin")
public String managerLogin(Model model, String username,String password)
{
	if(managerloginservice.managerlogin(username,password))
	{
		return "/managerhome";
	}
	else
	{
		model.addAttribute("error", "InvalidCredentials");
		return "managerlogin";
	}
}
@GetMapping("/managerlogout")
public String logout()
{
	return "managerlogin";
}
@GetMapping("/managerhome")
public String Home()
{
	return "managerhome";
}
}
