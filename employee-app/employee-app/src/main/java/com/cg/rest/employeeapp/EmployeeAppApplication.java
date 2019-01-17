package com.cg.rest.employeeapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.rest.employeeapp.entity.Address;
import com.cg.rest.employeeapp.entity.Employee;
import com.cg.rest.employeeapp.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAppApplication.class, args);
	}
	@Bean
	public   CommandLineRunner populateData(EmployeeRepository repository) {
		
		return(arg) -> {
			repository.save(new Employee(101, "Raj", 10000, new Address("10-01","abc","xyz","Mumbai","400708")));
			repository.save(new Employee(102, "Raj", 10000, new Address("10-01","abc","xyz","Mumbai","400708")));
			repository.save(new Employee(103, "Raj", 10000, new Address("10-01","abc","xyz","Mumbai","400708")));
			repository.save(new Employee(104, "Raj", 10000, new Address("10-01","abc","xyz","Mumbai","400708")));
			repository.save(new Employee(105, "Raj", 10000, new Address("10-01","abc","xyz","Mumbai","400708")));
			repository.save(new Employee(106, "Raj", 10000, new Address("10-01","abc","xyz","Mumbai","400708")));
		};
	}

}

