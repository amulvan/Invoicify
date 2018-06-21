package com.el.ally.invoicify;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import com.el.ally.invoicify.Repositories.CompanyRepository;
import com.el.ally.invoicify.controllers.FlatFeeBillingRecordController;
import com.el.ally.invoicify.models.Company;
import com.el.ally.invoicify.models.FlatFeeBillingRecord;

import junit.framework.Assert;

public class FlatFeeBillingRecordControllerTest {

	//create method creates a FlatFeeBillingRecord for a company and returns the new record
	@Test
	public void createMethod_createFlatFeeBillingRecord_returnRecord() {
		//Arrange
		FlatFeeBillingRecordController flatFeeController = new FlatFeeBillingRecordController();
		FlatFeeBillingRecord expected = new FlatFeeBillingRecord();
		
		//Act
		FlatFeeBillingRecord actual = flatFeeController.create();
		//assert
		Assert.assertEquals(expected, actual);
		
	}

}
