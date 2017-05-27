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
import com.eshop.dao.CategoryDao;
import com.eshop.dao.ProductDao;
import com.eshop.dao.RegisterDao;
import com.eshop.dao.SupplierDao;
import com.eshop.model.CartDetails;
import com.eshop.model.ProductDetails;
import com.eshop.model.UserCredentials;

@Controller
public class CartController {
	@Autowired
	 ProductDao pd;
	@Autowired
	CartDao ca;
	@Autowired
	CategoryDao cc;
	@Autowired
	SupplierDao sd;
	@Autowired
	RegisterDao rd;
	
	@RequestMapping("/addcart")
	public ModelAndView addToCart(@RequestParam("pid")String productId,@RequestParam("quantity")  int qty ,HttpSession session)
	{  
		int x=Integer.parseInt(productId);
	ProductDetails p= pd.editproduct(x);
	CartDetails c= new CartDetails();
	
	c.setCartUser((String)session.getAttribute("userId"));
	c.setProId(p.getProductId());
	c.setProName(p.getProductname());
	c.setProPrice(p.getProductprice());
	ca.insertcart(c);
	ProductDetails p1=new ProductDetails();

			List cartList=ca.retrivecart((String)session.getAttribute("userId"));
			ModelAndView mv=new ModelAndView("cart","CartData",cartList);
			return mv;
}
}