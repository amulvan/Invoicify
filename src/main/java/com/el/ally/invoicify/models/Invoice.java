package com.el.ally.invoicify.models;

import java.util.Date;
import java.util.List;

public class Invoice {
	int id;
	Company company;
	Date createdOn;
	String invoiceDescription;
	List<InvoiceLineItem> lineItems;
}
