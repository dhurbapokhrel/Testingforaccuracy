package com.dhurba.bank;

public class Bank implements Hierarchy{

	private String employee;
	private String department;
	private String nameOfTheBank;
	private String address;
	
	Bank(String...strings){    // using Varargs to use String values.
		this.employee=employee;
		this.department=department;
		this.nameOfTheBank=nameOfTheBank;
		this.address=address;
		
	}
	Bank(){
		
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getNameOfTheBank() {
		return nameOfTheBank;
	}
	public void setNameOfTheBank(String nameOfTheBank) {
		this.nameOfTheBank = nameOfTheBank;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Bank [employee=" + employee + ", department=" + department + ", nameOfTheBank=" + nameOfTheBank
				+ ", address=" + address + "]";
	}
	public void saving() {
		System.out.println("This is a method to print Saving Account.");
		
	}
	public void checking() {
		System.out.println("This is a method to print Checking Account.");
		
	}
	
}
