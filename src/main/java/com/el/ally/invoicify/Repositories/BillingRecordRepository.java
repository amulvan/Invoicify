package com.el.ally.invoicify.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.el.ally.invoicify.models.BillingRecord;

public interface BillingRecordRepository extends JpaRepository<BillingRecord, Integer> {
	List<BillingRecord> findByIdIn(long[] recordIds);
}

