package com.inheritance.insurancepolicy.example.day2;

public class InsurancePolicy {
	
	protected String policyNumber,policyHolderName;
	protected float policyAmount;
	
	public InsurancePolicy() { // default constructor
		
	}

	// parameterized Constructor
	
	public InsurancePolicy(String policyNumber,String policyHolderName,float policyAmount){
		setPolicyNumber(policyNumber);
		setPolicyHolderName(policyHolderName);
		setPolicyAmount(policyAmount);
	}

	public void setPolicyAmount(float policyAmount) {
		if (policyAmount<=0) {
			System.out.println("Policy Amount neither zero nor negative ");
		return;
		}
		this.policyAmount=policyAmount;
	}

	public void setPolicyHolderName(String policyHolderName) {
		if (policyHolderName==null  ||policyHolderName.isEmpty() ) {
			System.out.println("Policy Holder Name neither Empty nor Null ");
			return;
		}
		this.policyHolderName = policyHolderName;
	}

	public void setPolicyNumber(String policyNumber) {
		
		if (policyNumber==null  ||policyNumber.isEmpty() ) {
			System.out.println("Policy Number neither Empty nor Null ");
			return;
	}
		this.policyNumber=policyNumber;
	}
	
	public void InsurancePolicyDetailsDisplay() {
		System.out.println("\n\nPolicy Id :- " + policyNumber);
		System.out.println("Policy Holder Name :- " + policyHolderName);
		System.out.printf("Policy Amount  :- ₹%.2f%n", policyAmount);
	}

	public String getPolicynumber() {
		return policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public float getPolicyAmount() {
		return policyAmount;
	}	
}
