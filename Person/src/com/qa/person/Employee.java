package com.qa.person;

public class Employee {
	// Attributes
	private double annualSalary;
	private double weeklySalary;
	
	//Constructor
	public Employee(double annualSalary) {
		super();
		this.annualSalary = annualSalary;
	}
	
	//Methods
	public double calculateWWeeklySalary() {
		this.weeklySalary = this.annualSalary / 52;
		return weeklySalary;
	}


}
