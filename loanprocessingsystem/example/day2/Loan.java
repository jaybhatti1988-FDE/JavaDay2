package com.inheritance.loanprocessingsystem.example.day2;

public class Loan {
	
	protected String loanId;
	protected float loanAmount,loanTenure;
	
	public Loan() { 
 
	}

	// Parameterized constructor
	
	public Loan(String loanId,float loanAmount,float loanTenure) {
		setLoanId(loanId);
		setLoanAmount(loanAmount);
		setLoanTenure(loanTenure);
	}

	public void setLoanTenure(float loanTenure) {
		if (loanTenure<=0) {
			System.out.println("Loan Tenure neither zero nor negative ");
			return;
		}
		this.loanTenure=loanTenure;
	}

	public void setLoanAmount(float loanAmount) {
		if (loanAmount<=0) {
			System.out.println("Loan Amount neither zero nor negative ");
			return;
		}
		this.loanAmount=loanAmount;
		}

	public void setLoanId(String loanId) {
		if (loanId==null  || loanId.isEmpty() ) {
			System.out.println("Loan Id neither Empty nor Null ");
			return;
		}
		this.loanId=loanId;
	}
	
	public void LoanProcessBasicsPersonDetailsDisplay() {
		System.out.println("\n\nLoan Id :- " + loanId);
		System.out.printf("Loan Amount :-  %.2f%n" , loanAmount);
		System.out.printf("Loan Tenure Years  :- %.2f%n", loanTenure);
	}
	

	public String getLoanId() {
		return loanId;
	}

	public float getLoanAmount() {
		return loanAmount;
	}

	public float getLoanTenure() {
		return loanTenure;
	}


}
