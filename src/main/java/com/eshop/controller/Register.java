package com.eshop.controller;

import javax.persistence.metamodel.StaticMetamodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.RegDao;
import com.eshop.model.UserDetails;

@Controller
public class Register {
	@Autowired
    RegDao rd;
	
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
	
}
