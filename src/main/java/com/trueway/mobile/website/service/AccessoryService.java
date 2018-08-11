package com.trueway.mobile.website.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.trueway.mobile.website.entity.MobileAccessory;
import com.trueway.mobile.website.entity.MobilePhone;
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

	public List<MobileAccessory> getActiveAccessories() {
		MobileAccessory filterBy =  new MobileAccessory();
		filterBy.setActive(1);
		ExampleMatcher matcher = ExampleMatcher.matching()
				.withIgnorePaths("price");
		Example<MobileAccessory> example = Example.of(filterBy,matcher);
		return accessoryRepository.findAll(example);
	}

	public MobileAccessory createMobileAccessory(MobileAccessory mobileAccessory) {
		mobileAccessory.setActive(1);
		return accessoryRepository.saveAndFlush(mobileAccessory);
	}

	public MobileAccessory disableMobileAccessory(MobileAccessory mobileAccessory) {
		mobileAccessory.setActive(0);
		return accessoryRepository.saveAndFlush(mobileAccessory);
		
	}

	public MobileAccessory updateMobileAccessopry(MobileAccessory mobileAccessory) {
		return accessoryRepository.saveAndFlush(mobileAccessory);
	}

}
