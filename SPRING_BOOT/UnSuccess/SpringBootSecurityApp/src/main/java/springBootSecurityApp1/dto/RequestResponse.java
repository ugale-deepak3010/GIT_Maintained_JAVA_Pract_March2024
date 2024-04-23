package springBootSecurityApp1.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import springBootSecurityApp1.entity.OurUsers;
import springBootSecurityApp1.entity.Products;

import lombok.Data;

@Data

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestResponse {
	private int statusCode;
	private String error;
	private String message;
	private String token;
	private String refreshToken;
	private String expirationTime;
	private String name;
	private String password;
	private String email;
	private String role;
	private List<Products> products;
	private OurUsers ourUsers;
	
	
}
