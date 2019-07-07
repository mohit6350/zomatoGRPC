package com.example.demo.zomato.util;

public class ZomatoBill {
	private double totalAmount;
	private String generatedDate;
	private double tax;
	private double amount;
	private double discount;
	private double packagingCharges;

	public double getTotalAmount() {
		return totalAmount;
	}

	public ZomatoBill setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
		return this;
	}

	public String getGeneratedDate() {
		return generatedDate;
	}

	public ZomatoBill setGeneratedDate(String generatedDate) {
		this.generatedDate = generatedDate;
		return this;
	}

	public double getTax() {
		return tax;
	}

	public ZomatoBill setTax(double tax) {
		this.tax = tax;
		return this;
	}

	public double getAmount() {
		return amount;
	}

	public ZomatoBill setAmount(double amount) {
		this.amount = amount;
		return this;
	}

	public double getDiscount() {
		return discount;
	}

	public ZomatoBill setDiscount(double discount) {
		this.discount = discount;
		return this;
	}

	public double getPackagingCharges() {
		return packagingCharges;
	}

	public ZomatoBill setPackagingCharges(double packagingCharges) {
		this.packagingCharges = packagingCharges;
		return this;
	}

	@Override
	public String toString() {
		return "ZomatoBill [totalAmount=" + totalAmount + ", generatedDate=" + generatedDate + ", tax=" + tax
				+ ", amount=" + amount + ", discount=" + discount + ", packagingCharges=" + packagingCharges + "]";
	}

}
