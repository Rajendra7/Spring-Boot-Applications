package com.cg.restservice.restservicedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.restservice.restservicedemo.entity.Employee;

@Repository()
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
