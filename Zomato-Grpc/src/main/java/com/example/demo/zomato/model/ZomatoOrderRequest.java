package com.example.demo.zomato.model;

public class ZomatoOrderRequest {

	private String userName;
	private String orderItem;
	private String address;
	private String TransactionDate;
	private float amount;

	public String getUserName() {
		return userName;
	}

	public ZomatoOrderRequest setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public String getOrderItem() {
		return orderItem;
	}

	public ZomatoOrderRequest setOrderItem(String orderItem) {
		this.orderItem = orderItem;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public ZomatoOrderRequest setAddress(String address) {
		this.address = address;
		return this;
	}

	public String getTransactionDate() {
		return TransactionDate;
	}

	public ZomatoOrderRequest setTransactionDate(String transactionDate) {
		TransactionDate = transactionDate;
		return this;
	}

	public double getAmount() {
		return amount;
	}

	public ZomatoOrderRequest setAmount(float amount) {
		this.amount = amount;
		return this;
	}

	@Override
	public String toString() {
		return "ZomatoOrderRequest [userName=" + userName + ", orderItem=" + orderItem + ", address=" + address
				+ ", TransactionDate=" + TransactionDate + ", amount=" + amount + "]";
	}

}
