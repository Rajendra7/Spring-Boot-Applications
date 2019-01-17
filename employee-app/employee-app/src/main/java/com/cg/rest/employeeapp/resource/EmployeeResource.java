package com.cg.rest.employeeapp.resource;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.employeeapp.entity.Employee;
import com.cg.rest.employeeapp.service.EmployeeService;



@RestController
@RequestMapping("/employee")
public class EmployeeResource {

	@Autowired
	private EmployeeService service;

	@PostMapping
	public void addNewEmployee(@RequestBody Employee employee) {
		service.addNewEmployee(employee);
	}

	@GetMapping
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}
	
	@PutMapping
	public void updateEmployee(@RequestBody Employee employee) {
		service.updateEmployee(employee);
	}
	
	@DeleteMapping("/{empId}")
	public void deleteEmployee(@PathVariable int empId) {
		service.deleteEmployee(empId);
	}
	
	@GetMapping("/{empId}")
	public void getEmployeeById(@PathVariable int empId) {
		service.getEmployeeById(empId);
	}
}
