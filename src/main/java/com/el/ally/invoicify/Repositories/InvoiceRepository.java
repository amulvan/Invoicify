package com.el.ally.invoicify.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.el.ally.invoicify.models.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

	Invoice findOne(int l);



	

}
