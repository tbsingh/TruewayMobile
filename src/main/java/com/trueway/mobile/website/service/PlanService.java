package com.trueway.mobile.website.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	public List<MobilePlan> getAllMobilePlans() {
		List<MobilePlan> plans = planRepository.findAll();
		return plans;
	}

	public MobilePlan createMobilePlan(MobilePlan mobilePlan) {
		
		return planRepository.saveAndFlush(mobilePlan);
	}

	public MobilePlan updateMobilePlan(MobilePlan mobilePlan) {
		return planRepository.saveAndFlush(mobilePlan);
	}

}
