package com.demo.SpringMVCBoot.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringMVCBoot.dao.SectorDao;

import com.demo.SpringMVCBoot.model.Sectors;


@Service
public class SectorServiceImpl implements SectorService{
	
	@Autowired
	private SectorDao sectorDao;

	@Override
	public List<Sectors> getSectorList() throws SQLException {
	// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sectors findBySectorName(String name) {
		// TODO Auto-generated method stub
		return sectorDao.findBySectorName(name);
	}
	
	
	

}
