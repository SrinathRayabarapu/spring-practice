package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funny")
public class FunnyController {

	@RequestMapping("/someFun")
	public String iWantFun() {
		return "fun-page";
	}
	
}
