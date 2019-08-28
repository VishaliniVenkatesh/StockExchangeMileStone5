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
		return null;
	}

	@Override
	public Sectors findBySectorName(String name) {
		return sectorDao.findBySectorName(name);
	}
	
}
