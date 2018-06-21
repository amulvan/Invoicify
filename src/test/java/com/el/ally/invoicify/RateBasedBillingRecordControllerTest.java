package com.el.ally.invoicify;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.el.ally.invoicify.Repositories.BillingRecordRepository;
import com.el.ally.invoicify.Repositories.CompanyRepository;
import com.el.ally.invoicify.controllers.RateBasedBillingRecordController;
import com.el.ally.invoicify.models.RateBasedBillingRecord;

import junit.framework.Assert;

public class RateBasedBillingRecordControllerTest {
	//create method creates a RateBasedBillingRecord for a company and returns the new record
	RateBasedBillingRecordController controller;
	
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		CompanyRepository companyRepo;
		BillingRecordRepository billingRepo;
		controller = new RateBasedBillingRecordController(billingRepo, companyRepo);
	}
	@Test
	public void createMethod_createRateBassedBillingRecord_returnsNewRecord() {
		//Arrange
		RateBasedBillingRecord rateBasedBillingRecord = new RateBasedBillingRecord();
		
		int id = 0;
		//Act
		RateBasedBillingRecord actual = controller.create(rateBasedBillingRecord, id);
		rateBasedBillingRecord.setCompany(companyRepo.findOne(id));
		//Assert
		Assert.assertEquals(rateBasedBillingRecord, actual);
	}

}
