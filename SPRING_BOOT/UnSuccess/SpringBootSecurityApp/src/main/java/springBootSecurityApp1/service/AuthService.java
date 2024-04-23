package springBootSecurityApp1.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import springBootSecurityApp1.dto.RequestResponse;
import springBootSecurityApp1.entity.OurUsers;
import springBootSecurityApp1.repository.OurUsersRepo;

@Service
public class AuthService {

	@Autowired
	private OurUsersRepo ourUsersRepo;
	@Autowired
	private JWTUtils jwtUtils;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	

	public RequestResponse signUp(RequestResponse registrationRequest) {
		
		

		RequestResponse requestResponse = new RequestResponse();
		try {
			OurUsers ourUsers = new OurUsers();
			ourUsers.setEmail(registrationRequest.getEmail());
			ourUsers.setPassword(passwordEncoder.encode(registrationRequest.getPassword()));
			ourUsers.setRole(registrationRequest.getRole());

			OurUsers ourUsersResult = ourUsersRepo.save(ourUsers);

			if (ourUsersResult != null && ourUsersResult.getId() > 0) {
				requestResponse.setOurUsers(ourUsersResult);
				requestResponse.setMessage("User saved successfully");
				requestResponse.setStatusCode(200);
			}
		} catch (Exception e) {
			requestResponse.setStatusCode(500);
			requestResponse.setMessage(e.getMessage());
		}
		return requestResponse;
	}

	public RequestResponse signIn(RequestResponse signinRequest) {
		RequestResponse requestResponse = new RequestResponse();

		try {
			
			
						
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(signinRequest.getEmail(), signinRequest.getPassword()));
			
			var user = ourUsersRepo.findByEmail(signinRequest.getEmail()).orElseThrow();
			// var is helpful to print the object
			System.out.println("USER is: " + user);

			var jwt = jwtUtils.GenerateToken(user);
			var regreshToken = jwtUtils.GenerateRefreshToken(new HashMap<>(), user);

			requestResponse.setStatusCode(200);
			requestResponse.setToken(jwt);
			requestResponse.setRefreshToken(regreshToken);
			requestResponse.setExpirationTime("24Hr");
			requestResponse.setMessage("Successfully signed");

		} catch (Exception e) {
			requestResponse.setStatusCode(500);
			requestResponse.setMessage(e.getMessage());
		}
		return requestResponse;
	}
	
	public RequestResponse refreshToken(RequestResponse refreshTokenRequest) {
		RequestResponse requestResponse= new RequestResponse();
		String ourEmail= jwtUtils.extractUsername(refreshTokenRequest.getEmail());
		OurUsers users= ourUsersRepo.findByEmail(ourEmail).orElseThrow();
		
		if (jwtUtils.isTokenValid(refreshTokenRequest.getToken(), users)) {
			var jwt= jwtUtils.GenerateToken(users);
			
			requestResponse.setStatusCode(200);
			requestResponse.setToken(jwt);
			requestResponse.setRefreshToken(refreshTokenRequest.getToken());
			requestResponse.setExpirationTime("24Hr");
			requestResponse.setMessage("Successfully refreshed Token");
		}else {
			requestResponse.setStatusCode(500);
		}
		
		return requestResponse;
	}

}















