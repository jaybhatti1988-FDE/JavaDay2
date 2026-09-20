package com.inheritance.loanprocessingsystem.example.day2;

public class HomeLoan extends Loan {

	private float interestRate,totalPayAmount;
	
	public HomeLoan() {
		super();
	}
	public HomeLoan(String loanId,float loanAmount,float loanTenure,float interestRate) {
		super(loanId,loanAmount,loanTenure);
		setInterestRate(interestRate);
	}
	public void setInterestRate(float interestRate) {
		if (interestRate<=0) {
			System.out.println("Loan Interest Rate neither zero nor negative ");
			return;
		}
		this.interestRate=interestRate;
	}
	
	public void SetTotalPayAmount() {
		this.totalPayAmount=(this.loanAmount*this.loanTenure*this.interestRate)/100;
	}
	
	@Override
	public void LoanProcessBasicsPersonDetailsDisplay() {
		super.LoanProcessBasicsPersonDetailsDisplay();
		System.out.printf("Interest Rate :- %.2f%n" , interestRate);
		System.out.printf("Total Amount Payble :-  ₹%.2f%n" , totalPayAmount);
		System.out.println("**********************************************");
	}
	public float getInterestRate() {
		return interestRate;
	}
	public float getTotalPayAmount() {
		return totalPayAmount;
	}
}
