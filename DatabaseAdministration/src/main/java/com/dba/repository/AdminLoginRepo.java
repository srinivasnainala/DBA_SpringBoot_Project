package com.dba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dba.model.AdminLogin;
@Repository
public interface AdminLoginRepo extends JpaRepository<AdminLogin, Integer> {
AdminLogin findByusername(String username);
AdminLogin findBypassword(String password);
AdminLogin findByUsernameAndPassword(String username,String password);
}
