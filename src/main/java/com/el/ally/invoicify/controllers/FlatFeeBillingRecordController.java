package com.el.ally.invoicify.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.el.ally.invoicify.Repositories.BillingRecordRepository;
import com.el.ally.invoicify.Repositories.CompanyRepository;
import com.el.ally.invoicify.models.Company;
import com.el.ally.invoicify.models.FlatFeeBillingRecord;

@Controller
@RequestMapping
public class FlatFeeBillingRecordController {
	
	private BillingRecordRepository billingRecordRepository;
	private CompanyRepository companyRepository;
	
	public FlatFeeBillingRecordController() {};
	
	public FlatFeeBillingRecordController(BillingRecordRepository billingRecordRepository, CompanyRepository companyRepository) {
		this.billingRecordRepository = billingRecordRepository;
		this.companyRepository = companyRepository;
	}
	
	@PostMapping("")
	public FlatFeeBillingRecord create (@RequestBody FlatFeeBillingRecord flatFee, int companyId) {
		Company company = companyRepository.getOne(companyId);
		flatFee.setCompany(company);
		billingRecordRepository.save(flatFee);
		 return flatFee;
}
	
	
}
