package com.inheritance.insurancepolicy.example.day2;

import java.util.Scanner;
public class MainHealthInsurancePolicyApp {

	public static void main(String[] args) {
		
		Scanner ScanPolicy=new Scanner(System.in);
		
		System.out.print(" Enter Policy Number :- ");
		String policyNo=ScanPolicy.nextLine();
		
		System.out.print(" Enter policy Holder Name :- ");
		String policyName=ScanPolicy.nextLine();
				
		System.out.print(" Enter Policy Amount :- ");
		float policyAmt=ScanPolicy.nextFloat();
		ScanPolicy.nextLine();
		
		System.out.print(" Enter  Policy Limit :- ");
		float policyLimit=ScanPolicy.nextFloat();
		ScanPolicy.nextLine();
		
		System.out.print(" Enter Hospital Coverage Amount :- ");
		float policyhospitalCovrge=ScanPolicy.nextFloat();
		ScanPolicy.nextLine();
		
		HealthInsurance hlthinsrnce=new HealthInsurance(policyNo, policyName, policyAmt,policyLimit,policyhospitalCovrge);
		hlthinsrnce.calculateTotalClaimAmount();
		hlthinsrnce.InsurancePolicyDetailsDisplay();
		
		ScanPolicy.close();
	}

}
