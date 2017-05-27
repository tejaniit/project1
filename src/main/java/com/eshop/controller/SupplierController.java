package com.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.SupplierDao;
import com.eshop.model.CategoryDetails;
import com.eshop.model.SupplierDetails;
@Controller
public class SupplierController {
@Autowired
SupplierDao sd;
	@RequestMapping("/sup")
	public ModelAndView adm()
	{
		SupplierDetails s=new SupplierDetails();
		List l1=sd.retriveSupplier();
		ModelAndView mv=new ModelAndView("supplier","SupplierDetails",s);
		mv.addObject("SupData", l1);
		mv.addObject("bname","Add supplier");
		return mv;
	}

	
	@RequestMapping("/supp")
	public ModelAndView adm1(@ModelAttribute("SupplierDetails")SupplierDetails s)
	{
		sd.insertSupplier(s);
		SupplierDetails s1=new SupplierDetails();
		List l1=sd.retriveSupplier();
		ModelAndView mv=new ModelAndView("supplier","SupplierDetails",s1);
		mv.addObject("SupData", l1);
		mv.addObject("bname","Add supplier");
		return mv;
	}
	@RequestMapping("/deladsup")
	public  ModelAndView deletesd(@RequestParam("adsid")int sid)
	{
		System.out.println(sid);
	sd.deletsupplier(sid);
	SupplierDetails s1=new SupplierDetails();
	List l1=sd.retriveSupplier();
	ModelAndView mv=new ModelAndView("supplier","SupplierDetails",s1);
	mv.addObject("SupData", l1);
	mv.addObject("bname","Add supplier");
	return mv;
	}
	
	@RequestMapping("/deladsup1")
	public  ModelAndView editsd(@RequestParam("adsid1")int sid)
	{
	sd.editsupplier(sid);
	SupplierDetails s1=sd.editsupplier(sid);
	List l1=sd.retriveSupplier();
	ModelAndView mv=new ModelAndView("supplier","SupplierDetails",s1);
	mv.addObject("SupData", l1);
	mv.addObject("bname","Update");
	return mv;
	}
}
