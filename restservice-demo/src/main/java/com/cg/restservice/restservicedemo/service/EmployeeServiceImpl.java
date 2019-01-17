package com.cg.restservice.restservicedemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.restservice.restservicedemo.entity.Employee;
import com.cg.restservice.restservicedemo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired(required=true)
	public EmployeeRepository repository;

	public void addNewEmployee(Employee employee) {
		repository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return repository.findAll();
	}

	
	
	
	
}
