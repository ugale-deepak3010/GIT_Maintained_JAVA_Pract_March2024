package com.deepSecurity.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter  {

	
	//	This is using simple Header basic prompt come in browser.
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
			.authorizeRequests()		//authorize request first 
			.anyRequest()				// all requests
			.authenticated()
			.and()						// adding another condition
			.httpBasic();				//	use basic 
		
		// By default currently we was using form based authentication but now it's ask in alert/prompt 
		//	In postman we can send it in Header "Authorization": "Basic BASE64CODE_FOR_USERNAME_PASSWORD"
	}

	//	This is used for custom credentials
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//Must be declared PasswordEncoder @Bean
		
		//auth.inMemoryAuthentication().withUser("Deep1").password("1234").roles("NORMAL");
		//auth.inMemoryAuthentication().withUser("Deep2").password("1224").roles("ADMIN");
		
		auth.inMemoryAuthentication().withUser("Deep3_using_PassEncoder")
		.password(passwordEncoder().encode("4321"))
		.roles("ADMIN");
	}
	
	// we can't store password directly so PasswordEncoder is required!!!				
	//hence Spring boot not allowing without this
	@SuppressWarnings("deprecation")
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		//return NoOpPasswordEncoder.getInstance();	// No encryption
		
		return new BCryptPasswordEncoder(10);		
	}
	
	
	
	

	
	
	
}
