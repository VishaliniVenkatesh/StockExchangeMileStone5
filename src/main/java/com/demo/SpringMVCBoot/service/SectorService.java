package com.demo.SpringMVCBoot.service;
//
import java.sql.SQLException;
import java.util.List;
//
import com.demo.SpringMVCBoot.model.Company;
import com.demo.SpringMVCBoot.model.Sectors;
//
public interface SectorService {
	public List<Sectors> getSectorList() throws SQLException;

	public Sectors findBySectorName(String name);

	

	
}
