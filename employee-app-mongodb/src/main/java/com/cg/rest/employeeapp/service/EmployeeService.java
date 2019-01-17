package com.cg.rest.employeeapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.rest.employeeapp.entity.Employee;


@Service
public interface EmployeeService  {
	
	void addNewEmployee(Employee employee);

	List<Employee> getAllEmployees();

	void updateEmployee(Employee employee);

	//void deleteEmployee(int empId);

	void getEmployeeById(int empId);

}
