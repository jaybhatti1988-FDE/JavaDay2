package com.inheritance.userandonlineshoppinguser.example.day2;

public class Product {
	
	protected String productId,productName;
	protected float price;
	
	public Product() {
		
	}
	
	public Product(String productId,String productName,float price) {
		setProductId(productId);
		setProductName(productName);
		setProductPrice(price);
	}
	
	public void setProductId(String productId) {
		if (productId==null  || productId.isEmpty() ) {
			System.out.println("Product Id neither Empty nor Null ");
			return;
		}	
		this.productId=productId;
	}

	public void setProductPrice(float price) {
		if (price<=0) {
			System.out.println("Product Price neither zero nor negative ");
			return;
		}
		this.price=price;
	}

	public void setProductName(String productName) {
		if (productName==null  || productName.isEmpty() ) {
			System.out.println("Product Name neither zero nor negative ");
			return;
		}	
		this.productName=productName;
	}
	
	public void EcommerceProductDetails() {
		System.out.println("\n\nProduct Id :- " + productId);
		System.out.println("Product Name :- "+ productName);
		System.out.printf("Product Price :- ₹%.2f%n" , price);
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public float getPrice() {
		return price;
	}

	
	
	

}
