package com.el.ally.invoicify.models;

public class RateBasedBillingRecord extends BillingRecord {
	double rate;
	double quantity;
	
	public double getTotal() {
		return rate*quantity;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
}
