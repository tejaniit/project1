 package com.eshop.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
public class product {
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
		
		/*Iterator i=l.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			CategoryDetails c2=(CategoryDetails)o;
			System.out.println(c2.getCategoryId());
			
		}*/
		
		
		
		
		List l1=sd.retriveSupplier();
		/*Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			Object o=i1.next();
			SupplierDetails s2=(SupplierDetails)o;
			System.out.println(s2.getSupplierId());
		}
		*/
		List l2=pd.retriveProd();
		ModelAndView mv=new ModelAndView("product","ProductDetails",p);
		mv.addObject("SupData", l1);
		mv.addObject("CatData", l);
		mv.addObject("Prodata", l2);
		
		return mv;
	}
	
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public ModelAndView postProd(@ModelAttribute("ProductDetails") ProductDetails p)
	{
		List l=cc.retriveCategory();
		List l1=sd.retriveSupplier();
		List l2=pd.retriveProd();
		ProductDetails p1=new ProductDetails();
		ModelAndView mv=new ModelAndView("product","ProductDetails",p1);
		mv.addObject("SupData", l1);
		mv.addObject("CatData", l);
		mv.addObject("Prodata",l2);
		pd.insertprod(p);
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
		
	
		
		return mv;
	}
	@RequestMapping("/deladprod")
	public  ModelAndView deletepd(@RequestParam("adpid")int pid)
	{
		System.out.println(pid);
	pd.deletproduct(pid);
	List l=cc.retriveCategory();
	List l1=sd.retriveSupplier();
	List l2=pd.retriveProd();
	ProductDetails p1=new ProductDetails();
	ModelAndView mv=new ModelAndView("product","ProductDetails",p1);
	mv.addObject("SupData", l1);
	mv.addObject("CatData", l);
	mv.addObject("Prodata",l2);
	return mv;
	}
	
}

