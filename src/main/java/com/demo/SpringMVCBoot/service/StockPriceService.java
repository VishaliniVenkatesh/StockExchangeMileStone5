package com.demo.SpringMVCBoot.service;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import com.demo.SpringMVCBoot.model.StockPrice;

public interface StockPriceService {

	public List<StockPrice> getStockPriceList();

	public StockPrice insertStock(StockPrice stockPrice);

	public List<StockPrice> findBycompanyCode(int stockPrice);

	public List<StockPrice> upload(MultipartFile file) throws Exception ;


}
