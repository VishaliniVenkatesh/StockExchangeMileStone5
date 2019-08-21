package com.demo.SpringMVCBoot.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.demo.SpringMVCBoot.dao.StockExchangeDao;
import com.demo.SpringMVCBoot.model.StockExchange;

@Service
public class StockExchangeServiceImpl implements StockExchangeService{

	@Autowired
	private StockExchangeDao stockDao;
	
	@Override
	public StockExchange insertStock(StockExchange stockExchange) throws SQLException {

		int stockExchangeId=5;
		stockExchange.setStockExchangeId(stockExchangeId);
		return stockDao.save(stockExchange);
	}

	@Override
	public List<StockExchange> getStockList() throws SQLException {
		
		return stockDao.findAll();
	}

}
