package com.demo.SpringMVCBoot.service;

import java.sql.SQLException;
import java.util.List;
import com.demo.SpringMVCBoot.model.Company;

public interface CompanyDetailService {

	public Company insertCompany(Company company) throws SQLException;
	public List<Company> getCompanyList() throws SQLException;
	public List<Company> findbySectorId(int sectorIdObj);
	public List<String> getCompanyByName(String name);
	public Company findBycompanyName(String name);
	
	
	
	
	
}
