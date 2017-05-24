 package com.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CartDao;
import com.eshop.dao.CatDao;
import com.eshop.dao.ProdDao;
import com.eshop.dao.SupDao;
import com.eshop.model.CartDetails;
import com.eshop.model.ProductDetails;

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
	@RequestMapping("/eladprod1")
	public ModelAndView addToCart(@RequestParam("dpid1")int id)
	{  
	ProductDetails p= pd.editproduct(id);
	CartDetails c= new CartDetails();
	
	c.setCartUser("teja");
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