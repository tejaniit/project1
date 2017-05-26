 package com.eshop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CartDao;
import com.eshop.dao.CatDao;
import com.eshop.dao.ProdDao;
import com.eshop.dao.RegDao;
import com.eshop.dao.SupDao;
import com.eshop.model.CartDetails;
import com.eshop.model.ProductDetails;
import com.eshop.model.UserCredentials;

@Controller
public class CartController {
	@Autowired
	 ProdDao pd;
	@Autowired
	CartDao ca;
	@Autowired
	CatDao cc;
	@Autowired
	SupDao sd;
	@Autowired
	RegDao rd;
	
	@RequestMapping("/eladprod1")
	public ModelAndView addToCart(@RequestParam("dpid1")int id ,HttpSession session,Model model)
	{  
	ProductDetails p= pd.editproduct(id);
	CartDetails c= new CartDetails();
	String userid = SecurityContextHolder.getContext().getAuthentication().getName();
	UserCredentials  user = rd.getUser(userid); 
	System.out.println("cart");
	String n=(String) session.getAttribute(user.getUsername());
	c.setCartUser(n);
	System.out.println("cart");
	c.setProId(p.getProductId());
	c.setProName(p.getProductname());
	c.setProPrice(p.getProductprice());
	ca.insertcart(c);
	ProductDetails p1=new ProductDetails();

			List cartList=ca.retrivecart();
			ModelAndView mv=new ModelAndView("cart","CartData",cartList);
			return mv;
}
}