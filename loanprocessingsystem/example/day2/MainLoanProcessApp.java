package com.inheritance.loanprocessingsystem.example.day2;

import java.util.Scanner;

public class MainLoanProcessApp {

	public static void main(String[] args) {
		
	Scanner scanHomeLoan=new Scanner(System.in);
		
	System.out.print("Enter Loan Id :-  " );
	String loanId=scanHomeLoan.nextLine();
	
	System.out.print("Enter Loan Amount :- ");
	float loanAmt=scanHomeLoan.nextFloat();
	scanHomeLoan.nextLine();
	
	System.out.print("Enter Loan Tenture :- ");
	float loanTenture=scanHomeLoan.nextFloat();
	scanHomeLoan.nextLine();
	
	System.out.print("Enter Interest Rate");
	float interestRate=scanHomeLoan.nextFloat();
	scanHomeLoan.nextLine();
	
	HomeLoan homeloan=new HomeLoan(loanId, loanAmt, loanTenture, interestRate);
	homeloan.SetTotalPayAmount();
	homeloan.LoanProcessBasicsPersonDetailsDisplay();
	scanHomeLoan.close();
	
	}

}
