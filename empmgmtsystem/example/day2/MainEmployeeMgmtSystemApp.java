package com.inheritance.empmgmtsystem.example.day2;

import java.util.Scanner;
public class MainEmployeeMgmtSystemApp {

	public static void main(String[] args) {
		
		Scanner empScan=new Scanner(System.in);
		
		System.out.print("Enter Employee Id :- ");
		String empId=empScan.nextLine();
		
		System.out.print("Enter Employee Name :- ");
		String empName=empScan.nextLine();
		
		System.out.print("Enter Employee Salary :- ");
		float empSalary=empScan.nextFloat();
		empScan.nextLine();
		
		System.out.print("Enter Manager Department :- ");
		String empDept=empScan.nextLine();
		
		System.out.print("Enter Bonus Amount :- ");
		float bonus=empScan.nextFloat();
		empScan.nextLine();
		

		Manager mng=new Manager(empId,empName,empSalary,empDept,bonus);
		mng.calculateTotalSalary();
		mng.DisplayEmployeManagerDetails();
		empScan.close();
	}
	
}
