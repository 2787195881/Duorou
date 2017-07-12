package org.fkit.duorou.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.fkit.duorou.domain.Goods;
import org.fkit.duorou.service.AddgoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AddgoodsController {

	@Autowired
	@Qualifier("addgoodsService")
	private AddgoodsService addgoodsService;
	@RequestMapping(value="/tshirt")
	public String addtshirt(HttpServletRequest request,Model model){
		String id=request.getParameter("id");
		List<Goods> goodsList=addgoodsService.getAllTshirts(id);
		model.addAttribute("goodsList",goodsList);
		return"tshirt";
	}
	
	@RequestMapping(value="/dress")
	public String adddress(HttpServletRequest request,Model model){
		String id=request.getParameter("id");
		List<Goods> goodsList=addgoodsService.getAllDress(id);
		model.addAttribute("goodsList",goodsList);
		return"dress";
	}
	
	@RequestMapping(value="/pants")
	public String addpants(HttpServletRequest request,Model model){
		String id=request.getParameter("id");
		List<Goods> goodsList=addgoodsService.getAllPants(id);
		model.addAttribute("goodsList",goodsList);
		return"pants";
	}
}
