package com.demo.SpringMVCBoot.service;

import java.util.List;

import com.demo.SpringMVCBoot.model.StockPrice;

public interface StockPriceService {


	public List<StockPrice> getStockPriceList();

	public StockPrice insertStock(StockPrice stockPrice);

}
