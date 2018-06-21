package com.el.ally.invoicify.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.el.ally.invoicify.Repositories.InvoiceRepository;
import com.el.ally.invoicify.models.Invoice;

@Controller
@RequestMapping("/")
public class InvoiceController {

	public InvoiceController(InvoiceRepository invoiceRepo) {
		// TODO Auto-generated constructor stub
	}

	public List<Invoice> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Invoice create(Invoice invoice) {
		// TODO Auto-generated method stub
		return null;
	}

	public Invoice getOne(long l) {
		// TODO Auto-generated method stub
		return null;
	}


}
