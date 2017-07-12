package org.fkit.duorou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.fkit.duorou.domain.Goods;
import org.fkit.duorou.domain.Order;
import org.fkit.duorou.service.AddshopService;
import org.fkit.duorou.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BuyController {
	@Autowired
	@Qualifier("addshopService")
	private AddshopService addshopService;
	@Autowired
	@Qualifier("buyService")
	private BuyService buyService;
	@RequestMapping(value="/buy")
	public String addshop(HttpServletRequest request ,Model model){		
		String id=request.getParameter("id");	
		Goods goods=addshopService.goods(id);
		model.addAttribute("goods", goods);
		Order order=new Order();
		model.addAttribute("order",order);
		return"buy";
		
		
	}
	
	
	@RequestMapping(value="/buyForm", method = RequestMethod.POST)
	public ModelAndView buy(HttpServletRequest request ,Model model,@Valid @ModelAttribute Order order,ModelAndView mv,
			@RequestParam("image") String image,@RequestParam("goodsid") String goodsid,@RequestParam("dipect") String dipect,@RequestParam("price") Double price,@RequestParam("number") Integer number,@RequestParam("totalprice") Double totalprice,@RequestParam("username") String username,
			@RequestParam("address") String address,@RequestParam("phone") String phone){
		
		buyService.inOrder(image,goodsid,dipect,price,number,totalprice,username,address,phone);
		mv.addObject("message","订单提交成功！");
		mv.setViewName("turnpage");
		return mv;
		
	}
}
