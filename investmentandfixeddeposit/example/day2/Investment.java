package com.inheritance.investmentandfixeddeposit.example.day2;

public class Investment {
	
	protected float investmentAmount;
	protected int duration;
	
	public Investment() {
		
	}
	
	public Investment(float investmentAmount,int duration) {
		setInvestmentAmount(investmentAmount);
		setDuration(duration);
	}

	public void setInvestmentAmount(float investmentAmount) {
		if(investmentAmount<=0) {
			System.out.println("Investment Amount should not be o or negative");
			return;
		}
		this.investmentAmount = investmentAmount;
	}

	public void setDuration(int duration) {
		if(duration<=0) {
			System.out.println("Investment Amount Duration should not be o or negative");
			return;
		}
		this.duration = duration;
	}
	
	public void InvestmentFDDetails() {
		System.out.printf("\n\nInvestment Amount : ₹%.2f%n", investmentAmount);
		System.out.println("Investment Duration years : " + duration + "year");
	}
	public float getInvestmentAmount() {
		return investmentAmount;
	}
	public int getDuration() {
		return duration;
	}
}
