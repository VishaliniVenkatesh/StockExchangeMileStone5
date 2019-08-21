package com.demo.SpringMVCBoot.model;


import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="company")
public class Company {
	
	@Id
	@GeneratedValue
	@Column(name="company_code")
	private int companyCode;
	
	@NotEmpty(message="please enter Company Name")
	@Column(name="company_name")
	private String companyName;
	@Column(name="turnover")
	private BigDecimal turnover;
	@NotEmpty(message="please enter CEO")
	@Column(name="ceo")
	private String ceo;
	@NotEmpty(message="please enter Board of directors")
	@Column(name="board_of_directors")
	private String boardOfDirectors;
//	private List<StockExchange> stockExchanges;
	//@ManyToOne
	//@JoinColumn(name="sector_id")
//	private Sectors sector;
	@Column(name="sector_id")
	private int sector;
	@NotEmpty(message="please enter remarks")
	@Column(name="brief_writeup")
	private String briefWriteup;
	@Column(name="stock_code")
	private int stockCode;
	
	
	public Company()
	{
		
	}
	public Company(int companyCode,String companyName, BigDecimal turnover, String ceo, String boardOfDirectors,
		int sector, String briefWriteup, int stockCode) {
		super();
		this.companyCode=companyCode;
		this.companyName = companyName;
		this.turnover = turnover;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		//this.stockExchanges = stockExchanges;
		this.sector = sector;
		this.briefWriteup = briefWriteup;
		this.stockCode = stockCode;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public BigDecimal getTurnover() {
		return turnover;
	}
	public void setTurnover(BigDecimal turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	/*public List<StockExchange> getStockExchanges() {
		return stockExchanges;
	}
	public void setStockExchanges(List<StockExchange> stockExchanges) {
		this.stockExchanges = stockExchanges;
	}
	*/
	public int getSector() {
		return sector;
	}
	public void setSector(int sector) {
		this.sector = sector;
	}
	public String getBriefWriteup() {
		return briefWriteup;
	}
	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}
	public int getStockCode() {
		return stockCode;
	}
	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
	
	
	public String toString() {
		return "Company [companyCode=" + companyCode + ", companyName=" + companyName + ", turnover=" + turnover
				+ ", ceo=" + ceo + ", boardOfDirectors=" + boardOfDirectors 
				+ ", sector=" + sector + ", briefWriteup=" + briefWriteup + ", stockCode=" + stockCode + "]";
	}
	public void add(Company company) {
		// TODO Auto-generated method stub
		
	}
	
}
