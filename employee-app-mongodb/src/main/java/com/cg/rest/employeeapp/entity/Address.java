package com.cg.rest.employeeapp.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {
	
	private String flatNO;
	private String name;
	private String street;
	private String city;
	private String pincode;
	
	
	public Address(String flatNO, String name, String street, String city, String pincode) {
		super();
		this.flatNO = flatNO;
		this.name = name;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	public Address() {
		super();
		
	}
	public String getFlatNO() {
		return flatNO;
	}
	public void setFlatNO(String flatNO) {
		this.flatNO = flatNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [flatNO=" + flatNO + ", name=" + name + ", street=" + street + ", city=" + city + ", pincode="
				+ pincode + "]";
	}
}