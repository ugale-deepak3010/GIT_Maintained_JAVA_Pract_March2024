package com.deepSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminRoleUserAccessController {
	
	@GetMapping
	public String adminAccess() {
		return "admin Data is here";
	}

}
