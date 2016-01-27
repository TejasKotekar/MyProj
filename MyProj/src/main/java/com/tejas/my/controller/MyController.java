package com.tejas.my.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tejas.my.model.HelloModel;
import com.tejas.my.vo.HelloVo;



@Controller
public class MyController extends HelloModel{
	
	
	HelloModel model = new HelloModel();
	
	@RequestMapping("/hello.html")
	public ModelAndView helloHandler(String firstName){
		
		List<String> list = model.getList();
		System.out.println("First Name: " +firstName);
		model.setList(list);
		return new ModelAndView("hello","command",model);
		
		
		
	}

}
