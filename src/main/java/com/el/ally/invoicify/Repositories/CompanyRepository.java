package com.el.ally.invoicify.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.el.ally.invoicify.models.Company;


public interface CompanyRepository extends JpaRepository<Company, Integer> {

	Company findOne(int clientId);

}


	

