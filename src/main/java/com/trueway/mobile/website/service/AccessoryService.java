package com.trueway.mobile.website.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trueway.mobile.website.entity.MobileAccessory;
import com.trueway.mobile.website.repo.AccesssoryRepository;

@Service
public class AccessoryService {
	@Autowired
	private AccesssoryRepository accesssoryRepository;

	public AccesssoryRepository getAccesssoryRepository() {
		return accesssoryRepository;
	}

	public void setAccesssoryRepository(AccesssoryRepository AccesssoryRepository) {
		this.accesssoryRepository = AccesssoryRepository;
	}

	public List<MobileAccessory> getAllAccessories() {
		return accesssoryRepository.findAll();
	}

	public MobileAccessory createMobileAccessory(MobileAccessory mobileAccessory) {
		
		return accesssoryRepository.saveAndFlush(mobileAccessory);
	}

}
