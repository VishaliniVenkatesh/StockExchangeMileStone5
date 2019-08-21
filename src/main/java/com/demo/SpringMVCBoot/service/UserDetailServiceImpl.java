package com.demo.SpringMVCBoot.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringMVCBoot.dao.UserDao;
import com.demo.SpringMVCBoot.model.User;

@Service
public class UserDetailServiceImpl implements UserDetailService{

	@Autowired
	private UserDao userDetailsDao;
	
	@Override
	public User registerUser(User user) throws SQLException {
		
		return userDetailsDao.save(user);
		
		
	}

}
