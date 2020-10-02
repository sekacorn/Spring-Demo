package com.myproject;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HellowWorldController {

	// neeed a controller method to show initial HTL
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
		
	}
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
		
	}
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read the request parameter from the HTML Form
		String theName = request.getParameter("studentName");
		//covert the data to all caps
		theName = theName.toUpperCase();
		//Create  the message
		String result = " Yo! "+ theName;
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	// need a controller method to process HTML Form
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		// read the request parameter from the HTML Form
		//String theName = request.getParameter("studentName");
		//covert the data to all caps
		theName = theName.toUpperCase();
		//Create  the message
		String result = " Hey My Friend from v3! "+ theName;
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	
}
