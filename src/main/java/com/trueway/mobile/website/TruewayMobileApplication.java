package com.trueway.mobile.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableJpaAuditing
@EntityScan(basePackages = {"com.trueway.mobile.website.entity"})
@EnableJpaRepositories(basePackages = {"com.trueway.mobile.website.repo"})
@ComponentScan("com.trueway.mobile.website")
@EnableResourceServer
public class TruewayMobileApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(TruewayMobileApplication.class, args);
	}
}
