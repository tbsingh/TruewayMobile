package com.trueway.mobile.website.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trueway.mobile.website.entity.MobileAccessory;

@Repository
public interface AccesssoryRepository extends JpaRepository<MobileAccessory, Long> {
}
