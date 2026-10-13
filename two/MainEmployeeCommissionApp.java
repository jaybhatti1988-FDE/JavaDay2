package com.inheritance.fde.additional.example.two;
import java.util.ArrayList;
import java.util.Scanner;
public class MainEmployeeCommissionApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		ArrayList<Employee>employee=new ArrayList<>();

		System.out.print("Enter Number of Employee Commission Details you want enter ?:- ");
		int emoNo=Integer.parseInt(scan.nextLine().trim());
		
		for (int empIdx = 0; empIdx < emoNo; empIdx++) {
			
			System.out.println("\n Details Number of Employee/s " + (empIdx+1) + " ---- ");
			Employee emp=null;
			
			while(emp==null) {
				try {
				System.out.print("Enter Employee ID:- ");
				String empID=scan.nextLine();
				
				System.out.print("Enter Employee Name:- ");
				String empName=scan.nextLine();
				
				System.out.print("Enter Employee Department:- ");
				String empDept=scan.nextLine();
				
				System.out.print("Enter Employee Salary:- ");
				double basicSal=Double.parseDouble(scan.nextLine().trim());
				
				System.out.print("Enter Employee Sales Amount :- ");
				double salesAmount=Double.parseDouble(scan.nextLine().trim());
				
				System.out.print("Enter Employee Commission you Pay(%) :- ");
				float payCommission=Float.parseFloat(scan.nextLine().trim());		
				
				emp=new CommissionEmployee(empID, empName, empDept, basicSal, salesAmount, payCommission);
				
			}catch (NumberFormatException numerr) {
					System.out.println(" Invalid Number format Please Re-enter all Details. " );
				}catch (IllegalArgumentException Illglrr) {
					 System.out.println(" Error:- "+ Illglrr.getMessage()+ " Please Re-enter all Details " );
				}
			}
			employee.add(emp);
		}
		System.out.println("\n===== Employee Commission Report =====\n");
		
		double totalNetPay=0;
		for(Employee e:employee) {
			e.EmpDisplayDetails();
			totalNetPay+=e.netTotalPay();
			System.out.println("---------------------------------------");	
		}
		System.out.printf("Total Salry Commission Pay Roll ₹%.2f%n",totalNetPay);
		scan.close();
	}
}
