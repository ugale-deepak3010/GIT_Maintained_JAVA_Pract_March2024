package com.deepSecurity.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ie")
@PreAuthorize("hasRole('IE')")
public class IE_PreAuth_Controller {

	@GetMapping
	public String ieMethod() {
		return "Integration Engineer can access this";
	}
}
