package com.el.ally.invoicify.models;

public class RateBasedBillingRecord extends BillingRecord {
	double rate;
	double quantity;
	
	public double getTotal() {
		return rate*quantity;
	}
}
