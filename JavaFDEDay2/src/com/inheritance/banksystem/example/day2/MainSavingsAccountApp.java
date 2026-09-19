package com.inheritance.banksystem.example.day2;

import java.util.Scanner;

public class MainSavingsAccountApp {

	public static void main(String[] args) {
		
		Scanner inputBankScan=new Scanner(System.in);
		
		System.out.print("Enter Account Number :-  ");
		String acNo=inputBankScan.nextLine();
		
		System.out.print("Enter Account Holder Name :- ");
		String acName=inputBankScan.nextLine();
		
		System.out.print("Enter Initial Amount :- ");
		double amt=inputBankScan.nextDouble();
		
		System.out.print("Enter Simple Interest Rate (%) :- ");
		float rate=inputBankScan.nextFloat();
		inputBankScan.nextLine();
		
		SavingAccount bankaccnt=new SavingAccount(acNo,acName,amt,rate);
		
		System.out.println("Press W/w for Withdrawl Amount D/d for Deposit Amount E/e exit ");
		
		while(true) {
			System.out.println("\n Enter your choice (D/W/E)");
			String choice=inputBankScan.nextLine().trim();
			
			if(choice.equalsIgnoreCase("D") || choice.equalsIgnoreCase("d")) {
				System.out.println("Enter Deposit Amount :- ");
				float amount=inputBankScan.nextFloat();
				inputBankScan.nextLine();
				bankaccnt.Deposit(amount);
			}
			
			else if(choice.equalsIgnoreCase("W")||choice.equalsIgnoreCase("w")) {
				System.out.println("Enter Withdrawl Amount :- ");
				float amount=inputBankScan.nextFloat();
				inputBankScan.nextLine();
				bankaccnt.withdrawl(amount);
			}
			
			else if(choice.equalsIgnoreCase("E")||choice.equalsIgnoreCase("e")) {
				break;
			}
			
			else {
				System.out.println("Please Press Valid button W/w , D/d, E/e");
			}
			bankaccnt.getBankUserAccountDetailsdisplay();
			
		}
		inputBankScan.close();	
	}

	}


