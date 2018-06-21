package com.el.ally.invoicify.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.el.ally.invoicify.Repositories.BillingRecordRepository;
import com.el.ally.invoicify.models.BillingRecord;

@RestController
@RequestMapping("/controllers/billing-record")
public class BillingRecordController {
	
	@Autowired
	private BillingRecordRepository billingRepository;

	public BillingRecordController(BillingRecordRepository billingRecordRepo) {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/")
	public List<BillingRecord> getAll() 
	{
		List<BillingRecord> BillingRecord = billingRepository.findAll();
		return BillingRecord;
	}

	@PostMapping("/")
	public BillingRecord create(BillingRecord billingRecord) {
		BillingRecord newBillingRecord = billingRepository.save(billingRecord);
		return newBillingRecord;
	}

	@GetMapping("/{i}")
	public BillingRecord getOne(@PathVariable int i) {
		BillingRecord billingRecord = (BillingRecord) billingRepository.findOne(i);
		return billingRecord; 
		
	}


}
