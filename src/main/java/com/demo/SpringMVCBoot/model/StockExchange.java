package com.demo.SpringMVCBoot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="stock_exchange")
public class StockExchange {
	@Id
	@GeneratedValue
	@Column(name="stock_exchange_id")
	private int stockExchangeId;
	@NotEmpty(message="Please enter Stock Exchange Name")
	@Column(name="stock_exchange_name")
	private String stockExchangeName;
	@Column(name="brief")
	private String brief;
	@NotEmpty(message="Please enter Contact adrress")
	@Column(name="contact_address")
	private String contactAddress;
	@Column(name="remarks")
	private String remarks;
	public StockExchange()
	{
		
	}
	public StockExchange(int stockExchangeId, String stockExchangeName, String brief, String contactAddress,
			String remarks) {
		super();
		this.stockExchangeId = stockExchangeId;
		this.stockExchangeName = stockExchangeName;
		this.brief = brief;
		this.contactAddress = contactAddress;
		this.remarks = remarks;
	}
	public int getStockExchangeId() {
		return stockExchangeId;
	}
	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}
	public String getStockExchangeName() {
		return stockExchangeName;
	}
	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
