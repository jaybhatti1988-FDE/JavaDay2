package com.inheritance.fde.additional.example.two;

public class CommissionEmployee extends Employee {
	
	private double salesAmount;
	private float commissionRate;
	
	public CommissionEmployee(String empID,String empName,String empDept,double basicSal,double salesAmount,float commissionRate ) {
		super(empID,empName,empDept,basicSal);
		this.salesAmount=salesAmount;
		this.commissionRate=commissionRate;
	}

	public void setSalesAmount(double salesAmount) {
		if (salesAmount<=0 )
		{
			throw new IllegalArgumentException("Sales Amount Should not Zero or Negative");
		}
		this.salesAmount = salesAmount;
	}

	public void setCommissionRate(float commissionRate) {
		if (commissionRate< 0 || commissionRate>100 )
		{
			throw new IllegalArgumentException("Commission Rate Should between 0 to 100");
		}
		this.commissionRate = commissionRate;
	}
	
	@Override
	public double netTotalPay() {
		return this.basciSal+(commissionRate*salesAmount)/100;
	}
	
	@Override
	public void EmpDisplayDetails() {
		super.EmpDisplayDetails();
		System.out.printf("Commision	    :- %.2f%%%n", commissionRate);
		System.out.printf("Sales Amount	    :- ₹%.2f%n", salesAmount);
		System.out.printf("Net Pay 	            :- ₹%.2f%n", netTotalPay());
	}

	public double getSalesAmount() {
		return salesAmount;
	}

	public float getCommissionRate() {
		return commissionRate;
	}
	
}
