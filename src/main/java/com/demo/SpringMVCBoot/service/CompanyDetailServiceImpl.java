package com.demo.SpringMVCBoot.service;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringMVCBoot.dao.CompanyDao;
import com.demo.SpringMVCBoot.model.Company;

@Service
public class CompanyDetailServiceImpl implements CompanyDetailService {

	@Autowired
	private CompanyDao companyDetailsDao;
	@Override
	public Company insertCompany(Company company) throws SQLException {	
		return companyDetailsDao.save(company);
	}
	
	@Override
	public List<Company> getCompanyList() throws SQLException {
		
		return companyDetailsDao.findAll();
	}

	@Override
	public List<Company> findbySectorId(int sectorId) {
		return companyDetailsDao.findBySector(sectorId);
	}

	public List<String> getCompanyByName(String name) {
        List<String> companyDetails = companyDetailsDao.findAllByCompanyName(name);
        return companyDetails;
       }

	@Override
	public Company findBycompanyName(String name) {
		return companyDetailsDao.findByCompanyName(name);
	}

}
