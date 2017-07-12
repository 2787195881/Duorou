package org.fkit.duorou.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.duorou.domain.Goods;
import org.fkit.duorou.domain.Order;
import org.fkit.duorou.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ManageController {

	@Autowired
	@Qualifier("manageService")
	private ManageService manageService;
	@RequestMapping(value="/manage")
	public String addtshirt(HttpServletRequest request,Model model,Goods goods){
		
		List<Goods> tshirtList=manageService.getAlltshirts();
		model.addAttribute("tshirtList",tshirtList);
		List<Goods> dressList=manageService.getAlldress();
		model.addAttribute("dressList",dressList);
		List<Goods> pantsList=manageService.getAllpants();
		model.addAttribute("pantsList",pantsList);
		return"manage";
	}
	
	@RequestMapping(value="/deleteItem")
	public ModelAndView deleteItem(HttpServletRequest request,Model model,ModelAndView mv,HttpSession session){
		String id=request.getParameter("id");
		manageService.deleteItem(id);
		List<Goods> tshirtList=manageService.getAlltshirts();
		model.addAttribute("tshirtList",tshirtList);
		List<Goods> dressList=manageService.getAlldress();
		model.addAttribute("dressList",dressList);
		List<Goods> pantsList=manageService.getAllpants();
		model.addAttribute("pantsList",pantsList);
		mv.addObject("message6","操作成功！");
		mv.setViewName("redirect:/manage");
		return mv;
	}
	
	@RequestMapping(value="/addItem", method=RequestMethod.POST)
	public ModelAndView addItem(HttpServletRequest request,Model model,ModelAndView mv,
			@RequestParam("goodsid") String goodsid,@RequestParam("dipect") String dipect,@RequestParam("price") Double price,@RequestParam("amount") Integer amount,
			@RequestParam("typeid") String typeid,@RequestParam("image") String image,@RequestParam("file") MultipartFile file,HttpSession session) 
			throws Exception{
		if(!file.isEmpty()){
			String path=request.getServletContext().getRealPath("/images/goods/");
			String filename=file.getOriginalFilename();
			File filepath=new File(path,filename);
			if(!filepath.getParentFile().exists()){
				filepath.getParentFile().mkdirs();
			}
			file.transferTo(new File(path+File.separator+ filename));
			manageService.addNewitem(goodsid,dipect,price,amount,typeid,image);
			mv.addObject("message6","操作成功！");
			mv.setViewName("redirect:/manage");
		}else{
			mv.addObject("message6","操作失败！");
			mv.setViewName("redirect:/additem");
		}
		
		
		return mv;
	}
	
	@RequestMapping(value="/alteritem")
	public String alteritem(HttpServletRequest request,Model model
			) 
			{
		String id=request.getParameter("id");
		Goods item=manageService.getThisitem(id);
		model.addAttribute("item",item);
		return "alteritem";
	}
	
	@RequestMapping(value="/alterForm", method=RequestMethod.POST)
	public ModelAndView alterForm(HttpServletRequest request,Model model,ModelAndView mv,HttpSession session,
			@RequestParam("goodsid") String goodsid,@RequestParam("dipect") String dipect,@RequestParam("price") Double price,@RequestParam("amount") Integer amount,
			@RequestParam("typeid") String typeid,@RequestParam("image") String image,@RequestParam("file") MultipartFile file) 
			throws Exception{
		if(!file.isEmpty()){
			String path=request.getServletContext().getRealPath("/images/goods/");
			String filename=file.getOriginalFilename();
			File filepath=new File(path,filename);
			if(!filepath.getParentFile().exists()){
				filepath.getParentFile().mkdirs();
			}
			file.transferTo(new File(path+File.separator+ filename));
			manageService.updateitem(goodsid,dipect,price,amount,typeid,image);
//			List<Goods> tshirtList=manageService.getAlltshirts();
//			model.addAttribute("tshirtList",tshirtList);
//			List<Goods> dressList=manageService.getAlldress();
//			model.addAttribute("dressList",dressList);
//			List<Goods> pantsList=manageService.getAllpants();
//			model.addAttribute("pantsList",pantsList);
			mv.addObject("message6","操作成功！");
			mv.setViewName("redirect:/manage");
		}else{
//			List<Goods> tshirtList=manageService.getAlltshirts();
//			model.addAttribute("tshirtList",tshirtList);
//			List<Goods> dressList=manageService.getAlldress();
//			model.addAttribute("dressList",dressList);
//			List<Goods> pantsList=manageService.getAllpants();
//			model.addAttribute("pantsList",pantsList);
			manageService.updateitem(goodsid,dipect,price,amount,typeid,image);
			mv.addObject("message6","操作成功！");
			mv.setViewName("redirect:/manage");
		}
		
		
		return mv;
	}
	
	@RequestMapping(value="/alorder")
	public String orders(HttpServletRequest request,Model model,Order order){
		
		List<Order> orderList=manageService.getAllorders();
		model.addAttribute("orderList",orderList);
		
		return"alorder";
	}
	
	@RequestMapping(value="/deleteOrder")
	public ModelAndView deleteOrder(HttpServletRequest request,ModelAndView mv,@RequestParam("id") Integer id){
		manageService.deleteOrder(id);
		mv.addObject("message","删除成功！");
		mv.setViewName("redirect:/alorder");
		return mv;
	}
}
