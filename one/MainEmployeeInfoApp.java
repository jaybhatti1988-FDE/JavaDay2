package com.inheritance.fde.additional.example.one;

import java.util.ArrayList;
import java.util.Scanner;
public class MainEmployeeInfoApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		ArrayList<Employee> employees=new ArrayList<>();
		
		System.out.print("Enter Number of Employees Details you want to enter ? :- ");
		int noEmp=Integer.parseInt(scan.nextLine().trim());
		for (int idxNoofEmp = 0; idxNoofEmp < noEmp; idxNoofEmp++) {
			System.out.println("\n Details Number of Employees " + (idxNoofEmp+1) + " ---- ");
			Employee emp=null;
			
			while (emp==null) {
				try {
					
					System.out.print("Enter Employee ID:- ");
					String empId=scan.nextLine();
					
					System.out.print("Enter Employee Name:- ");
					String empName=scan.nextLine();
					
					System.out.print("Enter Employee Department:- ");
					String empDepartment=scan.nextLine();
					
					System.out.print("Enter Employee Monthly Salary:- ");
					double empSalary=Double.parseDouble(scan.nextLine().trim()) ;
					
					emp =new SalariedEmployee(empId, empName, empDepartment, empSalary);
					
				} catch (NumberFormatException err) {
					System.out.println(" Invalid Number format Please Re-enter all Details. " );
				}
				 catch (IllegalArgumentException err) {
					 System.out.println(" Error:- "+ err.getMessage()+ " Please Re-enter all Details " );
				}
			}
			
			employees.add(emp);
		}
		
		System.out.println("\n===== Employee Report =====\n");
		
		double total=0;
		
		for (Employee e:employees) {
			e.EmployeeDetails();
			total+=e.NetCalculatePay();
            System.out.println("---------------------------");	
		}
		System.out.printf("Total PayRoll ₹%.2f%n",total);
		scan.close();
	}

}
