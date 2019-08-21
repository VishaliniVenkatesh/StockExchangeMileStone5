package com.demo.SpringMVCBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.SpringMVCBoot.model.Company;


public interface CompanyDao extends JpaRepository<Company, Integer>{

	public List<Company> findBySector(int sectorid);
	@Query(value="SELECT * FROM Company c Where c.company_name LIKE %?% ", nativeQuery=true)
    List<Company> findAllByCompanyName(String name);

	

	
}
