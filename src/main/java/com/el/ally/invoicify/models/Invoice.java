package com.el.ally.invoicify.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="invoice")
public class Invoice {
	
	//constructor
	public Invoice() {
		
	}
	
	@Id
	@GeneratedValue(generator = "invoice_seq_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name="invoice_seq_id", sequenceName="invoice_seq_id")
	@Column()
	private int id;
	
	@ManyToOne
	private Company company;
	
	@Column()
	private Date createdOn;
	
	@Column()
	private String invoiceDescription;
	
	@OneToMany(mappedBy="invoice", cascade=CascadeType.ALL)
	private List<InvoiceLineItem> lineItems;
	
	
	
	// getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getInvoiceDescription() {
		return invoiceDescription;
	}
	public void setInvoiceDescription(String invoiceDescription) {
		this.invoiceDescription = invoiceDescription;
	}
	public List<InvoiceLineItem> getLineItems() {
		return lineItems;
	}
	public void setLineItems(List<InvoiceLineItem> lineItems) {
		this.lineItems = lineItems;
	}
	
	
}
