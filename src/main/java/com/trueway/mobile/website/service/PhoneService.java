package com.trueway.mobile.website.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trueway.mobile.website.entity.MobilePhone;
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

	public List<MobilePhone> getAllMobilePhones() {
		return phoneRepository.findAll();
	}

	public MobilePhone createMobilePhone(MobilePhone mobilePhone) {
		
		return phoneRepository.saveAndFlush(mobilePhone);
	}

}
