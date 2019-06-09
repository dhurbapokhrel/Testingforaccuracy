package com.dhurba.bank;

public class Department implements Hierarchy {

	private String loan;
	private String saving;
	private String checking;
	private String homeLoan;
	
	Department(String...strings){
		this.loan=loan;
		this.saving=saving;
		this.checking=checking;
		this.homeLoan=homeLoan;
	}
	Department(){
		
	}
	public String getLoan() {
		return loan;
	}
	public void setLoan(String loan) {
		this.loan = loan;
	}
	public String getSaving() {
		return saving;
	}
	public void setSaving(String saving) {
		this.saving = saving;
	}
	public String getChecking() {
		return checking;
	}
	public void setChecking(String checking) {
		this.checking = checking;
	}
	public String getHomeLoan() {
		return homeLoan;
	}
	public void setHomeLoan(String homeLoan) {
		this.homeLoan = homeLoan;
	}
	@Override
	public String toString() {
		return "Department [loan=" + loan + ", saving=" + saving + ", checking=" + checking + ", homeLoan=" + homeLoan
				+ "]";
	}
	public void saving() {
		System.out.println("This is a method to print who work in saving department.");
		
	}
	public void checking() {
		System.out.println("This is a method to print who work in checking department.");
		
	}
	
}
