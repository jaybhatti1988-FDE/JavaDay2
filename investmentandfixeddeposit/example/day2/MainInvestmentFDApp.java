package com.inheritance.investmentandfixeddeposit.example.day2;

import java.util.Scanner;
public class MainInvestmentFDApp {

	public static void main(String[] args) {
		
		Scanner scanFD=new Scanner(System.in);
		
		System.out.print("Enter Investment Amount ");
		float invAmt=scanFD.nextFloat();
		scanFD.nextLine();
		
		System.out.print(" Enter Duration ");
		int duration=scanFD.nextInt();
		scanFD.nextLine();
		
		System.out.print(" Enter Interest Rate ");
		float intRte=scanFD.nextFloat();
		scanFD.nextLine();
		
		FixedDeposit fdinv=new FixedDeposit(invAmt, duration, intRte);
		fdinv.InvestmentFDDetails();
		scanFD.close();

	}

}
