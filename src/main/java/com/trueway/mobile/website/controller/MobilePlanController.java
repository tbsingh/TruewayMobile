package com.trueway.mobile.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trueway.mobile.website.entity.MobilePlan;
import com.trueway.mobile.website.service.PlanService;

@RestController
@RequestMapping({"/truway/mobile"})
public class MobilePlanController {
	
	 @Autowired
	 private PlanService planService;
	 
	 @GetMapping(path = {"/v1/plans"})
	 List<MobilePlan> getActiveMobilePlans(){
		return planService.getActiveMobilePlans();
		
	}
	@PostMapping(path = {"/v1/plans"})
	 MobilePlan createMobilePlan(@RequestBody MobilePlan mobilePlan){
		return planService.createMobilePlan(mobilePlan);
	}
	@PutMapping(path = {"/v1/plans"})
	 MobilePlan updateMobilePlan(@RequestBody MobilePlan mobilePlan){
		return planService.updateMobilePlan(mobilePlan);
		
	}
	@PutMapping(path = "/v1/plans/{planId}")
	 void deleteMobilePlan(@RequestBody MobilePlan mobilePlan){
		 planService.disableMobilePlan(mobilePlan);
	}
	 
}
	