package com.dhurba.bank;

public class Employee implements Hierarchy {

	private String firstName;
	private String lastName;
	private int salary;
	
	Employee(String firstName,String lastName,int salary){
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}
	Employee(){
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}
	public void saving() {
		System.out.println("This is a method to print employee saving account.");
		
	}
	public void checking() {
		System.out.println("This is a method to print employee chcking account.");
		
	}
	
}
