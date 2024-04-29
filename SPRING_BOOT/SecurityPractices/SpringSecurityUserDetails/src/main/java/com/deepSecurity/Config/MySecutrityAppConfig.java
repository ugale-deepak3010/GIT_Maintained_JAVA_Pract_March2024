package com.deepSecurity.Config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class MySecutrityAppConfig {
	
	@Bean
	public InMemoryUserDetailsManager	setUpUser() {
		
		List<GrantedAuthority> authorities= new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("admin"));
		authorities.add(new SimpleGrantedAuthority("xyz"));
		authorities.add(new SimpleGrantedAuthority("visitor"));
		authorities.add(new SimpleGrantedAuthority("customer"));
		
		
		UserDetails userDetails= new User("deepak", "1234", authorities);
		
		InMemoryUserDetailsManager inMemoryUserDetailsManager= new InMemoryUserDetailsManager();
		inMemoryUserDetailsManager.createUser(userDetails);
		
		return inMemoryUserDetailsManager;
	}

}
