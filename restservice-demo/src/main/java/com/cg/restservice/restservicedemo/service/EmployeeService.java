package com.cg.restservice.restservicedemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.restservice.restservicedemo.entity.Employee;

@Service
public interface EmployeeService {

	void addNewEmployee(Employee employee);

	List<Employee> getAllEmployees();

	

}