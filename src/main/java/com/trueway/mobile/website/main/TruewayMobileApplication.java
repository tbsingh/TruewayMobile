package com.trueway.mobile.website.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TruewayMobileApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruewayMobileApplication.class, args);
	}
}
