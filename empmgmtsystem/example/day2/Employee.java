package com.inheritance.empmgmtsystem.example.day2;

public class Employee {
	
	protected String employeeId,employeeName;
	protected float employeeSalary;
	
	public Employee() { // Default constructor
	}
	
	// Parameterized Constructor
	
	public Employee(String employeeId,String employeeName,float employeeSalary) {
		setEmployeeId(employeeId);
		setEmployeeName(employeeName);
		setEmployeeSalary(employeeSalary);
	}
	
	public void setEmployeeId(String employeeId) {
		
		if (employeeId==null  ||employeeId.isEmpty() ) {
			System.out.println("Employee Id neither Empty nor Null ");
		return;
		}
		this.employeeId=employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		if (employeeName.isEmpty() || employeeName==null) {
			System.out.println("Employee Name neither Empty nor Null ");
		return;
		}
		this.employeeName=employeeName;
	}

	public void setEmployeeSalary(float employeeSalary) {
		if (employeeSalary<=0) {
			System.out.println("Employee Salary neither zero nor negative ");
		return;
		}
		this.employeeSalary=employeeSalary;
	}
	
	
	
	public void DisplayEmployeManagerDetails() {
		System.out.println("\n\nEmployee Id :- " + employeeId);
		System.out.println("Employee Name :- " + employeeName);
		System.out.printf("Employee Salyary  :- ₹%.2f%n", employeeSalary);
	} 

	public String getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}
	
	

}
	
