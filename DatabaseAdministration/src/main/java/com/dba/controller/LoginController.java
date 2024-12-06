package com.dba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
@GetMapping("/plogin")
public String login()
{
	return "Portallogin";
}
@GetMapping("/adminlogout")
public String logout()
{
	return "adminlogin";
}
}
