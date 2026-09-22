package com.inheritance.orderandonlineorderstatus.example.day2;

public class OnlineOrders extends Order {
	
	private String paymentStatus,deliveryStatus;
	
	public OnlineOrders() {
		super();
	}

	public OnlineOrders(String orderId,String orderDate,String paymentStatus,String deliveryStatus) {
		super(orderId, orderDate);
		setPaymentStatus(paymentStatus);
		setDeliveryStatus(deliveryStatus);
	}
	
	public void setPaymentStatus(String paymentStatus) {
		if (paymentStatus==null  || paymentStatus.isEmpty() ) {
			System.out.println("Order Payment Status neither Empty nor Null ");
			return;
		}
		this.paymentStatus=paymentStatus;
	}
	
	public void setDeliveryStatus(String deliveryStatus) {
		if (deliveryStatus==null  || deliveryStatus.isEmpty() ) {
			System.out.println("order Delivery Status neither Empty nor Null ");
			return;
		}
		this.deliveryStatus=deliveryStatus;
	}

	
	@Override
	public void EcommerceProductDetails() {
		super.EcommerceProductDetails();
		System.out.println("Order Payment Status :- " + paymentStatus);
		System.out.println("Order Delivery Status :- " + deliveryStatus);
		System.out.println("**********************************************");
	}
	
	
	
	
	
}
