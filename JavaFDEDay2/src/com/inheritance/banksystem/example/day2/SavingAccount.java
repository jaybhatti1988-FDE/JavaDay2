package com.inheritance.banksystem.example.day2;

import java.util.Scanner;

public class SavingAccount extends BankingSystem {
	
	private float interestRate,lastInterestEarned;
	
	public SavingAccount(){
		super();
	}
	
	public SavingAccount(String accountNumber, String accountHolderName, double accountBalance,float interestRate ) {
			super(accountNumber , accountHolderName , accountBalance);
			setInterestRate(interestRate);
	}
	
	public void setInterestRate(float interestRate) {
		if (interestRate<=0) {
			System.out.println("Interest Rate can't be zero or negative");
			return;
		}
		this.interestRate = interestRate;
	}	
	
	public void Deposit(float amount) {
		if(amount<=0) {
			System.out.println("Deposit amount should not be 0 or negative");
			return;
		}
		this.accountBalance+=amount;
		calculateInterest(amount);
		System.out.printf("Deposit ₹%.2f Amount Successfully in .%n", amount);
		displayInterest();
	}
	
	public float readValidFloat(Scanner inputScan,String prompt) {
		while(true) {
			System.out.println(prompt);
			if(inputScan.hasNextFloat()) {
				return inputScan.nextFloat();
			}
			else {
				System.out.println("Oops...! Please enter valid Float value");
				inputScan.next();
			}
		}
	}
	
	public String readValidString(Scanner inputScan,String prompt) {
		while(true) {
			System.out.println(prompt);
			String inputString=inputScan.nextLine();
			if (inputString==null || inputString.trim().isEmpty()) {
				System.out.println("Oops...! Blank and Value not allowed");
			} else if(inputString.matches(".*//d.*")) {
					System.out.println(" Oops...! Digits are not allowed in the name");
				}
				else {
					return inputString;
				}
			}
		}
	
	public long readValidLong(Scanner inputScan,String prompt) {
		while(true) {
			System.out.println(prompt);
			if(inputScan.hasNextLong()) {
				return inputScan.nextLong();
			}
			else {
				System.out.println("Oops...! Please enter valid Long value");
				inputScan.next();
			}
		}
	}

	public void calculateInterest(float amount) {
		this.lastInterestEarned=(amount*interestRate*1)/100;
	}
	
	private void displayInterest() {
		System.out.printf("Interest earned on this Deposit (@%2f%% p.a.) :- ₹%.2f%n",interestRate,lastInterestEarned);;
	}
	
	public float getInterestRate() {
		return interestRate;
	}

	public float getLastInterestEarned() {
		return lastInterestEarned;
	}
	
}
