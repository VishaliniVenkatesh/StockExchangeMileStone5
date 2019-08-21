package com.demo.SpringMVCBoot.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.demo.SpringMVCBoot.model.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
}
