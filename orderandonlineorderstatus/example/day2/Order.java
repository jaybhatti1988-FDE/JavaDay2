package com.inheritance.orderandonlineorderstatus.example.day2;

public class Order {
	
	protected String orderId,orderDate;
		
	public Order() {
		
	}
	
	public Order(String orderId,String orderDate) {
		setOrderId(orderId);
		setOrderDate(orderDate);
		
	}
	
	public void setOrderId(String orderId) {
		if (orderId==null  || orderId.isEmpty() ) {
			System.out.println("Order Id neither Empty nor Null ");
			return;
		}	
		this.orderId=orderId;
	}


	public void setOrderDate(String orderDate) {
		if (orderDate==null  || orderDate.isEmpty() ) {
			System.out.println("Order Date neither zero nor negative ");
			return;
		}	
		this.orderDate=orderDate;
	}
	
	public void EcommerceProductDetails() {
		System.out.println("**********************************************");
		System.out.println("\n\nProduct Id :- " + orderId);
		System.out.println("Product Name :- "+ orderDate);
	}

	public String getOrderId() {
		return orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}
	

}
