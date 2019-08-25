package com.demo.SpringMVCBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.demo.SpringMVCBoot.model.Company;
import com.demo.SpringMVCBoot.model.Sectors;
import com.demo.SpringMVCBoot.service.CompanyDetailService;
import com.demo.SpringMVCBoot.service.SectorService;

@RestController
public class SectorControllerImpl implements SectorController{

	
	@Autowired
	private SectorService sectorService;
	
	@Autowired
	private CompanyDetailService companyService;
	
	
	@GetMapping("sectorlist/{name}")
	public List<Company> FindBySectorName(@PathVariable String name) {
		
		Sectors sectorId=sectorService.findBySectorName(name);
		int sectorIdObj=sectorId.getSectorId();
		return companyService.findbySectorId(sectorIdObj);
	}
	
	@GetMapping("companylist/{name}")
	public List<String> FindByCompanyName(@PathVariable("name") String name) {
		return companyService.getCompanyByName(name);
	}

	
}
