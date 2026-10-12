package com.inheritance.fde.additional.example.one;

public class Employee {
	
	protected String empId,empName,empDepartment;
	
	public Employee() {  //Default Constructor
		
	}
	
	public Employee(String empId,String empName,String empDepartment) {   // Parameterized Constructor
		this.empId=empId;
		this.empName=empName;
		this.empDepartment=empDepartment;
	}

	public void setEmpId(String empId) {
		if (empId==null || empId.trim().isEmpty())
		{
			throw new IllegalArgumentException("Employee ID Should not Null or Empty");
			//return;
		}
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		if (empName==null || empName.trim().isEmpty())
		{
			throw new IllegalArgumentException("Employee Name Should not Null or Empty");
			//return;
		}
		this.empName = empName;
	}

	public void setEmpDepartment(String empDepartment) {
		if (empDepartment==null || empDepartment.trim().isEmpty())
		{
			throw new IllegalArgumentException("Employee Department Should not Null or Empty");
			//return;
		}
		this.empDepartment = empDepartment;
	}
	
	public double NetCalculatePay() {
		return 0.0;
	}
	
	public void EmployeeDetails() {
		System.out.println("Employee ID :- " + empId);
		System.out.println("Employee Name :- " + empName);
		System.out.println("Employee Department :- " + empDepartment);
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}
	
	}