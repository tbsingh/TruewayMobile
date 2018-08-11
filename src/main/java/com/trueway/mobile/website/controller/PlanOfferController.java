package com.trueway.mobile.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trueway.mobile.website.entity.AppUser;
import com.trueway.mobile.website.entity.MobileAccessory;
import com.trueway.mobile.website.entity.PlanOffer;
import com.trueway.mobile.website.service.OfferService;
import com.trueway.mobile.website.service.UserService;

@RestController
@RequestMapping({"/truway/mobile"})
public class PlanOfferController {
	
	 @Autowired
	 private OfferService offerService;
	 
	 @GetMapping(path = {"v1/offers"})
	 List<PlanOffer> getActiveOffers(){
		return offerService.getActiveOffers();
		
	}
	 @PostMapping(path = {"/v1/offers"})
	 PlanOffer createPlanOffer(@RequestBody PlanOffer planOffer){
		 return offerService.createPlanOffer(planOffer);
	}
	 @PutMapping(path = {"/v1/offers"})
	 PlanOffer updatePlanOffer(@RequestBody PlanOffer planOffer){
		return offerService.updatePlanOffer(planOffer);
	}
	 @PutMapping(path = "/v1/offers/{offerId}")
	 PlanOffer deletePlanOffer(@RequestBody PlanOffer planOffer){
		 return offerService.disablePlanOffer(planOffer);
	}
}
	