package com.inheritance.orderandonlineorderstatus.example.day2;

import java.util.Scanner;

public class MainEcommerceOnlineOrdersApp {

	public static void main(String[] args) {

		Scanner scanOrder=new Scanner(System.in);
		
		System.out.print("Enter Order Id ");
		String orderId=scanOrder.nextLine();

		System.out.print("Enter Order Date :- ");
		String orderDate=scanOrder.nextLine();
		
		System.out.println("Press P/p for Process or C/c for Cancelled or S/s for Success or e/e exit ");
		String payStatus="";
			while(true)
			{
				System.out.println("Your Payment Status (P/C/S/E)");
				String paymentStatus=scanOrder.nextLine().trim();
				
			if(paymentStatus.equalsIgnoreCase("P") || paymentStatus.equalsIgnoreCase("p")) {
				payStatus=" Process ";
					System.out.println(" Transaction in Process...! ");
					break;
				}
			
			else if(paymentStatus.equalsIgnoreCase("C") || paymentStatus.equalsIgnoreCase("c")) {
				payStatus=" Cancelled ";
				System.out.println(" Transaction is Cancelled...! ");
				scanOrder.close();
				return;
			}	

			else if(paymentStatus.equalsIgnoreCase("S") || paymentStatus.equalsIgnoreCase("c")) {
				payStatus=" Successful ";
				System.out.println(" Transaction is Successful...! ");
				break;
			}
			
			else if(paymentStatus.equalsIgnoreCase("E") || paymentStatus.equalsIgnoreCase("e")) {
				payStatus=" Exit ";
				System.out.println(" Exit from Transaction Process...! ");
				scanOrder.close();
				return;
			}	
			 else {
				  System.out.println("Please Press Valid button P/p , C/c, S/s, E/e ");
			  }
			}
			
			System.out.println("Press P/p for Process or C/c for Cancelled or S/s for Success or e/e exit ");
			String delvryStatus="";
				while(true){
					
					System.out.println("Your Delivery Status (P/C/S/E)");
					String deliveryStatus=scanOrder.nextLine().trim();
					
				if(deliveryStatus.equalsIgnoreCase("P") || deliveryStatus.equalsIgnoreCase("p")) {
					delvryStatus=" Process ";
						System.out.println(" Delivery in Process...! ");
						break;
					}
				else if(deliveryStatus.equalsIgnoreCase("S") || deliveryStatus.equalsIgnoreCase("c")) {
					delvryStatus=" Successful ";
					System.out.println(" Delivery is Successful...! ");
					break;
				}
				
				else if(deliveryStatus.equalsIgnoreCase("C") || deliveryStatus.equalsIgnoreCase("c")) {
					delvryStatus=" Cancelled ";
					System.out.println(" Delivery is Cancelled...! ");
					scanOrder.close();
					return;
				}	
				else if(deliveryStatus.equalsIgnoreCase("E") || deliveryStatus.equalsIgnoreCase("e")) {
					delvryStatus=" Exit ";
					System.out.println(" Exit from Delivery Process...! ");
					scanOrder.close();
					return;
				}	
				 else {
					  System.out.println("Please Press Valid button P/p , C/c, S/s, E/e ");
				  }
				}
		
		
		OnlineOrders ord=new OnlineOrders(orderId, orderDate, payStatus, delvryStatus);
		ord.EcommerceProductDetails();
		scanOrder.close();
	}

	
}
