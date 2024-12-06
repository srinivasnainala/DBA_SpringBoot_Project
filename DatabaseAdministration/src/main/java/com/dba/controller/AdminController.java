package com.dba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dba.model.Admin;
import com.dba.model.Manager;
import com.dba.service.AdminService;

@Controller
public class AdminController {
	@Autowired
	AdminService adminservice;

//Fetching adminDetails
	@GetMapping("/admins")
	public String admins(Model model)
	{
		model.addAttribute("admin",adminservice.admins());
		return "admin_Details";
	}
//Adding Admindetails	
@GetMapping("/admin")
public String add(Model model)
{
	Admin admin=new Admin();
	model.addAttribute("admin", admin);
	return "add_Admin";
}
@PostMapping("/admin")
public String addAdmin(@ModelAttribute("admin") Admin admin)
{
	adminservice.addAdmin(admin);
	return "redirect:/home1";
}

//Updating Admin_details
@GetMapping("/admin/update/{id}")
public String update(Model model,@PathVariable int id)
{
	model.addAttribute("adminupdate",adminservice.update(id));
	return "update_Admin";
}

@PostMapping("/admin/{id}")
public String updateAdmin(@ModelAttribute("adminupdate") Admin admin,@PathVariable int id)
{
	adminservice.updateAdmin(id,admin);
	return "redirect:/home1";
}

//Nvaigating to home page
@GetMapping("/home1")
public String homePage() {
    return "Home";
}

//Fetching Manager details
@GetMapping("/admin/managerdetails")
public String managerData(Model model)
{
	model.addAttribute("admin",adminservice.managerData());
	return "manager_Details";
}

//Fetching Manager by id
@GetMapping("/admin/managerdetails/{id}")
public String getManager(Model model,@PathVariable int id)
{
	model.addAttribute("manager",adminservice.getManager(id));
	return "manager_Details";
}
//Adding Manager details
@GetMapping("/admin/manager")
public String addm(Model model)
{
	Manager adminmanager=new Manager();
	model.addAttribute("manager", adminmanager);
	return "add_Manager";
}
@PostMapping("/admin/manager")
public String addManager(@ModelAttribute("manager") Manager manager)
{
	adminservice.addManager(manager);
	return "redirect:/home1";
}

//Updating ManagerDetails
@GetMapping("/admin/updatemanager/{id}")
public String updateM(Model model,@PathVariable int id)
{
	model.addAttribute("manager", adminservice.updateM(id));
	return "update_Manager";
}
@PostMapping("/admin/manager/{id}")
public String updateManager(@ModelAttribute("manager") Manager manager,@PathVariable int id)
{
	adminservice.updateManager(id,manager);
	return "redirect:/home1";
}

}
