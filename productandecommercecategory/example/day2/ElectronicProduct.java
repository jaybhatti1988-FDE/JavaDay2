package com.inheritance.productandecommercecategory.example.day2;

public class ElectronicProduct extends Product {
	
	private int warrantyPeriods;
	private long quantity;
	private float totalPrice;
	private String brandName;
	
	public ElectronicProduct() {
		super();
	}

	public ElectronicProduct(String productId,String productName,float price,long quantity,String brandName,int warrantyPeriods) {
		super(productId, productName, price);
		setQuantity(quantity);
		setBrandName(brandName);
		setWarrantyPeriods(warrantyPeriods);
		CalculateTotalPrice(0);
	}
	
	public void setQuantity(long quantity) {
		if (quantity<=0) {
			System.out.println("ProductQuantity neither zero nor negative ");
			return;
		}
		
		this.quantity=quantity;
	}

	public void setBrandName(String brandName) {
		if (brandName==null  || brandName.isEmpty() ) {
			System.out.println("Product Brand Name neither Empty nor Null ");
			return;
		}
		this.brandName=brandName;
	}

	public void setWarrantyPeriods(int warrantyPeriods) {
		if (warrantyPeriods<=0) {
			System.out.println("Product Warranty Periods neither zero nor negative ");
			return;
		}
		this.warrantyPeriods=warrantyPeriods;
	}
	
	public void CalculateTotalPrice(float totalPrice) {
		this.totalPrice=this.quantity*this.price;
	}
	
	@Override
	public void EcommerceProductDetails() {
		super.EcommerceProductDetails();
		System.out.println("Product Quantity :- "+ quantity);
		System.out.println("Product Brand Name :- "+ brandName);
		System.out.println("Product Warranty Periods :-  " + warrantyPeriods + " years ");
		System.out.printf("Total Amount Payable :- ₹%.2f%n", this.totalPrice);
		System.out.println("**********************************************");
	}
	
	public long getQuantity() {
		return quantity;
	}

	public int getWarrantyPeriods() {
		return warrantyPeriods;
	}

	public String getBrandName() {
		return brandName;
	}

	public float getTotalPrice() {
		return totalPrice;
	}
	
	
	
}
