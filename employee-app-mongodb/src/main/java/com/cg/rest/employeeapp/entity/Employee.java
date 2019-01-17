package com.cg.rest.employeeapp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	
	@Id
	private int empId;
	private String empName;
	private double salary;
	/*
	 * @Embedded private Address address;
	 */
	
	public Employee() {
		super();
		
	}
	public Employee(int empId, String empName, double salary, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		//this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpNAme() {
		return empName;
	}
	public void setEmpNAme(String empNAme) {
		this.empName = empNAme;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/*
	 * public Address getAddress() { return address; } public void
	 * setAddress(Address address) { this.address = address; }
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empNAme=" + empName + ", salary=" + salary + "]";
	}
	
	
	


}
