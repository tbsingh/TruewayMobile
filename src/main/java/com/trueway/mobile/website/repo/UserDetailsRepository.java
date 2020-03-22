package com.trueway.mobile.website.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trueway.mobile.website.entity.AppUser;

@Repository
public interface UserDetailsRepository  extends JpaRepository<AppUser, Long>{

	AppUser findByName(String name);
	AppUser findByLogin(String login);
}
