package com.eshop.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CatDao;
import com.eshop.dao.ProdDao;
import com.eshop.dao.SupDao;
import com.eshop.model.CategoryDetails;
import com.eshop.model.ProductDetails;
import com.eshop.model.SupplierDetails;
@Controller
public class ProductController {
	@Autowired
	CatDao cc;
	@Autowired
	SupDao sd;
	@Autowired
	 ProdDao pd;
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public ModelAndView getProd()
	{
		ProductDetails p=new ProductDetails();
		List l=cc.retriveCategory();
		List l1=sd.retriveSupplier();
		List l2=pd.retriveProd();
		ModelAndView mv=new ModelAndView("product","ProductDetails",p);
		mv.addObject("SupData", l1);
		mv.addObject("CatData", l);
		mv.addObject("Prodata", l2);
		mv.addObject("bname", "ADD Product");
		return mv;
	}
	
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public ModelAndView postProd(@ModelAttribute("ProductDetails") ProductDetails p)
	{
		pd.insertprod(p);
		ProductDetails p1=new ProductDetails();
		List l=cc.retriveCategory();
		List l1=sd.retriveSupplier();
		List l2=pd.retriveProd();
		
		ModelAndView mv=new ModelAndView("product","ProductDetails",p1);
		mv.addObject("SupData", l1);
		mv.addObject("CatData", l);
		mv.addObject("Prodata",l2);
		
		String path="E:\\webproject\\ekart\\src\\main\\webapp\\resources\\images\\";
		path=path+String.valueOf(p.getProductId())+".jpg";
		MultipartFile file=p.getPimage();
		File f=new File(path);
		try {
			FileOutputStream fos=new FileOutputStream(f);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			byte[] bt=file.getBytes();
			bos.write(bt);
			
			bos.close();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mv.addObject("bname", "ADD Product");
		
		return mv;
	}
	@RequestMapping("/deladprod")
	public  ModelAndView deletepd(@RequestParam("adpid")int pid)
	{
		System.out.println(pid);
	pd.deletproduct(pid);
	ProductDetails p1=new ProductDetails();
	List l=cc.retriveCategory();
	List l1=sd.retriveSupplier();
	List l2=pd.retriveProd();
	
	ModelAndView mv=new ModelAndView("product","ProductDetails",p1);
	mv.addObject("SupData", l1);
	mv.addObject("CatData", l);
	mv.addObject("Prodata",l2);
	mv.addObject("bname", "ADD Product");
	return mv;
	}
	
	@RequestMapping("/deladprod1")
	public  ModelAndView editpd(@RequestParam("adpid1")int pid)
	{
		
		ProductDetails p1= pd.editproduct(pid);
	
	List l=cc.retriveCategory();
	List l1=sd.retriveSupplier();
	List l2=pd.retriveProd();
	
	ModelAndView mv=new ModelAndView("product","ProductDetails",p1);
	mv.addObject("SupData", l1);
	mv.addObject("CatData", l);
	mv.addObject("Prodata",l2);
	mv.addObject("bname", "Update Product");
	return mv;
	}
	
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public ModelAndView getProd1()
	{
		ProductDetails p=new ProductDetails();
		List l=cc.retriveCategory();
		List l1=sd.retriveSupplier();
		List l2=pd.retriveProd();
		ModelAndView mv=new ModelAndView("prohm","ProductDetails",p);
		mv.addObject("SupData", l1);
		mv.addObject("CatData", l);
		mv.addObject("Prodata", l2);
		return mv;
	}
	

	@RequestMapping(value="/getimg",method=RequestMethod.GET)
	public ModelAndView getImaage(@RequestParam("gimg")int pid)
	{
		ProductDetails p=pd.editproduct(pid);
		List l=new ArrayList();
		l.add(p);
		ModelAndView mv=new ModelAndView("single","ProductDetails",l);
		return mv;
	}
}

