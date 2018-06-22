package com.el.ally.invoicify.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

@Entity
@Table(name="invoicelineitem")
public class InvoiceLineItem {
	
	// constructor
	public InvoiceLineItem() {
		
	}
	@Id
	@GeneratedValue(generator = "invoiceLineItem_id_seq", strategy=GenerationType.AUTO)
	@SequenceGenerator(name="invoiceLineItem_id_seq", sequenceName="invoiceLineItem_id_seq")
	@Column
	private int id;
	
	@OneToOne
	private BillingRecord billingRecord;
	
	@Column()
	private Date createdOn;
	
	@ManyToOne
	Invoice invoice;
	
	@ManyToOne
	private User createdBy;
	
	// getters and setters
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
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	
	
}
