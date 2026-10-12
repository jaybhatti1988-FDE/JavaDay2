package com.inheritance.fde.additional.example.one;

public class SalariedEmployee extends Employee {
	
	private double monthlySalary;
	
	public SalariedEmployee(String empId,String empName,String empDepartment,double monthlySalary) {
		super(empId,empName,empDepartment);
		this.monthlySalary=monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary<=0 )
		{
			throw new IllegalArgumentException("Employee Salary Should not Zero or Negative");
			//return;
		}
		this.monthlySalary = monthlySalary;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	@Override
	public double NetCalculatePay() {
		return monthlySalary;
	}

	@Override
	public void EmployeeDetails() {
		super.EmployeeDetails();
		System.out.printf("Monthly Salary :- ₹%.2f%n", monthlySalary);
		System.out.printf("Net Pay :- ₹%.2f%n", NetCalculatePay());
	}
}
