package com.kris.springbootbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kris.springbootbackend.model.Employee;
import com.kris.springbootbackend.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		Employee employee=new Employee("kris","kanth","kris@gmail.com");
//		employeeRepository.save(employee);
//		Employee emp1=new Employee("chan","kan","cha@gmail.com");
//		employeeRepository.save(emp1);
//		Employee emp2=new Employee("chan","chin","chinchan@gmail.com");
//		employeeRepository.save(emp2);
	}

}
