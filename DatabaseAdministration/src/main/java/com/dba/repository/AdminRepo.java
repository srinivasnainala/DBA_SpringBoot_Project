package com.dba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dba.model.Admin;
@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
