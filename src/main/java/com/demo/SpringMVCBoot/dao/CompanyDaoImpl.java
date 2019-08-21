package com.demo.SpringMVCBoot.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.SpringMVCBoot.model.Company;


/*
@Repository("dao1")
public class CompanyDaoImpl {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insertCompany(Company company) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_db","root","root");
			ps=con.prepareStatement("insert into company(company_name,turnover,ceo,board_of_directors,sector_id,brief_writeup,stock_code) values(?,?,?,?,?,?,? )");
			ps.setString(1,company.getCompanyName());
			ps.setDouble(2, company.getTurnover());
			ps.setString(3, company.getCeo());
			ps.setString(4,company.getBoardOfDirectors());
			int sectorId=1;
			int stockCode=20;
			ps.setInt(5, sectorId);
			ps.setString(6, company.getBriefWriteup());
			ps.setInt(7, stockCode);
			result=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;	
	}
	
private List<Company> company=new ArrayList<Company>();
	
	public CompanyDaoImpl(){
		Company e1=new Company();
		
		company.add(e1);
	}
	
	
	

	

	public List<Company> getCompanyDetails() {
		// TODO Auto-generated method stub
		return company;
	}






	public List<Company> getCompanyList() throws SQLException {
		Connection con=null;
	    PreparedStatement ps=null;
	    List<Company> companylist= new ArrayList<Company>();
	    Company company=null;  
	    try {	
	    	Class.forName("com.mysql.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_db","root","root");
		    ps=con.prepareStatement("select * from company");
		    ResultSet rs=ps.executeQuery();

		    while(rs.next())
		    {
		    
		    	company = new Company();
		    	company.setCompanyCode(rs.getInt("company_code"));
		    	company.setCompanyName(rs.getString("company_name"));
		    	company.setTurnover(rs.getDouble("turnover"));
		    	company.setCeo(rs.getString("ceo"));
		    	company.setBoardOfDirectors(rs.getString("board_of_directors"));
		    	company.setSector(rs.getInt("sector_id"));
		    	company.setBriefWriteup(rs.getString("brief_writeup"));
		    	company.setStockCode(rs.getInt("stock_code"));
		    	companylist.add(company);

		    }
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	    	
		return companylist;
	}

}*/
//
//	public Company insertCompany(Company company) {
//		company.add(company);
//		return company;
//	}




//	public Company getCompanyById(int id) {
//		return company.get(1);
//	}
//	
//}
