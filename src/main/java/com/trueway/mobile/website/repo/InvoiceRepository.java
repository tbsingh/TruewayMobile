package com.trueway.mobile.website.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trueway.mobile.website.entity.Invoice;
import com.trueway.mobile.website.entity.MobileAccessory;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
