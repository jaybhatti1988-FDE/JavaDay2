package com.inheritance.customerandpremiumcustomers.example.day2;

public class PremiumCustomer extends Customer {
	
	private String customerMembershipType;
	private float customerMembershipFees,discountPercentage;
	private double totalPayoutAmount;
	
	public PremiumCustomer() {
		super();
	}
	
	public PremiumCustomer(String customerId,String customerName,long customerPhoneNumber,String customerMembershipType,float customerMembershipFees,float discountPercentage) {
		super(customerId, customerName, customerPhoneNumber);
		setCustomerMembershipType(customerMembershipType);
		setCustomerMembershipFees(customerMembershipFees);
		setDiscountPercentage(discountPercentage);
		TotalPayoutAmount(0);
	}
	
	public void setCustomerMembershipType(String customerMembershipType) {
		
		if (customerMembershipType==null  || customerMembershipType.isEmpty() ) {
			System.out.println("Customer Membership type neither Empty nor Null ");
			return;
		}	
		this.customerMembershipType=customerMembershipType;
	}
	
	public void setCustomerMembershipFees(float customerMembershipFees) {
		if (customerMembershipFees<=0) {
			System.out.println("Discount neither zero nor negative ");
			return;
		}
		this.customerMembershipFees=customerMembershipFees;
	}

	public void setDiscountPercentage(float discountPercentage) {
		if (discountPercentage<=0) {
			System.out.println("Discount neither zero nor negative ");
			return;
		}
		this.discountPercentage=discountPercentage;
	}
	
	public void TotalPayoutAmount(double totalPayoutAmount) {
		this.totalPayoutAmount=(this.customerMembershipFees*this.discountPercentage)*12;
	}

	public void customerDisplayDetails() {
		super.customerDisplayDetails();
		System.out.println("Customer Membership Type " + customerMembershipType);
		System.out.printf("Customer Membership Fees ₹%.2f%n" , customerMembershipFees);
		System.out.printf("Customer Membership Discount %.2f%%%n" , discountPercentage);
		System.out.printf("Customer Membership Total Payment Fees ₹%.2f%n" , this.totalPayoutAmount);
	}

	public String getCustomerMembershipType() {
		return customerMembershipType;
	}

	public float getCustomerMembershipFees() {
		return customerMembershipFees;
	}

	public float getDiscountPercentage() {
		return discountPercentage;
	}

	public double getTotalPayoutAmount() {
		return totalPayoutAmount;
	}

}
