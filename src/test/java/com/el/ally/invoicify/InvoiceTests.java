package com.el.ally.invoicify;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.el.ally.invoicify.Repositories.BillingRecordRepository;
import com.el.ally.invoicify.Repositories.CompanyRepository;
import com.el.ally.invoicify.Repositories.InvoiceRepository;
import com.el.ally.invoicify.controllers.InvoiceController;
import com.el.ally.invoicify.models.Invoice;
import com.el.ally.invoicify.models.InvoiceView;

public class InvoiceTests {
	 private InvoiceController controller;

	    @Mock
	    private InvoiceRepository invoiceRepo;
	    
	    @Mock
	    private BillingRecordRepository billingRecordRepository;
	    
	    @Mock
	    private CompanyRepository companyRepository;

	    @Before
	    public void setUp() {
	        MockitoAnnotations.initMocks(this);
	        controller = new InvoiceController(invoiceRepo, billingRecordRepository, companyRepository);
	    }

	    @Test
	    public void getAll_Invoices() {
	        // Arrange
	        ArrayList<Invoice> invoices = new ArrayList<Invoice>();
	        when(invoiceRepo.findAll()).thenReturn(invoices);

	        // Act
	        List<Invoice> actual = controller.getInvoices();
	        // Assert
	        assertThat(actual).hasSize(invoices.size());
	        verify(invoiceRepo).findAll();
	    }

	    @Test
	    public void create_invoice_and_return_it() {
	        // Arrange
	        Invoice invoice = new Invoice();
	        invoice.setInvoiceDescription("description");
	        when(invoiceRepo.save(invoice)).thenReturn(invoice);

	        // Act
	        long[] powers = {0L, 2L, 4L};
	        InvoiceView invoiceView = new InvoiceView(invoice.getInvoiceDescription(), powers);
	        Invoice actual = controller.createInvoice(invoiceView, 2L);

	        // Assert
	        assertThat(invoice.getInvoiceDescription()).isSameAs(invoice.getInvoiceDescription());
	        verify(invoiceRepo).save(invoice);
	    }
}
