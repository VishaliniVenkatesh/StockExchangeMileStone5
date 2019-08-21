package com.demo.SpringMVCBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringMVCBoot.dao.StockPriceDao;
import com.demo.SpringMVCBoot.model.StockPrice;
//import com.example.stockspring.dao.StockDao;

@Service
public class StockPriceServiceImpl implements StockPriceService{

	
	@Autowired
	private StockPriceDao stockPriceDao;
	
	@Override
	public List<StockPrice> getStockPriceList() {
		// TODO Auto-generated method stub
		return stockPriceDao.findAll();
	}

	@Override
	public StockPrice insertStock(StockPrice stockPrice) {
		return stockPriceDao.save(stockPrice);
		
	}

}
