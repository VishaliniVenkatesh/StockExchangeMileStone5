package com.demo.SpringMVCBoot.controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.demo.SpringMVCBoot.model.User;

public interface UserRegistrationController {
	public String getLoginForm(ModelMap model);
	public String userLogin(@ModelAttribute("user") User user,Model model);
}
