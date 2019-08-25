package com.demo.SpringMVCBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.demo.SpringMVCBoot.model.Company;
import com.demo.SpringMVCBoot.model.Sectors;
import com.demo.SpringMVCBoot.model.StockPrice;
import com.demo.SpringMVCBoot.service.CompanyDetailService;
import com.demo.SpringMVCBoot.service.SectorService;
import com.demo.SpringMVCBoot.service.StockPriceService;


@RestController
public class StockPriceControllerImpl {
	@Autowired
	private StockPriceService stockPriceService;
	
	@Autowired
	private SectorService sectorService;
	@Autowired
	private CompanyDetailService companyService;
	@RequestMapping(path="/displayStockPriceList")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("stockPriceList");
		mv.addObject("stockPriceList",stockPriceService.getStockPriceList());
		return mv;
	}
	
	@GetMapping("stockPrice/{companyname}")
	public List<StockPrice> getStockPriceDetails(@PathVariable String companyname) {
		
		Company company=companyService.findBycompanyName(companyname);
		int stockPrice=company.getCompanyCode();
		return stockPriceService.findBycompanyCode(stockPrice);
	}

	
	@PostMapping("/upload")
	public List<StockPrice> upload(@RequestParam("file") MultipartFile file) throws Exception {
		return stockPriceService.upload(file);
	}
	
	@GetMapping("stockPriceList/{sectorName}")
	public List<StockPrice> getStockPriceList(@PathVariable String sectorName) {
		
		
		Sectors sectorId=sectorService.findBySectorName(sectorName);
		int sector=sectorId.getSectorId();
		List<Company> company=companyService.findbySectorId(sector);
		List<StockPrice> stockPriceList=new ArrayList<>();
		for(Company company_code:company)
		{
			int companyCode=company_code.getCompanyCode();
			stockPriceList.addAll(stockPriceService.findBycompanyCode(companyCode));
		}
		return stockPriceList;
	}


}
