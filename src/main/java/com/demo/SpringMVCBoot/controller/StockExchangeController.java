package com.demo.SpringMVCBoot.controller;

import java.sql.SQLException;

import org.springframework.web.servlet.ModelAndView;

import com.demo.SpringMVCBoot.model.StockExchange;

public interface StockExchangeController {
	
	 public StockExchange insertStock(StockExchange stockExchange) throws SQLException;
	 public ModelAndView getStockList() throws Exception;
}
