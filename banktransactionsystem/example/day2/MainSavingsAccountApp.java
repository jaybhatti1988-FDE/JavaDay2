package com.inheritance.banktransactionsystem.example.day2;

import java.util.Scanner;

public class MainSavingsAccountApp {

	public static void main(String[] args) {
		
		Scanner inputTransactionScan=new Scanner(System.in);
		
		System.out.print("Enter Transaction Id :-  ");
		String trnsactionNo=inputTransactionScan.nextLine();
		
		System.out.print("Enter Transaction Date :- ");
		String trnsactionDate=inputTransactionScan.nextLine();
		
		System.out.print("Enter Transaction Amount :- ");
		double trnsactionAmt=inputTransactionScan.nextDouble();
		inputTransactionScan.nextLine();
	
		System.out.println("Press U/u for UPI Transaction C/c for Card Transaction N/n for Net Banking Transaction e/e exit ");
		
		String paymentMode="";
		while(true) {
			System.out.println("Enter your Transaction Payment Mode choice (U/C/N/E)");
			String trnsactionMode=inputTransactionScan.nextLine().trim();
			
			if(trnsactionMode.equalsIgnoreCase("U") || trnsactionMode.equalsIgnoreCase("u")) {
				paymentMode=" UPI ";
				System.out.println(" Transaction via UPI ");
				break;
			 } 
			  else if(trnsactionMode.equalsIgnoreCase("C") || trnsactionMode.equalsIgnoreCase("c")) {
				  paymentMode=" Card "; 
				  System.out.println(" Transaction via Card ");
				break;
			 }
			  else if(trnsactionMode.equalsIgnoreCase("N") || trnsactionMode.equalsIgnoreCase("n")) {
				  paymentMode= " Net Banking ";
				  System.out.println(" Transaction via Net Banking ");	
				   break;
				 }
			  else if(trnsactionMode.equalsIgnoreCase("E") || trnsactionMode.equalsIgnoreCase("e")) {
						System.out.println(" Transaction Existing ");
						inputTransactionScan.close();
						return;
					 }
			  else {
				  System.out.println("Please Press Valid button U/u , C/c, N/n, E/e ");
			  }
			}
		
		System.out.print("Enter Transaction Status :- ");
		String trnsactionStatus=inputTransactionScan.nextLine();
		
		  OnlineTransaction transaction=new OnlineTransaction(trnsactionNo, trnsactionDate, trnsactionAmt, paymentMode,trnsactionStatus);
			transaction.getTransactionPaymentDetailsdisplay();
			inputTransactionScan.close();
		}
	}