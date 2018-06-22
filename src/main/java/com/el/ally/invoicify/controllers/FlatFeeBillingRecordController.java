package com.el.ally.invoicify.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.el.ally.invoicify.Repositories.BillingRecordRepository;
import com.el.ally.invoicify.Repositories.CompanyRepository;
import com.el.ally.invoicify.Repositories.UserRepository;
import com.el.ally.invoicify.models.Company;
import com.el.ally.invoicify.models.FlatFeeBillingRecord;
import com.el.ally.invoicify.models.User;

@Controller
@RequestMapping("api/billing-record/flat-fee")
public class FlatFeeBillingRecordController {
	
	private BillingRecordRepository billingRecordRepository;
	private CompanyRepository companyRepository;

	public FlatFeeBillingRecordController() {};
	
	public FlatFeeBillingRecordController(BillingRecordRepository billingRecordRepository, CompanyRepository companyRepository) {
		this.billingRecordRepository = billingRecordRepository;
		this.companyRepository = companyRepository;
	}
	
	@PostMapping("{clientId}")
	public FlatFeeBillingRecord create(@RequestBody FlatFeeBillingRecord record, @PathVariable int clientId, Authentication auth) {
		User user = (User) auth.getPrincipal();
		Company client = companyRepository.findOne(clientId);
		record.setCompany(client);
		record.setCreatedBy(user);;
		billingRecordRepository.save(record);

		return billingRecordRepository.save(record);
	}
	
	
}
