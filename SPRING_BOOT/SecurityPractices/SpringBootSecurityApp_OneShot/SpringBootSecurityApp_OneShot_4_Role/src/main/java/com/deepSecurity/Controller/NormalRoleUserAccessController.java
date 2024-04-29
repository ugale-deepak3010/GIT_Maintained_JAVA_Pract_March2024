package com.deepSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/normal")
public class NormalRoleUserAccessController {
	
	@GetMapping
	public String normalAccess() {
		return "Normal Data is here";
	}

}
