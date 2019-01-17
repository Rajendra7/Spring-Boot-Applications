package com.cg.restservice.restservicedemo.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int empId;
	private String empName;
	private double salary;
	@Embedded
	private Address address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empNAme=" + empName + ", salary=" + salary + "]";
	}
	
	
	

}
