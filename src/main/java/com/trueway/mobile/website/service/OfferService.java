package com.trueway.mobile.website.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.trueway.mobile.website.entity.MobileAccessory;
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

	public List<PlanOffer> getActiveOffers() {
		PlanOffer filterBy =  new PlanOffer();
		filterBy.setActive(1);
		ExampleMatcher matcher = ExampleMatcher.matching()
				.withIgnorePaths("valuePerc", "valueFixed");
		Example<PlanOffer> example = Example.of(filterBy,matcher);
		return offerRepository.findAll(example);
	}

	public PlanOffer createPlanOffer(PlanOffer planOffer) {
		planOffer.setActive(1);
		return offerRepository.saveAndFlush(planOffer);
	}
	public PlanOffer disablePlanOffer(PlanOffer planOffer) {
		planOffer.setActive(0);
		return offerRepository.saveAndFlush(planOffer);
		
	}

	public PlanOffer updatePlanOffer(PlanOffer planOffer) {
		return offerRepository.saveAndFlush(planOffer);
	}

}
