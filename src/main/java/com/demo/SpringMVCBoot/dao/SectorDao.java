package com.demo.SpringMVCBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringMVCBoot.model.Sectors;

public interface SectorDao extends JpaRepository<Sectors,Integer>{

	public Sectors findBySectorName(String name);
	
}
