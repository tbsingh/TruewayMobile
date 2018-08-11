package com.trueway.mobile.website.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.trueway.mobile.website.entity.MobilePlan;
import com.trueway.mobile.website.repo.PlanRepository;

@Service
public class PlanService {
	@Autowired
	private PlanRepository planRepository;

	public PlanRepository getPlanRepository() {
		return planRepository;
	}

	public void setPlanRepository(PlanRepository planRepository) {
		this.planRepository = planRepository;
	}

	public List<MobilePlan> getActiveMobilePlans() {
		MobilePlan filterBy = new MobilePlan();
		ExampleMatcher matcher = ExampleMatcher.matching()
				.withIgnorePaths("price");
		filterBy.setActive(1);
		Example<MobilePlan> example = Example.of(filterBy,matcher);
		List<MobilePlan> plans = planRepository.findAll(example);
		return plans;
	}

	public MobilePlan createMobilePlan(MobilePlan mobilePlan) {
		mobilePlan.setActive(1);
		return planRepository.saveAndFlush(mobilePlan);
	}

	public MobilePlan updateMobilePlan(MobilePlan mobilePlan) {
		return planRepository.saveAndFlush(mobilePlan);
	}
	
	public MobilePlan disableMobilePlan(MobilePlan mobilePlan) {
		mobilePlan.setActive(0);
		return planRepository.saveAndFlush(mobilePlan);
	}

	public void deleteMobilePlan(long planId) {
		planRepository.deleteById(planId);;
	}

}
