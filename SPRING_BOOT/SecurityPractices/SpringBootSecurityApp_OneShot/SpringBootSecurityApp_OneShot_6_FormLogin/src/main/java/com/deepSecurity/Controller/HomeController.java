package com.deepSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String IndexOfSite() {
		return "Welcome...!";
	}

	@GetMapping("/home")
	public String Home() {
		return "Welcome at Home";
	}
}
