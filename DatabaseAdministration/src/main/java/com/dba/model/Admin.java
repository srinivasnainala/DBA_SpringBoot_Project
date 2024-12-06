package com.dba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String mobilenumber;
private String role;
public Admin() {
	// TODO Auto-generated constructor stub
}
public Admin(int id, String name, String mobilenumber, String role) {
	super();
	this.id = id;
	this.name = name;
	this.mobilenumber = mobilenumber;
	this.role = role;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

}
