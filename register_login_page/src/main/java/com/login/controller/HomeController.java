package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	@GetMapping("/profile")
	public String profile() {
		return "profile";
	}
	@GetMapping("/signin")
	public String login() {
		return "login";
	}
	@GetMapping("/home")
	public String home() {
		return "home";
	}
}












