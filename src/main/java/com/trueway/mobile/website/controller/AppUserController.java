package com.trueway.mobile.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trueway.mobile.website.entity.AppUser;
import com.trueway.mobile.website.service.UserService;

@RestController
@RequestMapping({"/truway/mobile"})
public class AppUserController {
	 @Autowired
	 private UserService service;
	 
	 @GetMapping(path = {"v1/users"})
	 List<AppUser> getActiveAppUsers(){
		return service.getActiveAppUsers();
		
	}
	 @PostMapping(path = {"/v1/users"})
	 AppUser createAppUser(@RequestBody AppUser appUser){
		 return service.createAppUser(appUser);
	}
	 @PostMapping(path = {"/v1/users/auth/{login}"})
	 AppUser getAppUserByLogin(@RequestBody String login){
		 return service.find(login);
	}
	 @PutMapping(path = {"/v1/users"})
	 AppUser updateAppUser(@RequestBody AppUser appUser){
		return service.updateAppUser(appUser);
	}
	 @PutMapping(path = "/v1/users/{userId}")
	 AppUser deleteAppUser(@RequestBody AppUser appUser){
		 return service.disableAppUser(appUser);
	}
}
	