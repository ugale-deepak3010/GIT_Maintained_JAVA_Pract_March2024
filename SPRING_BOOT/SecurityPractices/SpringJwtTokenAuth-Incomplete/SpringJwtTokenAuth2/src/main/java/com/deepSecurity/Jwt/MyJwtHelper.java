package com.deepSecurity.Jwt;

import java.util.Date;
import java.util.function.Function;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class MyJwtHelper {

	public static final long jwtTokenValidity = 5 * 60 * 60 * 1_000; // 5hr 60min 60sec 1000millSec

	public String getUserNameFromToken(String token) {

		return getClaimFromToken(token, Claims::getSubject);

	}
	
	public Date getExpirationDateFromToken(String token) {
		
		return getClaimFromToken(token, Claims::getExpiration);
	}

	private <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {

		final Claims claims= getAllClaimsFromToken(token);
		
		return claimsResolver.apply(claims);
	}

	@SuppressWarnings("deprecation")
	private Claims getAllClaimsFromToken(String token) {
		
		return (Claims) Jwts.parser().setSigningKey(token);
	}


	
	

}
