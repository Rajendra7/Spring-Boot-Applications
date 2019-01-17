package com.cg.rest.employeeapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.rest.employeeapp.entity.Employee;


@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
	
}
