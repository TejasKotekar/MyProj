package com.tejas.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class MyController {
	
	@RequestMapping("/hello")
	public ModelAndView helloHandler(String firstName){
		
		System.out.println("First Name: " +firstName);
		return new ModelAndView("hello","command",firstName);
		
		
		
	}

}
