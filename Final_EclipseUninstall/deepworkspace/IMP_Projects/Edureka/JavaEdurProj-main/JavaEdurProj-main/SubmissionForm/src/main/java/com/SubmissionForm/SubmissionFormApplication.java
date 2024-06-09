package com.SubmissionForm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootConfiguration		// added later after creating 2 jsp file and controller methods.
@SpringBootApplication
public class SubmissionFormApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SubmissionFormApplication.class);
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SubmissionFormApplication.class, args);
	}

}
