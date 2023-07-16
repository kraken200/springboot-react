package com.kris.springbootbackend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kris.springbootbackend.exception.ResourceNotFoundException;
import com.kris.springbootbackend.model.Employee;
import com.kris.springbootbackend.repository.EmployeeRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		List<Employee> emps=employeeRepository.findAll();
		
		return emps;
	}
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
		Employee employee= employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee does not exist with id:"+id) );
		return ResponseEntity.ok(employee);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable long id,@RequestBody Employee employeeDetails){
		Employee updateEmployee= employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee does not exist with id:"+id) );
		updateEmployee.setFirstName(employeeDetails.getFirstName());
		updateEmployee.setLastName(employeeDetails.getLastName());
		updateEmployee.setEmailId(employeeDetails.getEmailId());
		employeeRepository.save(updateEmployee);
		return ResponseEntity.ok(updateEmployee);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable long id){
		Employee employee= employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee does not exist with id "+id));
		employeeRepository.delete(employee);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
