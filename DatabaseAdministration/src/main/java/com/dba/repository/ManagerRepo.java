package com.dba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dba.model.Manager;
@Repository
public interface ManagerRepo extends JpaRepository<Manager, Integer> {

}
