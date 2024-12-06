package com.dba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dba.model.Employee;
import com.dba.repository.EmployeeRepo;

@Service
public class ManagerService {
@Autowired
EmployeeRepo employeerepo;

public Employee addEmployee(Employee employee) {
	return employeerepo.save(employee);	
}

public List<Employee> getEmployees() {
	return employeerepo.findAll();
}

public Employee updateEmp(int id) {
	
	return employeerepo.findById(id).get();
}

public Employee updateEmployee(Employee employee, int id) {
	Employee em=employeerepo.findById(id).get();
	em.setName(employee.getName());
	em.setDepartment(employee.getDepartment());
    em.setRole(employee.getRole());
    em.setSalary(employee.getSalary());
	return employeerepo.save(em);
	
}

}
