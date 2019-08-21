package com.demo.SpringMVCBoot.service;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.demo.SpringMVCBoot.model.Company;
import com.demo.SpringMVCBoot.model.Sectors;



public interface CompanyDetailService {

	public Company insertCompany(Company company) throws SQLException;
	public List<Company> getCompanyList() throws SQLException;
	public List<Company> findbySectorId(int sectorIdObj);
	public List<Company> getCompanyByName(String name);
	
}
