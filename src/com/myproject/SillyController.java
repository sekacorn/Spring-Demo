package com.myproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {

	
	@RequestMapping("/showForm")
	public String showForm() {
		return "silly";
		
	}
	/*@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
		
	}*/
}
