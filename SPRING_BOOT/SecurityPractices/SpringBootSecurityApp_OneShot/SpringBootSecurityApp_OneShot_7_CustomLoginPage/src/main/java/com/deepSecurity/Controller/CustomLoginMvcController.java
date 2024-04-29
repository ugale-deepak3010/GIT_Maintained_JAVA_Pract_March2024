package com.deepSecurity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customLoginPage")
public class CustomLoginMvcController {

	@GetMapping
	public String loginCustomPage() {
		
		return "custom-login-page.html";
	}
}
