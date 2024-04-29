package com.deepSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {
	
	@GetMapping("/blog")
	public String blog() {
		return "This is blog";
	}
	
	@GetMapping("/qna")
	public String QnA() {
		return "This is QnA";
	}

}
