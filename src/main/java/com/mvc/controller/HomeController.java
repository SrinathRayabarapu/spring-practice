package com.mvc.controller;

import com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String goToHomePage() {
		return "home";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	@RequestMapping("/processFormv2")
	public String letsShout(HttpServletRequest request, Model model) {//can also use @RequestParam("studentName") studentName
		
		String studentName = request.getParameter("studentName");
		studentName = "Yo! ".concat(studentName.toUpperCase());
		
		model.addAttribute("message", studentName);
		
		return "helloWorld";
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("userName", user.getUserName());
		return "user";
	}
}
