package com.trueway.mobile.website.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trueway.mobile.website.entity.PlanOffer;
import com.trueway.mobile.website.repo.OfferRepository;

@Service
public class OfferService {
	@Autowired
	private OfferRepository offerRepository;

	public OfferRepository getOfferRepository() {
		return offerRepository;
	}

	public void setOfferRepository(OfferRepository offerRepository) {
		this.offerRepository = offerRepository;
	}

	public List<PlanOffer> getAllOffers() {
		return offerRepository.findAll();
	}

	public PlanOffer createPlanOffer(PlanOffer planOffer) {
		
		return offerRepository.saveAndFlush(planOffer);
	}

}
