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

import com.trueway.mobile.website.entity.MobilePhone;
import com.trueway.mobile.website.entity.MobilePlan;
import com.trueway.mobile.website.service.PhoneService;
import com.trueway.mobile.website.service.PlanService;

@RestController
@RequestMapping({"/truway/mobile"})
public class MobilePhoneController {
	
	 @Autowired
	 private PhoneService phoneService;
	 
	 @GetMapping(path = {"v1/phones"})
	 List<MobilePhone> getActiveMobilePhones(){
		return phoneService.getActiveMobilePhones();
		
	}
	 @PostMapping(path = {"/v1/phones"})
	 MobilePhone createMobilePlan(@RequestBody MobilePhone mobilePhone){
		
		return phoneService.createMobilePhone(mobilePhone);
		
	}
	 @PutMapping(path = {"/v1/phones"})
	 MobilePhone updateMobilePlan(@RequestBody MobilePhone mobilePhone){
		return phoneService.updateMobilePhone(mobilePhone);
	}
	 @PutMapping(path = "/v1/phones/{phoneId}")
	 void deleteMobilePlan(@RequestBody MobilePhone mobilePhone){
		phoneService.disableMobilePlan(mobilePhone);
	}
	 
}
	