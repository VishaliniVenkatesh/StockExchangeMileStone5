package com.demo.SpringMVCBoot.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.demo.SpringMVCBoot.model.Company;

@Entity
@Table(name="stock")
public class StockPrice {
	@Id
	@GeneratedValue
	private int stockId;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="company_code")
	private Company company;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="stock_exchange_id")
	private StockExchange stockExchange;
	
	private float currentPrice;
	private Date date;
	private Date time;
	public StockPrice()
	{
		
	}
	public StockPrice(int stockeId, float currentPrice, Date date, Date time) {
		super();
		
		this.stockId = stockId;
		this.currentPrice = currentPrice;
		this.date = date;
		this.time = time;
	}
	/*public int getStockCode() {
		return stockCode;
	}
	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public int getStockExchangeId() {
		return stockExchangeId;
	}
	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}*/
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public float getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(float currentPrice) {
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
	public void setCompany(Company company) {
		this.company = company;
		
	}
	public Company getCompany() {
		
		return company;
	}
	public void setStockExchange(StockExchange stockExchange) {
		this.stockExchange = stockExchange;
		
	}
	public StockExchange getStockExchange()
	{
		return stockExchange;
	}
}
