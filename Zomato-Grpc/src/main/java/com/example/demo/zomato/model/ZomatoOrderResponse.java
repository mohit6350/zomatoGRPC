package com.example.demo.zomato.model;

import com.example.demo.zomato.util.ZomatoBill;

public class ZomatoOrderResponse {

	private double totalAmount;
	private String generatedDate;
	private double tax;
	private double amount;
	private double discount;
	private double packagingCharges;
	private double deliveryCharges;
	private String confirmation;
	private String assignedDeliverPerson;

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public String getAssignedDeliverPerson() {
		return assignedDeliverPerson;
	}

	public void setAssignedDeliverPerson(String assignedDeliverPerson) {
		this.assignedDeliverPerson = assignedDeliverPerson;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public ZomatoOrderResponse setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
		return this;
	}

	public String getGeneratedDate() {
		return generatedDate;
	}

	public ZomatoOrderResponse setGeneratedDate(String generatedDate) {
		this.generatedDate = generatedDate;
		return this;
	}

	public double getTax() {
		return tax;
	}

	public ZomatoOrderResponse setTax(double tax) {
		this.tax = tax;
		return this;
	}

	public double getAmount() {
		return amount;
	}

	public ZomatoOrderResponse setAmount(double amount) {
		this.amount = amount;
		return this;
	}

	public double getDiscount() {
		return discount;
	}

	public ZomatoOrderResponse setDiscount(double discount) {
		this.discount = discount;
		return this;
	}

	public double getPackagingCharges() {
		return packagingCharges;
	}

	public ZomatoOrderResponse setPackagingCharges(double packagingCharges) {
		this.packagingCharges = packagingCharges;
		return this;
	}

	public double getDeliveryCharges() {
		return deliveryCharges;
	}

	public ZomatoOrderResponse setDeliveryCharges(double deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
		return this;
	}

	@Override
	public String toString() {
		return "ZomatoOrderResponse [totalAmount=" + totalAmount + ", generatedDate=" + generatedDate + ", tax=" + tax
				+ ", amount=" + amount + ", discount=" + discount + ", packagingCharges=" + packagingCharges
				+ ", deliveryCharges=" + deliveryCharges + ", confirmation=" + confirmation + ", assignedDeliverPerson="
				+ assignedDeliverPerson + "]";
	}

}
