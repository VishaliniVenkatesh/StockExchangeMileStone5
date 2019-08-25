package com.demo.SpringMVCBoot.service;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.SpringMVCBoot.dao.IPOPlannedDao;
import com.demo.SpringMVCBoot.model.IPOPlanned;

@Service
public class IPOPlannedServiceImpl implements IPOPlannedService{

	
	@Autowired
	IPOPlannedDao ipoDao;

	@Override
	public List<IPOPlanned> findBycompanyCode(int ipoPlanned) {
		return ipoDao.findBycompanyCode(ipoPlanned);
	}

	@Override
	public List<IPOPlanned> getIPOList() throws SQLException {
		return ipoDao.findAll();
	}

	@Override
	public IPOPlanned insertIPO(IPOPlanned ipo) throws SQLException {
		return ipoDao.save(ipo);
		}
}
