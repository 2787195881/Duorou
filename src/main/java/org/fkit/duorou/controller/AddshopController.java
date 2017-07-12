package org.fkit.duorou.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.fkit.duorou.domain.Collection;
import org.fkit.duorou.domain.Goods;
import org.fkit.duorou.domain.Remark;
import org.fkit.duorou.service.AddshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class AddshopController {

@Autowired
@Qualifier("addshopService")
private AddshopService addshopService;
@RequestMapping(value="/addshop")
public String addshop(HttpServletRequest request ,Model model){
	Remark remark=new Remark();
	model.addAttribute("remark",remark);
	String id=request.getParameter("id");
	List<Remark> remarkList=addshopService.getAllAboutThisgoods(id);
	model.addAttribute("remarkList",remarkList);
	Goods goods=addshopService.goods(id);
	model.addAttribute("goods", goods);
	return"addshop";
	
	
}

@RequestMapping(value="/submitForm" )

public ModelAndView insertRemark(HttpSession session,
		@Valid @ModelAttribute Remark remark,ModelAndView mv,
		Errors errors,HttpServletRequest request,
		Model model){
	String username=(String) session.getAttribute("username");
	String id=request.getParameter("goodsid");
	String comment=request.getParameter("comment");
	List<Remark> remarkList=addshopService.getAllAboutThisgoods(id);
	model.addAttribute("remarkList",remarkList);
	Goods goods=addshopService.goods(id);
	model.addAttribute("goods", goods);
	
	if(username!=null){
		
			if(comment!=null){
				addshopService.inRemark(username, id,comment);
				mv.addObject("message1","评论成功！");
				mv.setViewName("addshop");
				
				}
			else{	
				
				mv.addObject("message1","评论不能为空！");
				mv.setViewName("addshop");
				
				}
			}
	else{
		mv.addObject("message1","请先登陆！");
		mv.setViewName("addshop");
	}


	return mv;

}
	
//	if(errors.hasErrors()){
//		String id=request.getParameter("goodsid");
//		Goods goods=addshopService.goods(id);
//		model.addAttribute("goods", goods);
//		List<Remark> remarkList=addshopService.getAllAboutThisgoods(id);
//		model.addAttribute("remarkList",remarkList);
//		return"addshop";
//	}
//	else{
//		String id=request.getParameter("goodsid");
//		Goods goods=addshopService.goods(id);
//		model.addAttribute("goods", goods);
//		List<Remark> remarkList=addshopService.getAllAboutThisgoods(id);
//		model.addAttribute("remarkList",remarkList);
//		addshopService.inRemark(username, goodsid,comment);
//		return"addshop";
//		}



	@RequestMapping(value="/collect" )
	
	public ModelAndView insertCollection(@Valid @ModelAttribute Remark remark,Errors errors,
			HttpServletRequest request,ModelAndView mv,HttpSession session,
			Model model){
			
			String username=(String) session.getAttribute("username");
			String id=request.getParameter("id");
			List<Remark> remarkList=addshopService.getAllAboutThisgoods(id);
			model.addAttribute("remarkList",remarkList);
			Goods goods=addshopService.goods(id);
			model.addAttribute("goods", goods);
			Collection collection=addshopService.collection( id,username);
			model.addAttribute("collection",collection);			
			if(username!=null){
				
					if(collection!=null){
						mv.addObject("message","该商品已收藏过啦！");
						mv.setViewName("addshop");
						
						}
					else{					
						addshopService.inCollect(username,id);
						mv.addObject("message","收藏成功！");
						mv.setViewName("addshop");
						
						}
					}
			else{
				mv.addObject("message","请先登陆！");
				mv.setViewName("addshop");
			}
		

			return mv;

	}
	
	@RequestMapping(value="/addcart")
	public ModelAndView insertcart(HttpServletRequest request,ModelAndView mv,HttpSession session,
			String goodsid,Integer amount,
			@Valid @ModelAttribute Remark remark,Errors errors,Model model){
		String username=(String) session.getAttribute("username");
		String id=request.getParameter("goodsid");
		List<Remark> remarkList=addshopService.getAllAboutThisgoods(id);
		model.addAttribute("remarkList",remarkList);
		Goods goods=addshopService.goods(id);
		model.addAttribute("goods", goods); 
		Goods checkcart=addshopService.checkcart(id,username);
		model.addAttribute("checkcart",checkcart);
		if(username!=null){
			if(checkcart==null){
			addshopService.inCart(goodsid,amount,username);
			mv.addObject("message2","商品已在购物车等你啦！");
			mv.setViewName("addshop");}
			else{
//				amount=amount+checkart(amount);
//				addshopService.updateCart(goodsid,amount);
				mv.addObject("message2","商品已在购物车等你啦！");
				mv.setViewName("addshop");
				
			}
			
		}
		else{
			mv.addObject("message2","亲，你还没有登陆哦！");
			mv.setViewName("addshop");
		}
			
		return mv;
		
	}

	private Integer checkart(Integer amount) {
		// TODO Auto-generated method stub
		return null;
	}

	
}