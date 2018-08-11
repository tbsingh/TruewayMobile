package com.trueway.mobile.website.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trueway.mobile.website.entity.AppUser;
import com.trueway.mobile.website.entity.Customer;
import com.trueway.mobile.website.entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}
