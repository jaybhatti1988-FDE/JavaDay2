package com.inheritance.fde.additional.example.three;

public class TaxInvoice extends Invoice {
	private double taxRate;
	
	public TaxInvoice(String customerName,long invoiceNumber,double totalAmount,double taxRate) {
		super(customerName,invoiceNumber,totalAmount);
		this.taxRate=taxRate;
	}

	public void setTaxRate(double taxRate) {
		if (taxRate<0 || taxRate>100)
		{
			throw new IllegalArgumentException("Tax Rate Should between 0 to 100");
		}
		this.taxRate = taxRate;
	}
	
	public double getTaxRate() {
		return taxRate;
	}
	
	public double calculateTaxRate() {
		return this.totalAmount+((this.totalAmount*taxRate)/100);
	}
	
	@Override
	public void invoicesummary() {
		super.invoicesummary();
		System.out.printf("Tax Rate	            :- %.2f%%%n", taxRate);
		System.out.printf("Total Tax           :- ₹%.2f%n", calculateTaxRate());
	}
		
}
