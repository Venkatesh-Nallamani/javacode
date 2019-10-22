package com.example.SpringWorkingCode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
	
	@RequestMapping("/venki")
	public String fun1(){
		System.out.println("hi");
		return "success";
		
	}

}
