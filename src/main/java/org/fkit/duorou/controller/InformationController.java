package org.fkit.duorou.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.duorou.domain.Goods;
import org.fkit.duorou.domain.Order;
import org.fkit.duorou.domain.User;
import org.fkit.duorou.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class InformationController {
	@Autowired
	@Qualifier("informationService")
	private InformationService informationService;
	@RequestMapping(value="/information")
	public ModelAndView loadmyself(HttpServletRequest request ,Model model,
		ModelAndView mv,HttpSession session){
		
		String username=(String) session.getAttribute("username");
		User myself=informationService.myself(username);
		model.addAttribute("myself", myself);
		//List<Goods> collectList=informationService.showcollection(username);
		//model.addAttribute("collectList",collectList);
		if(username==null){
			mv.addObject("message4","登陆后才可以查看信息哦！");
			mv.setViewName("login");
		}
		else{
			
			mv.setViewName("information");
		}
		return mv;
		
	}
	@RequestMapping(value="/mycol")
	public ModelAndView loadmycollection(HttpServletRequest request ,Model model,ModelAndView mv,
			Goods goods,HttpSession session){
		String username=(String) session.getAttribute("username");
		User myself=informationService.myself(username);
		model.addAttribute("myself", myself);
		
		List<Goods> collectionList=informationService.showcollection(username);
		model.addAttribute("collectionList",collectionList);
		
		mv.setViewName("information");
		return mv;
		
	}
	@RequestMapping(value="/myord")
	public ModelAndView loadmyorder(HttpServletRequest request ,Model model,ModelAndView mv,
			Order order,HttpSession session){
		String username=(String) session.getAttribute("username");
		User myself=informationService.myself(username);
		model.addAttribute("myself", myself);
		
		List<Order> orderList=informationService.showorder(username);
		model.addAttribute("orderList",orderList);
		mv.setViewName("information");
		return mv;
		
	}
	
	@RequestMapping(value="/deletecollection")
	public ModelAndView deletecollection(HttpServletRequest request ,Model model,ModelAndView mv,
		Goods goods,Order order,HttpSession session){
		String username=(String) session.getAttribute("username");
		String id=request.getParameter("id");
		User myself=informationService.myself(username);
		model.addAttribute("myself", myself);
		
		List<Goods> collectionList=informationService.showcollection(username);
		model.addAttribute("collectionList",collectionList);
		
		informationService.deletecollection(username,id);
		mv.addObject("message5","删除成功！");
		mv.setViewName("information");
		return mv;
		
	}
}
