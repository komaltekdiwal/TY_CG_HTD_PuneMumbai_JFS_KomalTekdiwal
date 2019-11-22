package com.capgemini.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.springmvc.bean.UserBean;

@Controller
public class SpringMVCController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd"), true);    //true-used for allow empty
		binder.registerCustomEditor(Date.class,dateEditor);
	}

	@RequestMapping(path="/hello", method=RequestMethod.GET)        
	public ModelAndView displayHelloUser() {
		ModelAndView modelAndView = new ModelAndView();  
		//		modelAndView.setViewName("/WEB-INF/views/helloUser.jsp"); 
		modelAndView.setViewName("loginForm");

		return modelAndView;
	}	//End of displayHelloUser()


	@RequestMapping(path="/loginForm",method=RequestMethod.GET)
	public ModelAndView displayLoginForm() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("loginForm");
		return modelAndView;
	}

	//type 1
	@RequestMapping(path="/login",method=RequestMethod.POST)//
	public ModelAndView login(HttpServletRequest req , ModelAndView modelAndView) { //Spring will create obj of HttpServlet andModelAndView
		String empIdVal = req.getParameter("empId");
		String password=req.getParameter("password");

		req.setAttribute("empId", empIdVal);
		req.setAttribute("password", password);

		modelAndView.setViewName("/WEB-INF/views/userDetails.jsp");
		return modelAndView;
	}

	//type 2
	@RequestMapping(path="/login2",method=RequestMethod.POST)
	public String login2(@RequestParam("empId") int empId,
			@RequestParam("password") String password,ModelMap modelMap) {

		modelMap.addAttribute("empId", empId);
		modelMap.addAttribute("password", password);

		return "/WEB-INF/views/userDetails.jsp";

	}

	//type 3
	@PostMapping("/login3")
	public String login3(int empId,String password,ModelMap modelMap) {
		modelMap.addAttribute("empId", empId);
		modelMap.addAttribute("password", password);
		return "userDetails";
	}                                                                                                               

	//type 4
	@PostMapping("/login4")
	public String login4(UserBean userBean , ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);

		return "userDetails";
	}



}//End of class
