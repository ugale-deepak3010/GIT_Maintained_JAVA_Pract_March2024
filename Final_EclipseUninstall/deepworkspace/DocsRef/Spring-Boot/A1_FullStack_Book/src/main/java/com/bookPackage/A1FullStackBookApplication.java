package com.bookPackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("com.bookPackage.Repo")	//optional
@EntityScan("com.bookPackage.Model")			//optional
@SpringBootApplication
public class A1FullStackBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(A1FullStackBookApplication.class, args);
	}

}
