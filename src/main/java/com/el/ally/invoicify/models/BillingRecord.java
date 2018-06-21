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

@Entity
@Table(name="BillingRecord")
public abstract class BillingRecord {
	
	// constructor
	public BillingRecord() {
		
	}

	@Id
	@GeneratedValue(generator = "billingrecord_seq_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name="billingrecord_seq_id", sequenceName="billingrecord_seq_id")
	@Column()
	private int id;
	
	@Column()
	private Date createdOn;
	
	@Column()
	private String description;
	
	@OneToOne(mappedBy="billingRecord")
	private InvoiceLineItem lineItem;
	
	@ManyToOne
	private Company company;
	
	// get total
	public double getTotal() {
		return -1;
	}
	/// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public InvoiceLineItem getLineItem() {
		return lineItem;
	}

	public void setLineItem(InvoiceLineItem lineItem) {
		this.lineItem = lineItem;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	
}
