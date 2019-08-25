package com.demo.SpringMVCBoot.service;

import java.sql.SQLException;
import java.util.List;

import com.demo.SpringMVCBoot.model.IPOPlanned;

public interface IPOPlannedService {

	List<IPOPlanned> findBycompanyCode(int ipoPlanned);
	public IPOPlanned insertIPO(IPOPlanned ipo) throws SQLException;
	public List<IPOPlanned> getIPOList() throws SQLException;

}
