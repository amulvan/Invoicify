package com.el.ally.invoicify;

import static org.junit.Assert.*;

import org.junit.Test;

import com.el.ally.invoicify.controllers.RateBasedBillingRecordController;
import com.el.ally.invoicify.models.RateBasedBillingRecord;

import junit.framework.Assert;

public class RateBasedBillingRecordControllerTest {
	//create method creates a RateBasedBillingRecord for a company and returns the new record

	@Test
	public void createMethod_createRateBassedBillingRecord_returnsNewRecord() {
		//Arrange
		RateBasedBillingRecord rateBasedBillingRecord = new RateBasedBillingRecord();
		RateBasedBillingRecordController controller = new RateBasedBillingRecordController();
		
		//Act
		RateBasedBillingRecord actual = controller.create();
		//Assert
		Assert.assertEquals(rateBasedBillingRecord, actual);
	}

}
