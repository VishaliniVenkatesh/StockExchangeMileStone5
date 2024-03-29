package com.demo.SpringMVCBoot.service;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.SpringMVCBoot.dao.StockExchangeDao;
import com.demo.SpringMVCBoot.model.StockExchange;

@Service
public class StockExchangeServiceImpl implements StockExchangeService{

	@Autowired
	private StockExchangeDao stockDao;
	
	@Override
	public StockExchange insertStock(StockExchange stockExchange) throws SQLException {
		return stockDao.save(stockExchange);
	}

	@Override
	public List<StockExchange> getStockExchangesList() throws SQLException {
		return stockDao.findAll();
	}

}
