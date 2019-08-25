package com.demo.SpringMVCBoot.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringMVCBoot.model.StockPrice;

public interface StockPriceDao extends JpaRepository<StockPrice,Integer>{

	List<StockPrice> findBycompanyCode(int stockPrice);
	
}
