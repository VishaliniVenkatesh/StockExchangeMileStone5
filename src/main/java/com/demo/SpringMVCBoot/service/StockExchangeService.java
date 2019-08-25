package com.demo.SpringMVCBoot.service;

import java.sql.SQLException;
import java.util.List;
import com.demo.SpringMVCBoot.model.StockExchange;

public interface StockExchangeService {
	public StockExchange insertStock(StockExchange stockExchange) throws SQLException;
	public List<StockExchange> getStockExchangesList() throws SQLException;
}
