package com.DependencyInjDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjDemoApplication.class, args);
		
		Customers c = context.getBean(Customers.class);
		c.display(); 	// accessing using Dependency Injection.
		
		// accessing directly.
		Customers directC = new Customers();
		directC.display();
	}

}
