package com.el.ally.invoicify.models;

public class InvoiceView {
	String invoiceDescription;
	long[] recordIds;
	public InvoiceView(String invoiceDescription, long[] recordIds) {
		super();
		this.invoiceDescription = invoiceDescription;
		this.recordIds = recordIds;
	}
	public String getInvoiceDescription() {
		return invoiceDescription;
	}
	public void setInvoiceDescription(String invoiceDescription) {
		this.invoiceDescription = invoiceDescription;
	}
	public long[] getRecordIds() {
		return recordIds;
	}
	public void setRecordIds(long[] recordIds) {
		this.recordIds = recordIds;
	}
}
