package com.el.ally.invoicify;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.el.ally.invoicify.Repositories.BillingRecordRepository;
import com.el.ally.invoicify.Repositories.CompanyRepository;
import com.el.ally.invoicify.controllers.RateBasedBillingRecordController;
import com.el.ally.invoicify.models.Company;
import com.el.ally.invoicify.models.RateBasedBillingRecord;

import junit.framework.Assert;

public class RateBasedBillingRecordControllerTest {

	@Test
	public void createMethod_createRateBassedBillingRecord_returnsNewRecord() {
		//Arrange
		BillingRecordRepository billingRecords = mock(BillingRecordRepository.class);
		CompanyRepository companies = mock(CompanyRepository.class);
		RateBasedBillingRecord record = new RateBasedBillingRecord();
		Company company = new Company();
		when(companies.findOne(1)).thenReturn(company);
		when(billingRecords.save(record)).thenReturn(record);
		RateBasedBillingRecordController controller = new RateBasedBillingRecordController(billingRecords, companies);
		//Act
		RateBasedBillingRecord actual = controller.create(record, 1);
		record.setCompany(company);
		RateBasedBillingRecord expected = record;
		
		//Assert
		Assert.assertEquals(expected, actual);
	}

}
