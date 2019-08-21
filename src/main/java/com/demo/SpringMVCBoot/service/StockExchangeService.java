package com.demo.SpringMVCBoot.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.demo.SpringMVCBoot.model.Company;
import com.demo.SpringMVCBoot.model.StockExchange;

public interface StockExchangeService {
	 public StockExchange insertStock(StockExchange stockExchange) throws SQLException;
	  //  public Company updateCompany(Company company);
		//public ModelAndView getStockList() throws Exception;
		public List<StockExchange> getStockList() throws SQLException;
}
