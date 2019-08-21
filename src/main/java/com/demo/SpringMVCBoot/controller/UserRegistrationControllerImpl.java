package com.demo.SpringMVCBoot.controller;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.demo.SpringMVCBoot.model.User;
import com.demo.SpringMVCBoot.service.UserDetailService;

@Controller
public class UserRegistrationControllerImpl implements UserRegistrationController{

	@Autowired
	private UserDetailService userDetailService;
	
	@RequestMapping(path = "/addUser", method = RequestMethod.GET)
	public String getLoginForm(ModelMap model) {
		System.out.println("Add New User");
		User u=new User();
		
		model.addAttribute("user", u);
		return "signupForm";		
	}

	@RequestMapping(path = "/addUser", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("user") @Valid User user, 
			BindingResult result, Model model) throws SQLException {
		System.out.println(user);
		
		if(result.hasErrors()){
			return "signupForm";
		}
		
		userDetailService.registerUser(user);
		return "userList";
}
}
