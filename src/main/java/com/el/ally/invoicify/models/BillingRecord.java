package com.el.ally.invoicify.models;

import java.util.Date;

public abstract class BillingRecord {
	int id;
	Date createdOn;
	String description;
	InvoiceLineItem lineItem;
	Company company;
	
	public double getTotal() {
		return -1;
	}
}
