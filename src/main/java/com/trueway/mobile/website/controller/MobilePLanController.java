package com.trueway.mobile.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trueway.mobile.website.entity.MobilePlan;
import com.trueway.mobile.website.service.PlanService;

@RestController
@RequestMapping({"/trueway/mobile"})
public class MobilePLanController {
	
	 @Autowired
	 private PlanService planService;
	 
	 @GetMapping(path = {"/plans"})
	 List<MobilePlan> getAllMobilePlans(){
		return planService.getAllMobilePlans();
		
	}
	 @PostMapping(path = {"/plans"})
	 MobilePlan createMobilePlan(@RequestBody MobilePlan mobilePlan){
		return planService.createMobilePlan(mobilePlan);
		
	}
	 @GetMapping(path = {"/hello"})
	 String sayHelo(){
		return "Hi";
		
	}
}
	