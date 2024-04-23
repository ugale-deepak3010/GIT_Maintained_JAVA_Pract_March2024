package springBootSecurityApp1.service;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.function.Function;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JWTUtils {

	private SecretKey key;
	private final static long EXPIRATION_TIME = 86400000; // 24 hours in milliseconds

	public JWTUtils() {
		String secretString = "JYFT7F655454DYRDYRFYRDYTRHBYGIYU";
		byte[] keyBytes = Base64.getDecoder().decode(secretString.getBytes(StandardCharsets.UTF_8));
		this.key = new SecretKeySpec(keyBytes, "HmacSHA256");
	}

	public String GenerateToken(UserDetails userDetails) {

		return Jwts.builder().subject(userDetails.getUsername()).issuedAt(new Date(System.currentTimeMillis()))
				.expiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME)).signWith(key).compact();
	}

	public String GenerateRefreshToken(HashMap<String, Object> claims, UserDetails userDetails) {

		return Jwts.builder().claims(claims).subject(userDetails.getUsername())
				.issuedAt(new Date(System.currentTimeMillis()))
				.expiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME)).signWith(key).compact();
	}

	public String extractUsername(String token) {

		return extractClaim(token, Claims::getSubject);
	}

	private <T> T extractClaim(String token, Function<Claims, T> claimsTFunction) {

		return claimsTFunction
				.apply(
						Jwts.parser()
							.verifyWith(key)
							.build()
							.parseSignedClaims(token)
							.getPayload());

	}
	
	
	public boolean isTokenValid(String token, UserDetails userDetails) {
		final String username= extractUsername(token);
		
		return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
		 
	}
	
	public boolean isTokenExpired(String token) {
		return extractClaim(token, Claims::getExpiration ).before(new Date());
	}

}
