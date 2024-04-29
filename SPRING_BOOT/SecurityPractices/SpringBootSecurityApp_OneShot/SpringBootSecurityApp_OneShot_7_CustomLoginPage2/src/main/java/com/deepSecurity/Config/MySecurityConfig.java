package com.deepSecurity.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfTokenRepository;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)	// use only if @PreAuthorize("hasRole('IE')")
public class MySecurityConfig extends WebSecurityConfigurerAdapter  {

	
	//	This is using simple Header basic prompt come in browser.
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
			
			//.csrf().disable()	// non-browsers for must be disable. It will allow post data
		.csrf().csrfTokenRepository( CookieCsrfTokenRepository.withHttpOnlyFalse())
			.and()
			// csrf token came in response cookie. in next request add in header X-XSRF-TOKEN= csrf cookie value
			//	if csrf token is generated then not need to send basic authentication credentials. csrf token is enough
			//	csrf token is one kind of non browser based session.
		.authorizeRequests()		//authorize request first 
			.antMatchers("/","/customLoginPage","/home","/public/**").permitAll()	// we can specify methods also..
			.antMatchers("/admin").hasRole("ADMIN")
			.antMatchers("/normal").hasAnyRole("NORMAL","ADMIN","IE")	
			// in my case USER was not used antMatcher so anybody accessing that in Get case not post.
			.anyRequest()				// all requests
		.authenticated()
			.and()						// adding another condition
			//.httpBasic();				//	use basic 
			.formLogin()	// it's maintain cookie in sessionId so every time instead of credentials it's pass
							// sessionId, so user can logout.
			.loginPage("/customLoginPage")
			.loginProcessingUrl("/dologin")
			.defaultSuccessUrl("/home");
		
		// By default currently we was using form based authentication but now it's ask in alert/prompt 
		//	In postman we can send it in Header "Authorization": "Basic Deep4:1234"
		//																BASE64CODED																				
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
		
		auth.inMemoryAuthentication().withUser("Deep4")
		.password(passwordEncoder().encode("1234"))
		.roles("NORMAL");
		
		auth.inMemoryAuthentication().withUser("Deep5")
		.password(passwordEncoder().encode("1234567"))
		.roles("IE");
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
