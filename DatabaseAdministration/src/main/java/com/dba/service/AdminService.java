package com.dba.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dba.model.Admin;
import com.dba.model.Manager;
import com.dba.repository.AdminRepo;
import com.dba.repository.ManagerRepo;

@Service
public class AdminService {
@Autowired
AdminRepo adminrepo;

@Autowired
ManagerRepo managerrepo;
public void addAdmin(Admin admin) {
	 adminrepo.save(admin);
}
public Admin update(int id) {
	return adminrepo.findById(id).get();
}
public Admin updateAdmin(int id, Admin admin) {
	Admin ad=adminrepo.findById(id).get();
	ad.setName(admin.getName());
	ad.setMobilenumber(admin.getMobilenumber());
	ad.setRole(admin.getRole());
	return adminrepo.save(ad);
}
public List<Admin> admins() {
	return adminrepo.findAll();
}

public void addManager(Manager manager) {
	managerrepo.save(manager);
}
public List<Manager> managerData() {
	return managerrepo.findAll();
}
public Manager updateM(int id) {
	return managerrepo.findById(id).get();
}
public Manager updateManager(int id, Manager manager) {
Manager m=managerrepo.findById(id).get();
m.setName(manager.getName());
m.setMobilenumber(manager.getMobilenumber());
m.setRole(manager.getRole());
m.setSalary(manager.getSalary());
return managerrepo.save(m);
}
public Manager getManager(int id) {
	return managerrepo.findById(id).get();
}
}

