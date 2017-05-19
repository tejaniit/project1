package com.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CatDao;

import com.eshop.model.CategoryDetails;
import com.eshop.model.SupplierDetails;
@Controller
public class Category {
@Autowired
CatDao cc;
	@RequestMapping("/cat")
	public ModelAndView adm()
	{
		CategoryDetails c=new CategoryDetails();
		List l=cc.retriveCategory();
		ModelAndView mv=new ModelAndView("category","CategoryDetails",c);
		mv.addObject("CatData", l);
		return mv;
	}

	
	@RequestMapping("/cate")
	public ModelAndView adm1(@ModelAttribute("CategoryDetails")CategoryDetails c)
	{
	
		cc.insertCategory(c);
		
		CategoryDetails c1=new CategoryDetails();
		List l=cc.retriveCategory();
		ModelAndView mv=new ModelAndView("category","CategoryDetails",c1);
		mv.addObject("CatData", l);
		return mv;
	}
	
	@RequestMapping("/deladcat")
	public  ModelAndView deletesd(@RequestParam("adcid")int cid)
	{
		System.out.println(cid);
	cc.deletcategory(cid);
	CategoryDetails c1=new CategoryDetails();
	List l=cc.retriveCategory();
	ModelAndView mv=new ModelAndView("category","CategoryDetails",c1);
	mv.addObject("CatData", l);
	return mv;
}
}
