package com.trueway.mobile.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EntityScan(basePackages = {"com.trueway.mobile.website.entity"})
@EnableJpaRepositories(basePackages = {"com.trueway.mobile.website.repo"})
@ComponentScan("com.trueway.mobile.website")
public class TruewayMobileApplication {
	public static void main(String[] args) {
		SpringApplication.run(TruewayMobileApplication.class, args);
	}
}
