package com.demo.SpringMVCBoot.controller;

import java.util.List;
import com.demo.SpringMVCBoot.model.StockPrice;

public interface StockPriceController {
	public List<StockPrice> getStockPriceList();
	public StockPrice insertStock(StockPrice stockPrice);
}
