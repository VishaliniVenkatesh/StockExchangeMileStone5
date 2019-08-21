package com.demo.SpringMVCBoot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringMVCBoot.model.Company;
import com.demo.SpringMVCBoot.model.Sectors;
@RestController
public class IPOPlannedControllerImpl {

	
//	@GetMapping("ipolist/{name}")
//	public List<Company> getCompanyName(@PathVariable String name) {
//		
//		IPOPlanned ipo=sectorService.findBySectorName(name);
//		int sectorIdObj=sectorId.getSectorId();
//		return companyService.findbySectorId(sectorIdObj);
//	}
}
