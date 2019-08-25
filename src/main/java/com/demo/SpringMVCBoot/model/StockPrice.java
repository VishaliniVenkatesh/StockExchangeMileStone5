package com.demo.SpringMVCBoot.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="stock")
public class StockPrice {
	@Id
	@GeneratedValue
	private int stockId;
	private int companyCode;
	private String  stockExchangeId;
	private double currentPrice;
	private Date date;
	private Date time;
	public StockPrice()
	{
		
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public String getStockExchangeId() {
		return stockExchangeId;
	}
	public void setStockExchangeId(String stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
