package com.inheritance.empmgmtsystem.example.day2;

public class Manager extends Employee {
	
	private String departName;
	private float managerBonus,totalSalary;
	
	public Manager() { // default constructor with super keyword
		super();
	}

	public Manager(String employeeId,String employeeName,float employeeSalary,String departName,float managerBonus) {
		super(employeeId,employeeName,employeeSalary);
		setDepartmentName(departName);
		setManagerBonus(managerBonus);
	}

	public void setManagerBonus(float managerBonus) {
		if (managerBonus<=0) {
			System.out.println("Bonus can't negative or Zero");
			return;
		}
		this.managerBonus=managerBonus;
	}

	public void setDepartmentName(String departName) {
		if (departName==null ||departName.isEmpty()) {
			System.out.println("Department Name neither Empty nor Null ");
		return;
		}
		this.departName=departName;
	}
	
	public void calculateTotalSalary() {
		this.totalSalary=this.employeeSalary+this.managerBonus;
	}
	
	@Override
	public void DisplayEmployeManagerDetails() {
		super.DisplayEmployeManagerDetails();
		System.out.println("Department :- " + departName);
		System.out.printf("Bonus   :- ₹%.2f%n"  ,managerBonus);
		System.out.printf("Total Salary    :- ₹%.2f%n" ,totalSalary);
	}
	
	public String getDepartName() {
		return departName;
	}

	public float getManagerBonus() {
		return managerBonus;
	}

	public float getTotalSalary() {
		return totalSalary;
	}	
}
