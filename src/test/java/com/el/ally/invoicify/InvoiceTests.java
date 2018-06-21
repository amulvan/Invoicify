package com.el.ally.invoicify;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.el.ally.invoicify.Repositories.InvoiceRepository;
import com.el.ally.invoicify.controllers.InvoiceController;
import com.el.ally.invoicify.models.Invoice;

public class InvoiceTests {
	 private InvoiceController controller;

	    @Mock
	    private InvoiceRepository invoiceRepo;

	    @Before
	    public void setUp() {
	        MockitoAnnotations.initMocks(this);
	        InvoiceController controller = new InvoiceController();
	    }

	    @Test
	    public void getAll_Invoices() {
	        // Arrange
	        ArrayList<Invoice> actors = new ArrayList<Invoice>();
	        when(invoiceRepo.findAll()).thenReturn(actors);

	        // Act
	        List<Invoice> actual = controller.getAll();

	        // Assert
	        assertThat(actual).hasSize(actors.size());
	        verify(invoiceRepo).findAll();
	    }

	    @Test
	    public void getOne_invoice() {
	        // Arrange
	        Invoice invoice = new Invoice();
	        when(invoiceRepo.findOne((int) 1L)).thenReturn(invoice);

	        // Act
	        Invoice actual = controller.getOne(1L);

	        // Assert
	        assertThat(actual).isSameAs(invoice);
	        verify(invoiceRepo).findOne(1L);
	    }

	    @Test
	    public void create_invoice_and_return_it() {
	        // Arrange
	        Invoice invoice = new Invoice();
	        when(invoiceRepo.save(invoice)).thenReturn(invoice);

	        // Act
	        Invoice actual = controller.create(invoice);

	        // Assert
	        assertThat(actual).isSameAs(invoice);
	        verify(invoiceRepo).save(invoice);
	    }
}
