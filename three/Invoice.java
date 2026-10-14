package com.inheritance.fde.additional.example.three;

public class Invoice {
	
	protected String customerName;
	protected long invoiceNumber;
	protected double totalAmount;
	
	public Invoice() {
		
	}
	
	public Invoice(String customerName,long invoiceNumber,double totalAmount) {
		this.customerName=customerName;
		this.invoiceNumber=invoiceNumber;
		this.totalAmount=totalAmount;
	}

	public void setCustomerName(String customerName) {
		if (customerName==null || customerName.trim().isEmpty())
		{
			throw new IllegalArgumentException("Customer Name Should not Null or Empty");
		}
		this.customerName = customerName;
	}

	public void setInvoiceNumber(long invoiceNumber) {
		if (invoiceNumber<=0)
		{
			throw new IllegalArgumentException("Invoice Number Should not 0 or Negative");
		}
		this.invoiceNumber = invoiceNumber;
	}

	public void setTotalAmount(double totalAmount) {
		if (totalAmount<=0)
		{
			throw new IllegalArgumentException("Invoice Number Should not 0 or Negative");
		}
		this.totalAmount = totalAmount;
	}
	
	public void invoicesummary() {
		System.out.println("Customer Name	    :- " + customerName);
		System.out.println("Invoice Number 	    :- " + invoiceNumber);
		System.out.printf("Total Amount        :- ₹%.2f%n", totalAmount);
	}
	
	public double calculateTaxRate() {
		return 0.0;
	}

	public String getCustomerName() {
		return customerName;
	}

	public long getInvoiceNumber() {
		return invoiceNumber;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

}