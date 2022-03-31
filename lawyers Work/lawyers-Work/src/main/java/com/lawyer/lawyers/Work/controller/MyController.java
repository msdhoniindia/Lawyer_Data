package com.lawyer.lawyers.Work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	
	@GetMapping("/index")
	public String home() {
		return "index";
	}
	@GetMapping("/about-us")
	public String AboutUs() {
		return "about-us";
	}
	
	@GetMapping("/blog")
	public String blog() {
		return "blog";
	}
	
	@GetMapping("/services")
	public String services() {
		return "services";
	}
	
	@GetMapping("/contact-us")
	public String contact_us() {
		return "contact-us";
	}
	
	@GetMapping("/Sucess")
	public String success_page() {
		return "Sucess";
	}
}
