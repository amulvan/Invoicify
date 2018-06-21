package com.el.ally.invoicify.models;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="company")
public class Company {
	
	// constructor
	public Company() {
		
	}
	@Id
	@GeneratedValue(generator = "company_id_seq", strategy =GenerationType.AUTO)
	@SequenceGenerator(name = "company_id_seq", sequenceName="company_id_seq")
	@Column()
	private int id; 
	
	@Column()
	private String name; 
	
	
	@OneToMany(mappedBy="company")
	private List<Invoice> invoices;
	
	
	
	
	// getters & setters.
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Invoice> getInvoices() {
		return invoices;
	}
	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}
	
}
