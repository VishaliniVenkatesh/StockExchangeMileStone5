package com.demo.SpringMVCBoot.controller;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.demo.SpringMVCBoot.model.StockExchange;
import com.demo.SpringMVCBoot.service.StockExchangeService;

@Controller
public class StockExchangeControllerImpl implements StockExchangeController{

	
	@Autowired
	private StockExchangeService stockService;
	
	public StockExchange insertStock(StockExchange stockExchange) throws SQLException {
		
		return stockService.insertStock(stockExchange);
	}

	@RequestMapping(path="/stockList")
	public ModelAndView getStockExchangesList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("stockList");
		mv.addObject("stockList",stockService.getStockExchangesList());
		return mv;
	}
	public static void main(String [] args) {
		StockExchangeController controller=new StockExchangeControllerImpl();
		try {
			System.out.println(controller.getStockExchangesList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@RequestMapping(value = "/addStock", method = RequestMethod.GET)
	public String addStockExchange(ModelMap model) {
		System.out.println("Add New Stock");
		StockExchange s=new StockExchange();
		
		model.addAttribute("stock", s);
		return "insertStock";		
	}
	@RequestMapping(value = "/addStock", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("stock") @Valid StockExchange stock, 
			BindingResult result, Model model) throws SQLException {
		System.out.println(stock);
		
		if(result.hasErrors()){
			System.out.println("error");
			return "insertStock";
		}
		
	stockService.insertStock(stock);
	
	return "success";
}
}
