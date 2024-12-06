package com.dba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dba.model.Employee;
import com.dba.service.ManagerService;

@Controller
public class ManagerController {
@Autowired
ManagerService managerservice;

//Fetching employees
@GetMapping("/employees")
public String employees(Model model)
{
	model.addAttribute("employee", managerservice.getEmployees());
	return "employee_Details";
}

//Adding employees
@GetMapping("/addemployee")
public String addEmp(Model model)
{
	Employee m=new Employee();
	model.addAttribute("employee",m);
	return "add_Employee";
}
@PostMapping("/addemployee")
public String addEmployee(@ModelAttribute("employee") Employee employee)
{
	managerservice.addEmployee(employee);
	return "managerhome";
}

//Updating Employee
@GetMapping("/manager/employeeupdate/{id}")
public String updateEmp(Model model,@PathVariable int id)
{
	model.addAttribute("employee",managerservice.updateEmp(id));
	return "update_Employee";
}
@PostMapping("/manager/{id}")
public String updateEmployee(@ModelAttribute("employee") Employee employee,@PathVariable int id)
{
	managerservice.updateEmployee(employee,id);
	return "managerhome";
}

}
