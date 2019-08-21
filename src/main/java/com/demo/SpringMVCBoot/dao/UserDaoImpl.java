package com.demo.SpringMVCBoot.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.SpringMVCBoot.model.User;
/*
@Repository("dao")
public class UserDaoImpl implements UserDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int registerUser(User user) throws SQLException {
		 Connection con=null;
         PreparedStatement ps=null;
         int result=0;
         try {
        	 Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_db","root","root");
             ps=con.prepareStatement("insert into users(username,email,password,usertype,mobile_number,confirmed) values(?,?,?,?,?,1 )");
             
             ps.setString(1, user.getUsername());
             ps.setString(2, user.getEmail());
             ps.setString(3, user.getPassword());
             ps.setString(4, user.getConfirmPassword());
            
             ps.setLong(5,user.getMobileNumber());
           
             result=ps.executeUpdate();
                
         } catch (Exception e) {
                e.printStackTrace();
         }
         return result;      
}
}
*/