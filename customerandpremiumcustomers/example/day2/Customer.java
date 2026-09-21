package com.inheritance.customerandpremiumcustomers.example.day2;

public class Customer {
	
	protected String customerId,customerName;
	protected long customerPhoneNumber;
	
	public Customer() { // default constructor
	}
	
	public Customer(String customerId,String customerName,long customerPhoneNumber) {
		setCustomerId(customerId);
		setCustomerName(customerName);
		setCustomerPhoneNumber(customerPhoneNumber);
	}

	public void setCustomerPhoneNumber(long customerPhoneNumber) {
		if (customerPhoneNumber<=0) {
			System.out.println("Phone Numer neither zero nor negative ");
			return;
		}
		this.customerPhoneNumber=customerPhoneNumber;
	}

	public void setCustomerName(String customerName) {
		if (customerName==null  || customerName.isEmpty() ) {
			System.out.println("Customer Name neither Empty nor Null ");
			return;
		}	
		this.customerName=customerName;
		
	}

	public void setCustomerId(String customerId) {
		if (customerId==null  || customerId.isEmpty() ) {
			System.out.println("Customer Id neither Empty nor Null ");
			return;
		}	
		this.customerId=customerId;
	}
	
	public void customerDisplayDetails() {
		System.out.println("\n\nCustomer Id :- " + customerId);
		System.out.println("Customer Name :- "+ customerName);
		System.out.println("Customer Phone Number :- " + customerPhoneNumber);
	}
	
	public String getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public long getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
}
