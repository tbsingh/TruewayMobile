package com.trueway.mobile.website.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.trueway.mobile.website.entity.AppUser;
import com.trueway.mobile.website.entity.MobilePlan;
import com.trueway.mobile.website.repo.AppUserRepository;
import com.trueway.mobile.website.repo.PlanRepository;

@Service
public class UserService {
	@Autowired
	private AppUserRepository repository;

	public List<AppUser> getActiveAppUsers() {
		AppUser filterBy = new AppUser();
		ExampleMatcher matcher = ExampleMatcher.matching()
				.withIgnorePaths("login");
		filterBy.setActive(true);
		Example<AppUser> example = Example.of(filterBy,matcher);
		List<AppUser> users = repository.findAll(example);
		return users;
	}

	public AppUser createAppUser(AppUser appUser) {
		appUser.setActive(true);
		return repository.saveAndFlush(appUser);
	}

	public AppUser updateAppUser(AppUser appUser) {
		return repository.saveAndFlush(appUser);
	}
	
	public AppUser disableAppUser(AppUser appUser) {
		appUser.setActive(false);
		return repository.saveAndFlush(appUser);
	}

	public AppUserRepository getRepository() {
		return repository;
	}

	public void setRepository(AppUserRepository repository) {
		this.repository = repository;
	}

	public AppUser find(String login) {
		AppUser filterBy = new AppUser();
		filterBy.setLogin(login);
		Example<AppUser> example = Example.of(filterBy);
		Optional<AppUser> result = repository.findOne(example);
		return result.orElse(null);
	}

}
