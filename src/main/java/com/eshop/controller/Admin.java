package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.model.AdminDetails;

@Controller
public class Admin 
{
	
	@RequestMapping("/adm")
	public String adm()
	{
		return "adminHome";
		
	}
	
	@RequestMapping("/contact")
	public String contact()
	{
		return "Contact";
		
	}
	
	@RequestMapping("/abt")
	public String abt()
	{
		return "about";
		
	}

}