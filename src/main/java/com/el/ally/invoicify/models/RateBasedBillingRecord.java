package com.el.ally.invoicify.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="rateBasedBillingRecord")
public class RateBasedBillingRecord extends BillingRecord {
	
	// constructor
	public RateBasedBillingRecord() {
		
	}
	
	@Column()
	private double rate;
	
	@Column()
	private double quantity;
	
	// get total methods / math for quantity
	
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
