package com.trueway.mobile.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trueway.mobile.website.entity.PlanOffer;
import com.trueway.mobile.website.service.OfferService;

@RestController
@RequestMapping({"/trueway/mobile"})
public class PlanOfferController {
	
	 @Autowired
	 private OfferService offerService;
	 
	 @GetMapping(path = {"v1/offers"})
	 List<PlanOffer> getAllMobilePhones(){
		return offerService.getAllOffers();
		
	}
	 @PostMapping(path = {"/v1/offers"})
	 PlanOffer createMobilePlan(@RequestBody PlanOffer planOffer){
		
		return offerService.createPlanOffer(planOffer);
		
	}
}
	