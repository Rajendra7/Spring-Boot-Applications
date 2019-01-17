package com.cg.rest.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.rest.employeeapp.entity.Employee;
import com.cg.rest.employeeapp.repository.EmployeeRepository;

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

		@Override
		public void updateEmployee(Employee employee) {
			repository.save(employee);
		}

	/*
	 * @Override public void deleteEmployee(int empId) { Employee
	 * employee=repository.getOne(empId); repository.delete(employee);
	 * 
	 * }
	 */

		@Override
		public void getEmployeeById(int empId) {
			repository.findById(empId);
		}

		
}
