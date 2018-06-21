package com.el.ally.invoicify.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.el.ally.invoicify.Repositories.BillingRecordRepository;
import com.el.ally.invoicify.Repositories.CompanyRepository;
import com.el.ally.invoicify.models.Company;
import com.el.ally.invoicify.models.RateBasedBillingRecord;

@RestController
@RequestMapping("/controllers/billing-record/rate-based")
public class RateBasedBillingRecordController {
	
	private BillingRecordRepository billingRecordRepo;
	private CompanyRepository companyRepo;
	
	public RateBasedBillingRecordController() {};
	
	public RateBasedBillingRecordController(BillingRecordRepository billingRecordRepo, CompanyRepository companyRepo) {
		this.billingRecordRepo = billingRecordRepo;
		this.companyRepo = companyRepo;
	}
	
	@PostMapping
	public RateBasedBillingRecord create(@RequestBody RateBasedBillingRecord rateBasedBillingRecord, int companyId) {
		Company company = companyRepo.getOne(companyId);
		rateBasedBillingRecord.setCompany(company);
		rateBasedBillingRecord = billingRecordRepo.save(rateBasedBillingRecord);
		// TODO Auto-generated method stub
		return rateBasedBillingRecord;
	}

}
