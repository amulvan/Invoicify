package com.el.ally.invoicify.models;

public class FlatFeeBillingRecord extends BillingRecord {
	private double amount;

	public double getTotal() {
		return amount;
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
