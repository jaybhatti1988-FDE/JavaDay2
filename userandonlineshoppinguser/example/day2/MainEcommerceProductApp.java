package com.inheritance.userandonlineshoppinguser.example.day2;

import java.util.Scanner;

public class MainEcommerceProductApp {

	public static void main(String[] args) {

		Scanner scanProduct=new Scanner(System.in);
		
		System.out.print("Enter Product Id ");
		String productId=scanProduct.nextLine();

		System.out.print("Enter Product Name :- ");
		String prdName=scanProduct.nextLine();
				
		System.out.print("Enter Product Price :- ");
		float prdPrice=scanProduct.nextFloat();
		scanProduct.nextLine();
		
		System.out.print("Enter Product Quantity :- ");
		int prdqty=scanProduct.nextInt();
		scanProduct.nextLine();
				
		System.out.print("Enter Product Brand Name :- ");
		String prdBrndName=scanProduct.nextLine();
		
		System.out.print("Enter Product Warranty Periods :- ");
		int prdwrtyPriods=scanProduct.nextInt();
		scanProduct.nextLine();
		
		ElectronicProduct eprodct=new ElectronicProduct(productId, prdName, prdPrice,prdqty,prdBrndName,prdwrtyPriods);
		eprodct.EcommerceProductDetails();
		scanProduct.close();
	}

}
