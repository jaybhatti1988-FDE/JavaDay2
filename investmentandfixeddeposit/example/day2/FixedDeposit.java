package com.inheritance.investmentandfixeddeposit.example.day2;

public class FixedDeposit extends Investment {
	
	private float interestRate,maturityAmount;
	
	
	public FixedDeposit() {
		super();
	}
	
	public FixedDeposit(float investmentAmount,int duration,float interestRate) {
		super(investmentAmount, duration);
		setInterestRate(interestRate);
		setMaturityAmount(maturityAmount);
	}

	public void setInterestRate(float interestRate) {
		if(interestRate<=0) {
			System.out.println("Investment Rate should not be o or negative");
			return;
		}
		this.interestRate = interestRate;
	}

	public void setMaturityAmount(float maturityAmount) {
		
		this.maturityAmount = (this.investmentAmount*this.interestRate*this.duration)/100;
	}
	
	public void InvestmentFDDetails() {
		super.InvestmentFDDetails();
		System.out.println("Interested Rate : " + interestRate);
		System.out.println("Maturity Amount : " + this.maturityAmount);
	}

	public float getInterestRate() {
		return interestRate;
	}

	public float getMaturityAmount() {
		return maturityAmount;
	}
}
