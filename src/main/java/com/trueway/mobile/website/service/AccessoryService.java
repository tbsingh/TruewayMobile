package com.trueway.mobile.website.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trueway.mobile.website.entity.MobileAccessory;
import com.trueway.mobile.website.repo.AccessoryRepository;

@Service
public class AccessoryService {
	
	@Autowired
	private AccessoryRepository accessoryRepository;

	public AccessoryRepository getAccesssoryRepository() {
		return accessoryRepository;
	}

	public void setAccesssoryRepository(AccessoryRepository accesssoryRepository) {
		this.accessoryRepository = accesssoryRepository;
	}

	public List<MobileAccessory> getAllAccessories() {
		return accessoryRepository.findAll();
	}

	public MobileAccessory createMobileAccessory(MobileAccessory mobileAccessory) {
		
		return accessoryRepository.saveAndFlush(mobileAccessory);
	}

}
