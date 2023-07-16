package com.kris.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kris.springbootbackend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}
