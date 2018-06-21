package com.el.ally.invoicify.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.el.ally.invoicify.Repositories.CompanyRepository;
import com.el.ally.invoicify.models.Company;
@RestController
@RequestMapping("controllers")
public class CompanyController {

	CompanyRepository companyRepo;
	public CompanyController() {
		// TODO Auto-generated constructor stub
	}
	
	public CompanyController(CompanyRepository companyRepo) 
	{
		this.companyRepo = companyRepo;
	}
	
	@GetMapping({"id"})
	public Company getCompany(@PathVariable int id) 
	{
		Company company = companyRepo.getOne(id);
		return company;
	}
	
	@GetMapping("/")
	public List<Company> getAll()
	{
		List<Company> Company = companyRepo.findAll();
		return Company;
	}
	
	@PutMapping({"id"})	
	public Company updateCompany (@PathVariable int id, @RequestBody Company company) 
	{
	company.setId(id);
	Company updatedCompany = companyRepo.save(company);
	return updatedCompany;	
	}
	
	@DeleteMapping({"id"})
	public Company deleteCompany(@PathVariable int id)
	{
		Company company = companyRepo.findOne(id);
		companyRepo.delete(company);
		return company;
	}
	
}
