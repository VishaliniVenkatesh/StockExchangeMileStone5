package com.demo.SpringMVCBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.demo.SpringMVCBoot.model.StockExchange;

public interface StockExchangeDao extends JpaRepository<StockExchange, Integer>{

}
