package com.demo.SpringMVCBoot.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.SpringMVCBoot.model.User;

@Service
public interface UserDetailService {
	public User registerUser(User user) throws SQLException;
	public List<User> userLogin();
	
	
}
