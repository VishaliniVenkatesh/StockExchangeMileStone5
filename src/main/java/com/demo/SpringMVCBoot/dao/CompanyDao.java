package com.demo.SpringMVCBoot.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.demo.SpringMVCBoot.model.Company;

public interface CompanyDao extends JpaRepository<Company, Integer>{

	public List<Company> findBySector(int sectorid);
	@Query(value="SELECT company_name FROM Company  Where company_name LIKE :name% ", nativeQuery=true)
    List<String> findAllByCompanyName(@Param("name") String name);
	public Company findByCompanyName(String name);
	public List<Company> findAllByCompanyCode(int id);

	
    

	
}
