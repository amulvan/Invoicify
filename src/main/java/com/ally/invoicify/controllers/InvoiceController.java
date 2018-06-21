package com.ally.invoicify.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.el.ally.invoicify.Repositories.InvoiceRepository;
import com.el.ally.invoicify.models.Invoice;





@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {

	

	@Autowired

	private InvoiceRepository invoiceRepository;

	public InvoiceController() {

	}
	 
	 
	 @GetMapping("/api/invoices")
		public List<Invoice> getInvoices() {
			List<Invoice> invoices = invoiceRepository.getAll();
			return invoices;
		}

}