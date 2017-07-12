package org.fkit.duorou.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.fkit.duorou.domain.Manager;
import org.fkit.duorou.domain.User;
import org.fkit.duorou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


	@Controller
	public class UserController {
		@Autowired
		@Qualifier("userService")
		private UserService userService;
	@RequestMapping(value="/register")
		public String register(
			
		Model model){
			User user=new User();
				model.addAttribute("user",user);
				return "register";
	}
		@RequestMapping(value="/registerform",method=RequestMethod.POST)
		public String registeform(
				String username,String password,String email,String phone,
				@Valid @ModelAttribute User user,
				Errors errors,
				Model model){
			if(errors.hasErrors()){
				return"register";
			}
			else{
				userService.inUser(username, password, email, phone);
			return "login";}
		}
		
		@RequestMapping(value="/loginform",method=RequestMethod.POST)
		public ModelAndView login(String username,String password,
			ModelAndView mv,
			HttpSession session){
			User user=userService.login(username,password);
			if(user!=null){
				session.setAttribute("username", username);
				mv.setView(new RedirectView("/Duorou/duorou"));
			}
			else{
				mv.addObject("message","用户名或密码错误，请重新输入！");
				mv.setViewName("login");
			}
			return mv;
			
		}
		
		@RequestMapping(value="/managerform",method=RequestMethod.POST)
		public ModelAndView manager(String username,String password,
			ModelAndView mv,
			HttpSession session){
			Manager manager=userService.manager(username,password);
			if(manager!=null){
				
				mv.setView(new RedirectView("/Duorou/manage"));
			}
			else{
				mv.addObject("message","管理员身份验证错误，请重新输入！");
				mv.setViewName("login");
			}
			return mv;
			
		}
		@RequestMapping(value="/newpwdform" ,method=RequestMethod.POST)
		public ModelAndView findpwd(ModelAndView mv,
				@RequestParam("username")String username,@RequestParam("newpwd") String newpwd,@RequestParam("renewpwd") String renewpwd){
			if( newpwd.equals(renewpwd)){
				userService.findPwd(username,newpwd);
				mv.addObject("message", "成功修改密码，请重新登录！");
				mv.setViewName("login");
			}else {
				mv.addObject("message", "输入错误，请重新输入！");
				mv.setViewName("newpwd");
			}
			
			return mv;
		}
		
		
	}
