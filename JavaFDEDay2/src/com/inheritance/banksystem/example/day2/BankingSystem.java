package com.inheritance.banksystem.example.day2;

public class BankingSystem {
	
	protected String accountNumber,accountHolderName;
	protected double accountBalance;
	
	
	public BankingSystem() { // default constructor
		
	}	
	
	// Parameterized Constructor
	
	public BankingSystem(String accountNumber,String accountHolderName,double accountBalance) {
		setAccountNumber(accountNumber);
		setAccountHolderName(accountHolderName);
		setAccountBalance(accountBalance);
	}
	
	public void setAccountNumber(String accountNumber) {
		if(accountNumber==null || accountNumber.isEmpty()) {
			System.out.println("Account number should not be null or empty");
			return;
		}
		this.accountNumber = accountNumber;
	}
	
	public void setAccountHolderName(String accountHolderName) {
		if(accountHolderName==null || accountHolderName.isEmpty()) {
			System.out.println("Account name should not be null or empty");
			return;
		}
		this.accountHolderName = accountHolderName;
	}
	
	public void setAccountBalance(double accountBalance) {
		if(accountBalance<0) {
			System.out.println("Account balance should not be negative");
			return;
		}
		this.accountBalance = accountBalance;
	}
	

	public void Deposit(float amount) {
		if(amount<=0) {
			System.out.println("Deposit amount should not be 0 or negative");
			return;
		}
		this.accountBalance+=amount;
		System.out.printf("Deposit ₹%.2f Amount Successfully in .%n", amount);
		
	}

	public void withdrawl(float amount) {
		if(amount<=0) {
			System.out.println("Withdrawl amount should not be 0 or negative");
		}
		
		if(amount>this.accountBalance) {
			System.out.println("Insufficient Balance");
			return;
		}
		this.accountBalance-=amount;
		System.out.printf("Withdraw ₹%.2f Amount Successfully in .%n", amount);
	}
		
	public void getBankUserAccountDetailsdisplay() {
		
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Holder Name : " + accountHolderName);
		System.out.println("Account Balance : " + accountBalance);
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

}
