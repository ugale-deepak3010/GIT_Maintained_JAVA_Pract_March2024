package springBootSecurityApp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springBootSecurityApp1.dto.RequestResponse;
import springBootSecurityApp1.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	private AuthService authService;

	@PostMapping("/signup")
	public ResponseEntity<RequestResponse> signUp(@RequestBody RequestResponse request) {
		
		return ResponseEntity.ok(authService.signUp(request));
	}
	
	@PostMapping("/signin")
	public ResponseEntity<RequestResponse> signIn(@RequestBody RequestResponse request) {
		
		return ResponseEntity.ok(authService.signIn(request));
	}
	
	@PostMapping("/refresh")
	public ResponseEntity<RequestResponse> refreshToken(@RequestBody RequestResponse request) {
		
		return ResponseEntity.ok(authService.refreshToken(request));
	}
	
}
