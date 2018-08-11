package com.trueway.mobile.website.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.trueway.mobile.website.entity.MobilePhone;
import com.trueway.mobile.website.entity.MobilePlan;
import com.trueway.mobile.website.repo.PhoneRepository;

@Service
public class PhoneService {
	@Autowired
	private PhoneRepository phoneRepository;

	public PhoneRepository getPhoneRepository() {
		return phoneRepository;
	}

	public void setPhoneRepository(PhoneRepository phoneRepository) {
		this.phoneRepository = phoneRepository;
	}

	public List<MobilePhone> getActiveMobilePhones() {
		MobilePhone filterBy =  new MobilePhone();
		filterBy.setActive(1);
		ExampleMatcher matcher = ExampleMatcher.matching()
				.withIgnorePaths("price");
		Example<MobilePhone> example = Example.of(filterBy,matcher);
		return phoneRepository.findAll(example);
	}

	public MobilePhone createMobilePhone(MobilePhone mobilePhone) {
		mobilePhone.setActive(1);
		return phoneRepository.saveAndFlush(mobilePhone);
	}
	public MobilePhone updateMobilePhone(MobilePhone mobilePhone) {
		return phoneRepository.saveAndFlush(mobilePhone);
	}
	public MobilePhone disableMobilePlan(MobilePhone mobilePhone) {
		mobilePhone.setActive(0);
		return phoneRepository.saveAndFlush(mobilePhone);
	}
}
