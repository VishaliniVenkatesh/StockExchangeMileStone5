package com.demo.SpringMVCBoot.controller;

import java.sql.SQLException;
import java.util.List;
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
	
	int flag=0;
	
	@RequestMapping(path = "/addUser", method = RequestMethod.GET)
	public String getLoginForm(ModelMap model) {
		User u=new User();
		model.addAttribute("user", u);
		return "signupForm";		
	}
	
	@RequestMapping(path = "/addUser", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("user") @Valid User user, 
			BindingResult result, Model model) throws SQLException {
		if(result.hasErrors()){
			return "signupForm";
		}
		else
		{
			User result1=userDetailService.registerUser(user);
			if(result1!=null)
			{
				User u=new User();
				model.addAttribute("user", u);
				return "login";
			}
			else
			{
				return "error";
			}
		}
	}
	
	@RequestMapping(path = "/loginForm")
	public String login(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "login";		
	}
	
	 @RequestMapping(path="/login")
	    public String userLogin(@ModelAttribute("user") User user,Model model) {
		 	String username=user.getUsername();
	        String password=user.getPassword();
	        if(username.equals("Admin"))
	        {
	        	if(password.equals("admin123"))
	        	{
	        		return "adminLandingPage";
	        	}
	        	else
	        	{
	        		return "login";
	        	}
	        }
	        else
	        {
	        	List<User> users=userDetailService.userLogin();
	        	
	        	for(User userDetails:users)
	        	{
	        		if(username.equals(userDetails.getUsername()) && (password.equals(userDetails.getPassword()) ))
	        		{
	        			flag=1;
	        		}
	        	}
	        }
	        if(flag==1)
	        {
	        	return "userLandingPage";
	        }
	        else
	        {
	        	return "login";
	        }
	 }
	 
	 @RequestMapping(value = "/adminLandingPage", method = RequestMethod.GET)
	    public String welcome(Model model) {
	        return "adminLandingPage";
	    }
	
}

