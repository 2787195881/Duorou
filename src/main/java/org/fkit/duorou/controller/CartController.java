package org.fkit.duorou.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.duorou.domain.Goods;
import org.fkit.duorou.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {

	@Autowired
	@Qualifier("cartService")
	private CartService cartService;
	@RequestMapping(value="/shoppingcart")
	public ModelAndView loadcart(HttpServletRequest request ,Model model,
			Goods goods,ModelAndView mv,HttpSession session){
		
		String username=(String) session.getAttribute("username");
		List<Goods> cartList=cartService.showcart(username);
		model.addAttribute("cartList",cartList);
		if(username==null){
			mv.addObject("message3","登陆后才可以查看购物车哦！");
			mv.setViewName("login");
		}
		else{
			
			mv.setViewName("shoppingcart");
		}
		return mv;
		
	}
	
	@RequestMapping(value="/deletecart")
	public ModelAndView deletecart(HttpServletRequest request ,Model model,ModelAndView mv,
			Goods goods,HttpSession session){
		String username=(String) session.getAttribute("username");
		String id=request.getParameter("id");
		List<Goods> cartList=cartService.showcart(username);
		model.addAttribute("cartList",cartList);
		cartService.deleteCart( id, username);
		mv.setViewName("redirect:/shoppingcart");
		return mv;
		
	}
}
