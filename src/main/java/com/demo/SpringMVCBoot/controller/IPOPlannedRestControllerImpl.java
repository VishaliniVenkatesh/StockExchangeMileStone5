package com.demo.SpringMVCBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.demo.SpringMVCBoot.model.Company;
import com.demo.SpringMVCBoot.model.IPOPlanned;
import com.demo.SpringMVCBoot.service.CompanyDetailService;
import com.demo.SpringMVCBoot.service.IPOPlannedService;
@RestController
public class IPOPlannedRestControllerImpl {

	@Autowired
	CompanyDetailService companyService;
	@Autowired
	IPOPlannedService ipoService;
	
	@GetMapping("ipolist/{name}")
	public List<IPOPlanned> getCompanyName(@PathVariable String name) {
		
		Company company=companyService.findBycompanyName(name);
		int ipoPlanned=company.getCompanyCode();
		return ipoService.findBycompanyCode(ipoPlanned);
	}
	
	
	
}
