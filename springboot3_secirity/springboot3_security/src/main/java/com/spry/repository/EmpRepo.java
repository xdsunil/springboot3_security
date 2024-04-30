package com.spry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spry.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

	public Employee findByEmail(String email);
	
	
}
