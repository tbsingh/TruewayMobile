package com.trueway.mobile.website.controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.trueway.mobile.website.entity.Status;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/"})
public class HealthController {
	
	@GetMapping(path = {"/health"})
	Status isAlive(){
		return new Status();
	}

}
