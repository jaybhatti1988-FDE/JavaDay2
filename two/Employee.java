package com.inheritance.fde.additional.example.two;

public class Employee {
	
	protected String empID,empName,empDept;
	protected double basciSal;
	
	public Employee() {
	
	}
	
	public Employee(String empID,String empName,String empDept,double basicSal) {
		this.empID=empID;
		this.empName=empName;
		this.empDept=empDept;
		this.basciSal=basicSal;
	}

	public void setEmpID(String empID) {
		if (empID==null || empID.trim().isEmpty())
		{
			throw new IllegalArgumentException("Employee ID Should not Null or Empty");
		}
		this.empID = empID;
	}

	public void setEmpName(String empName) {
		if (empName==null || empName.trim().isEmpty())
		{
			throw new IllegalArgumentException("Employee Name Should not Null or Empty");
		}
		this.empName = empName;
	}

	public void setEmpDept(String empDept) {
		if (empDept==null || empDept.trim().isEmpty())
		{
			throw new IllegalArgumentException("Employee Department Should not Null or Empty");
		}
		this.empDept = empDept;
	}

	public void setBasciSal(double basciSal) {
		if (basciSal<=0 )
		{
			throw new IllegalArgumentException("Employee Basic Salary Should not Zero or Negative");
		}
		this.basciSal = basciSal;
	}

	public void EmpDisplayDetails() {
		System.out.println("Employee ID	    :- " + empID);
		System.out.println("Employee Name 	    :- " + empName);
		System.out.println("Employee Department :- " + empDept);
		System.out.printf("Employee Salary     :- ₹%.2f%n" , basciSal);
	}
	
	public double netTotalPay() {
		return 0.0;
	}
	
	
	public String getEmpID() {
		return empID;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public double getBasciSal() {
		return basciSal;
	}

}