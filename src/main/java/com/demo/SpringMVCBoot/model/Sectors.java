package com.demo.SpringMVCBoot.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.demo.SpringMVCBoot.model.Company;
@Entity
@Table(name="sectors")
public class Sectors {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int sectorId;
	@Column(name="sector_name")
	private String sectorName;
	@Column(name="brief")
	private String brief;
	//@OneToMany
	//private List<Company> companies;
	
	
	public Sectors()
	{
		
	}
	public Sectors(int sectorId, String sectorName, String brief) {
		super();
		this.sectorId = sectorId;
		this.sectorName = sectorName;
		this.brief = brief;
	}
	public int getSectorId() {
		return sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	@Override
	public String toString() {
		return "Sectors [sectorId=" + sectorId + ", sectorName=" + sectorName + ", brief=" + brief + "]";
	}
	
	
}
