package com.el.ally.invoicify;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.el.ally.invoicify.Repositories.BillingRecordRepository;
import com.el.ally.invoicify.controllers.BillingRecordController;
import com.el.ally.invoicify.models.BillingRecord;
import com.el.ally.invoicify.models.FlatFeeBillingRecord;

public class BillingRecordControllerTests {
	  private BillingRecordController controller;

	    @Mock
	    private BillingRecordRepository billingRecordRepo;

	    @Before
	    public void setUp() {
	        MockitoAnnotations.initMocks(this);
	        controller = new BillingRecordController(billingRecordRepo);
	    }

	    @Test
	    public void getAll_BillingRecords() {
	        // Arrange
	        ArrayList<BillingRecord> billingRecords = new ArrayList<BillingRecord>();
	        when(billingRecordRepo.findAll()).thenReturn(billingRecords);

	        // Act
	        List<BillingRecord> actual = controller.getAll();

	        // Assert
	        assertThat(actual).hasSize(billingRecords.size());
	        verify(billingRecordRepo).findAll();
	    }

	    @Test
	    public void getOne_billingRecord() {
	        // Arrange
	        BillingRecord billingRecord = new FlatFeeBillingRecord();
	        when(billingRecordRepo.findOne(1)).thenReturn(billingRecord);

	        // Act
	        BillingRecord actual = controller.getOne(1);

	        // Assert
	        assertThat(actual).isSameAs(billingRecord);
	        verify(billingRecordRepo).findOne((int) 1);
	    }

	    @Test
	    public void create_billingRecord_and_return_it() {
	        // Arrange
	        BillingRecord billingRecord = new FlatFeeBillingRecord();
	        when(billingRecordRepo.save(billingRecord)).thenReturn(billingRecord);

	        // Act
	        BillingRecord actual = controller.create(billingRecord);

	        // Assert
	        assertThat(actual).isSameAs(billingRecord);
	        verify(billingRecordRepo).save(billingRecord);
	    }
}