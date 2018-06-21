package com.el.ally.invoicify.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.el.ally.invoicify.Repositories.BillingRecordRepository;
import com.el.ally.invoicify.models.FlatFeeBillingRecord;

@Controller
@RequestMapping
public class FlatFeeBillingRecordController {
	
	@Autowired
	private BillingRecordRepository billingRecordRepository;
	
	@PostMapping("")
	public FlatFeeBillingRecord create (@RequestBody FlatFeeBillingRecord flatFee) {
		FlatFeeBillingRecord newRecord = billingRecordRepository.save(flatFee);
		 return newRecord;
}
	
	
}
