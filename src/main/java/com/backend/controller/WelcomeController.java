package com.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	public ModelAndView getWelcomeMsg()
	{
		String msg="Welcome to Backend Assignment";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("message",msg);
		mav.setViewName("Welcome");
		
		return mav;
		
	}

}
