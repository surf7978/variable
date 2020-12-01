package com.yedam.collection;

public class Employee {
	private int employeeId;
	private String lastName;
	private String email;
	private int salary;
	
	
	public Employee(int employeeId, String lastName, String email, int salary) {
		super();
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public String getLastName() {
		return lastName;
	}


	public String getEmail() {
		return email;
	}


	public int getSalary() {
		return salary;
	}
	
	
	
	
}
