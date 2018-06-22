package com.el.ally.invoicify.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class FlatFeeBillingRecord extends BillingRecord {
	
	// constructor
	public FlatFeeBillingRecord() {
		
	}

	@Column()
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
