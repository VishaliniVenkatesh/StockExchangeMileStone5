package com.demo.SpringMVCBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringMVCBoot.model.IPOPlanned;


public interface IPOPlannedDao extends JpaRepository<IPOPlanned,Integer>{



	public List<IPOPlanned> findBycompanyCode(int ipoPlanned);

}
