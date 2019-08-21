package com.demo.SpringMVCBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringMVCBoot.model.StockPrice;

public interface StockPriceDao extends JpaRepository<StockPrice,Integer>{

}
