package com.trueway.mobile.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trueway.mobile.website.entity.MobileAccessory;
import com.trueway.mobile.website.entity.MobilePhone;
import com.trueway.mobile.website.entity.MobilePlan;
import com.trueway.mobile.website.service.AccessoryService;
import com.trueway.mobile.website.service.PhoneService;
import com.trueway.mobile.website.service.PlanService;

@RestController
@RequestMapping({"/trueway/mobile"})
public class MobileAccessoryController {
	
	 @Autowired
	 private AccessoryService service;
	 
	 @GetMapping(path = {"v1/accessories"})
	 List<MobileAccessory> getAllAccessories(){
		return service.getAllAccessories();
		
	}
	 @PostMapping(path = {"/v1/accessories"})
	 MobileAccessory createMobilePlan(@RequestBody MobileAccessory mobileAccessory){
		
		return service.createMobileAccessory(mobileAccessory);
		
	}
}
	