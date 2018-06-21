package com.el.ally.invoicify.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.el.ally.invoicify.Repositories.BillingRecordRepository;
import com.el.ally.invoicify.models.BillingRecord;

@Controller
@RequestMapping("/")
public class BillingRecordController {

	public BillingRecordController(BillingRecordRepository billingRecordRepo) {
		// TODO Auto-generated constructor stub
	}

	public List<BillingRecord> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public BillingRecord create(BillingRecord billingRecord) {
		// TODO Auto-generated method stub
		return null;
	}

	public BillingRecord getOne(int i) {
		// TODO Auto-generated method stub
		return null;
	}


}
