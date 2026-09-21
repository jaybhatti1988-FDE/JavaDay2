package com.inheritance.banktransactionsystem.example.day2;

public class Transaction {
	
	protected String transactionId,date;
	protected double transactionAmount;
		
	public Transaction() { // default constructor
	}	
	
	// Parameterized Constructor
	
	public Transaction(String transactionId,String date,double transactionAmount) {
		setTransactionId(transactionId);
		setDate(date);
		setTransactionAmount(transactionAmount);
	}
	
	public void setTransactionId(String transactionId) {
		if(transactionId==null || transactionId.isEmpty()) {
			System.out.println("Transaction ID should not be null or empty");
			return;
		}
		this.transactionId = transactionId;
		
	}

	public void setDate(String date) {
		if(date==null || date.isEmpty()) {
			System.out.println("Transaction Date should not be null or empty");
			return;
		}
		this.date = date;
	}

	public void setTransactionAmount(double transactionAmount) {
		if(transactionAmount<0) {
			System.out.println("Transaction Amount should not be o or negative");
			return;
		}
		this.transactionAmount = transactionAmount;
	}	
		
	public void getTransactionPaymentDetailsdisplay() {
		
		System.out.println("\n\nTransaction Refrence Number : " + transactionId);
		System.out.println("Transaction Date : " + date);
		System.out.printf("Transaction Amount : ₹%.2f%n" , transactionAmount);
		
	}

	public String getTransactionId() {
		return transactionId;
	}

	public String getDate() {
		return date;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

}
