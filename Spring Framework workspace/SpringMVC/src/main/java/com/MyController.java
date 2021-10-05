package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller			// this is like a Servlet 
public class MyController {

	@RequestMapping(value = "hello",method = RequestMethod.GET)
	public ModelAndView sayHello() {
		System.out.println("I Came Here");					// Service --Dao layer --Dao layer 
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display.jsp");
		return mav;
	}
	
	@RequestMapping(value = "hi",method = RequestMethod.POST)
	public ModelAndView sayHi() {
		System.out.println("I Came Here");					// Service --Dao layer --Dao layer 
		ModelAndView mav = new ModelAndView();
		mav.setViewName("displayInfo.jsp");
		return mav;
	}
	
}
