package com.inheritance.fde.additional.example.three;
import java.util.ArrayList;
import java.util.Scanner;
public class MainEmployeeCommissionApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		ArrayList<Invoice>invoice=new ArrayList<>();
		
		System.out.print("Enter Number of Customer Tax Details you want enter ?:- ");
		int customerNo=Integer.parseInt(scan.nextLine().trim());
		
		for (int idxCust = 0; idxCust < customerNo; idxCust++) {
			System.out.println("Details Number of Employee/s "+ (idxCust+1) + " ----\n ");
		
		
		Invoice inv=null;
		
		while (inv==null) {
			try {
				
				System.out.print("Enter Customer Name:- ");
				String custName=scan.nextLine();
				
				System.out.print("Enter Invoice Number:- ");
				long invoiceNumber=Long.parseLong(scan.nextLine().trim());
				
				System.out.print("Enter Total Amount:- ");
				double totalAmt=Double.parseDouble(scan.nextLine().trim());
				
				System.out.print("Enter Tax Rate:- ");
				double taxRate=Double.parseDouble(scan.nextLine().trim());
				
				inv=new TaxInvoice(custName, invoiceNumber, totalAmt, taxRate);
				
			} catch (NumberFormatException e) {
				System.out.println(" Invalid Number format Please Re-enter all Details. " );
			} catch (IllegalArgumentException e) {
				System.out.println(" Error:- "+ e.getMessage()+ " Please Re-enter all Details " );
			}
		}
		invoice.add(inv);
	   }	
		System.out.println("\n===== Customer Tax Invoice Summary Report =====\n");
		
		double invoicePay=0;
		
		for(Invoice i:invoice) {
			i.invoicesummary();
			invoicePay +=i.calculateTaxRate();
			System.out.println("-----------------------------------------------");	
     }
		System.out.printf("Total Number of "+ customerNo +" Customer Tax Rate is \t : ₹%.2f%n",invoicePay);
		scan.close();
	}
}
