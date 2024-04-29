package com.deepSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String slash() {
		
		return "welcome..!";
	}
	
	@GetMapping("/home")
	public String home() {
		
		return "welcome..!";
	}

}
