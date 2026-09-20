package com.inheritance.insurancepolicy.example.day2;

public class HealthInsurance extends InsurancePolicy {
	
	private float hositalCoverage,policyLimit,totalClaimedAmount;

	public HealthInsurance() {
		super();
	}
	
	public HealthInsurance(String policyNumber,String policyHolderName,float policyAmount,float policyLimit, float hositalCoverage) {
		super(policyNumber, policyHolderName, policyAmount);
		setHospitalCoverage(hositalCoverage);
		setPolicyLimit(policyLimit);
	}

	public void setPolicyLimit(float policyLimit) {
		if (policyLimit<=0) {
			System.out.println("Policy Limit neither zero nor negative ");
		return;
		}
		this.policyLimit=policyLimit;
	}

	public void setHospitalCoverage(float hositalCoverage) {
		if (hositalCoverage<=0) {
			System.out.println("Policy Hosital Coverage neither zero nor negative ");
		return;
		}
		this.hositalCoverage=hositalCoverage;
	}
	
	public void calculateTotalClaimAmount() {
		this.totalClaimedAmount=this.policyLimit-this.hositalCoverage;
	}
	
	@Override
	public void InsurancePolicyDetailsDisplay() {
		super.InsurancePolicyDetailsDisplay();
		System.out.printf("Hospital Coverage :- ₹%.2f%n" , hositalCoverage);
		System.out.printf("Policy Limit :-  ₹%.2f%n" , policyLimit);
		System.out.printf("Total Claimed Amount    :-  ₹%.2f%n", totalClaimedAmount);
		System.out.println("**********************************************");
	}

	public float getHositalCoverage() {
		return hositalCoverage;
	}

	public float getPolicyLimit() {
		return policyLimit;
	}

	public float getTotalClaimedAmount() {
		return totalClaimedAmount;
	}
	
}
