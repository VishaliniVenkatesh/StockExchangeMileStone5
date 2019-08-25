package com.demo.SpringMVCBoot.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class IPOPlanned {
	@Id
	@GeneratedValue
	private int id;
	private int companyCode;
	private int stock_exchange_id;
	private double price_per_share;
	private int totalNoOfShares;
	private String openDateTime;
	private String remarks;
	public IPOPlanned()
	{
		
	}
	public IPOPlanned(int id, int companyCode, int stock_exchange_id, double price_per_share, int totalNoOfShares,
			String openDateTime, String remarks) {
		super();
		this.id = id;
		this.companyCode = companyCode;
		this.stock_exchange_id = stock_exchange_id;
		this.price_per_share = price_per_share;
		this.totalNoOfShares = totalNoOfShares;
		this.openDateTime = openDateTime;
		this.remarks = remarks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public int getStock_exchange_id() {
		return stock_exchange_id;
	}
	public void setStock_exchange_id(int stock_exchange_id) {
		this.stock_exchange_id = stock_exchange_id;
	}
	public double getPrice_per_share() {
		return price_per_share;
	}
	public void setPrice_per_share(double price_per_share) {
		this.price_per_share = price_per_share;
	}
	public int getTotalNoOfShares() {
		return totalNoOfShares;
	}
	public void setTotalNoOfShares(int totalNoOfShares) {
		this.totalNoOfShares = totalNoOfShares;
	}
	public String getOpenDateTime() {
		return openDateTime;
	}
	public void setOpenDateTime(String openDateTime) {
		this.openDateTime = openDateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
