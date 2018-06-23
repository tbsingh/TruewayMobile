package com.trueway.mobile.website.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan("com.trueway.mobile.website")
public class TruewayMobileApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruewayMobileApplication.class, args);
	}
}
