package com.el.ally.invoicify;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.el.ally.invoicify.Repositories.BillingRecordRepository;
import com.el.ally.invoicify.Repositories.CompanyRepository;
import com.el.ally.invoicify.controllers.FlatFeeBillingRecordController;
import com.el.ally.invoicify.controllers.RateBasedBillingRecordController;
import com.el.ally.invoicify.models.Company;
import com.el.ally.invoicify.models.FlatFeeBillingRecord;
import com.el.ally.invoicify.models.RateBasedBillingRecord;

import junit.framework.Assert;

public class FlatFeeBillingRecordControllerTest {

	//create method creates a FlatFeeBillingRecord for a company and returns the new record
	@Test
	public void createMethod_createFlatFeeBillingRecord_returnRecord() {
		//Arrange
				BillingRecordRepository billingRecords = mock(BillingRecordRepository.class);
				CompanyRepository companies = mock(CompanyRepository.class);
				FlatFeeBillingRecord record = new FlatFeeBillingRecord();
				Company company = new Company();
				when(companies.findOne(1)).thenReturn(company);
				when(billingRecords.save(record)).thenReturn(record);
				FlatFeeBillingRecordController controller = new FlatFeeBillingRecordController(billingRecords, companies);
				//Act
				FlatFeeBillingRecord actual = controller.create(record, 1);
				record.setCompany(company);
				FlatFeeBillingRecord expected = record;
				
				//Assert
				Assert.assertEquals(expected, actual);
		
	}

}
