package com.demo.SpringMVCBoot.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.SpringMVCBoot.model.Company;
import com.demo.SpringMVCBoot.model.StockExchange;
import com.demo.SpringMVCBoot.model.StockPrice;
//import com.demo.SpringMVCBoot.service.CompanyDetailService;
import com.demo.SpringMVCBoot.service.StockPriceService;


@Controller
public class StockPriceControllerImpl {
	@Autowired
	private StockPriceService stockPriceService;
	
	
//	@Autowired
//	private CompanyDetailService companyService;
//	
	@RequestMapping(path="/stockPriceList")
	public ModelAndView getCompanyList() throws Exception {
		//System.out.println("jiihhkhoh");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("stockPriceList");
		mv.addObject("stockPriceList",stockPriceService.getStockPriceList());
		return mv;
	}
	
	
@RequestMapping(path="/insertStockPrice",method = RequestMethod.GET)
	public String insert()
	{
		StockPrice stock=new StockPrice();
		stock.setCurrentPrice(4000);
		stock.setDate(new Date());
		stock.setStockId(2);
		
		StockExchange stockExchange=new StockExchange();
		stockExchange.setStockExchangeName("BSE");
		stockExchange.setContactAddress("Chennai");
		stockExchange.setRemarks("none");
		
		
		Company company=new Company();
		//company.setCompanyCode(1025);
		company.setCompanyName("zoho");
		company.setCeo("dfhg");
		company.setTurnover(new BigDecimal(74565.23d));
		company.setBoardOfDirectors("12");
		company.setBriefWriteup("asbc");
		
		
		
		stock.setCompany(company);
		stock.setStockExchange(stockExchange);
		
		System.out.println();
		try {
			//companyService.insertCompany(company);
			stockPriceService.insertStock(stock);
			List<StockPrice> stocks=stockPriceService.getStockPriceList();
			for(StockPrice stock1:stocks){
				System.out.println(stock1.getStockId());
				System.out.println(stock1.getCompany().getCompanyCode());
				System.out.println(stock1.getStockExchange().getStockExchangeName());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:companyList";
	}

/*
 @RequestMapping(value = "/addCompany", method = RequestMethod.GET)
	public String insert(ModelMap model) {
		System.out.println("Add New Stock Price");
		StockPrice stockPrice=new StockPrice();
		
		model.addAttribute("stockprice", stockPrice);
		Company company=new Company();
		company.setCompanyCode(1025);
		company.setCompanyName("cts");
		company.setTurnover(new BigDecimal(434.45d));
		stockPrice.setCompany(company);
		return "insertStockPrice";		
	} 	*/
}
