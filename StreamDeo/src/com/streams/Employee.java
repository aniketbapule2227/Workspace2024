package com.streams;

import java.util.List;

public class Employee {
	
	private String fname;
	private String lname;
	private List<Address> address;
	public Employee() {
		
		
	}
	public Employee(String fname, String lname, List<Address> address) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", address=" + address + "]";
	}

}
