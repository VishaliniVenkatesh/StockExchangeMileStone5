package com.demo.SpringMVCBoot.controller;

import java.sql.SQLException;
import org.springframework.web.servlet.ModelAndView;

import com.demo.SpringMVCBoot.model.Company;


public interface CompanyRegistrationController {
	 public Company insertCompany(Company company) throws SQLException;
	 public ModelAndView getCompanyList() throws Exception;

}
