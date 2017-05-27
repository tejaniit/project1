package com.eshop.controller;

import javax.persistence.metamodel.StaticMetamodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.RegisterDao;
import com.eshop.model.UserCredentials;
import com.eshop.model.UserDetails;

@Controller
public class RegisterController {
	@Autowired
    RegisterDao rd;
	
	@RequestMapping("/reg")
	public ModelAndView reg()
	{
		UserDetails u=new UserDetails();
		 return new ModelAndView("register", "UserDetails", u); 
	}

	@RequestMapping("/home")
	public String hm()
	{
	return "index1";
	}
	
	
	
	@RequestMapping("/register")
	public ModelAndView regist(@ModelAttribute("UserDetails")UserDetails u)
	{
	rd.insertUser(u);
		 return new ModelAndView("regsuccess", "user", u); 
	}
	
	
	 @RequestMapping(value="/register",method=RequestMethod.POST)
		ModelAndView reg2(@ModelAttribute("UserDetails") UserDetails u)
		{
		
		  ModelAndView mv=new ModelAndView("login","data","welcome to project");
		  
		  UserCredentials uc=new UserCredentials();
		  uc.setUsername(u.getUsername());
		  uc.setPassword(u.getPassword());
		  uc.setRole("ROLE_USER");
		  uc.setEnabled(true);
		  rd.insertUserCredentials(uc);
		  rd.insertUser(u);
		  
		  return mv;
		}
	  
}
