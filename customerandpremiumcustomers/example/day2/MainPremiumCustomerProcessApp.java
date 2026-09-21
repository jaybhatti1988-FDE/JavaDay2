package com.inheritance.customerandpremiumcustomers.example.day2;

import java.util.Scanner;
public class MainPremiumCustomerProcessApp {

	public static void main(String[] args) {
		
		Scanner scanCust=new Scanner(System.in);
		
		System.out.print("Enter Customer Id ");
		String custId=scanCust.nextLine();
		
		System.out.print("Enter Customer Name ");
		String custName=scanCust.nextLine();
		
		System.out.print("Enter Customer Phone Number ");
		long custPh=scanCust.nextLong();
		scanCust.nextLine();
		
		System.out.print("Enter Customer Membership Type ");
		String custmemrtype=scanCust.nextLine();
		
		System.out.print("Enter Customer Membership Monthly fees ");
		float custMemfees=scanCust.nextFloat();
		scanCust.nextLine();
		
		System.out.print("Enter Customer Membership Discount ");
		float custMemdiscnt=scanCust.nextFloat();
		scanCust.nextLine();
		
		PremiumCustomer precustmr=new PremiumCustomer(custId, custName, custPh, custmemrtype, custMemfees, custMemdiscnt);
		precustmr.customerDisplayDetails();
		scanCust.close();
	}

}
