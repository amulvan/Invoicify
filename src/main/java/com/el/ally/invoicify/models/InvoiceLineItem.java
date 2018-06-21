package com.el.ally.invoicify.models;

import java.util.Date;

public class InvoiceLineItem {
	int id;
	BillingRecord billingRecord;
	Date createdOn;
	Invoice invoice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BillingRecord getBillingRecord() {
		return billingRecord;
	}
	public void setBillingRecord(BillingRecord billingRecord) {
		this.billingRecord = billingRecord;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
}
