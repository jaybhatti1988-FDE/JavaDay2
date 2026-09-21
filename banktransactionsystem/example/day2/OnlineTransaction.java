package com.inheritance.banktransactionsystem.example.day2;

public class OnlineTransaction extends Transaction {
	
	private String paymentMode,transactionStatus;
	
	public OnlineTransaction(){
		super();
	}
	
	public OnlineTransaction(String transactionId,String date,double transactionAmount,String paymentMode, String transactionStatus ) {
			super(transactionId , date , transactionAmount);
			setPaymentMode(paymentMode);
			setTransactionStatus(transactionStatus);
	}
	
	public void setPaymentMode(String paymentMode) {
		if(paymentMode==null || paymentMode.isEmpty()) {
			System.out.println("Transaction Payment Mode should not be null or empty");
			return;
		}
		this.paymentMode=paymentMode;
	}
	
	public void setTransactionStatus(String transactionStatus) {
		if(transactionStatus==null || transactionStatus.isEmpty()) {
			System.out.println("Transaction Status should not be null or empty");
			return;
		}
		this.transactionStatus = transactionStatus;
		
	}
	@Override
	public void getTransactionPaymentDetailsdisplay() {
		super.getTransactionPaymentDetailsdisplay();
		System.out.println("Payment Mode : " + paymentMode);
		System.out.println("Payment Status : " + transactionStatus);
	}	

	public String getPaymentMode() {
		return paymentMode;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}
	
}
