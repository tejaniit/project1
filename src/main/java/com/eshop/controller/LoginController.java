package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.RegDao;
import com.eshop.model.UserCredentials;
import com.eshop.model.UserDetails;

@Controller
public class LoginController {

	
	@RequestMapping("/logn")
	public ModelAndView log()
	{
		UserCredentials u=new UserCredentials();
		 return new ModelAndView("login", "UserCredentials", u); 
	}
}
