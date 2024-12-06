package com.dba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dba.model.ManagerLogin;
@Repository
public interface ManagerLoginRepo extends JpaRepository<ManagerLogin, Integer> {
ManagerLogin findByUsernameAndPassword(String username,String password);
}
