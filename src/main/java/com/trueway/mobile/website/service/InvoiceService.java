package com.trueway.mobile.website.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.trueway.mobile.website.entity.Invoice;
import com.trueway.mobile.website.repo.InvoiceRepository;

@Service
public class InvoiceService {
	@Autowired
	private InvoiceRepository repository;

	public List<Invoice> getActiveInvoices() {
		Invoice filterBy = new Invoice();
		ExampleMatcher matcher = ExampleMatcher.matching()
				.withIgnorePaths("login");
		filterBy.setActive(true);
		Example<Invoice> example = Example.of(filterBy,matcher);
		List<Invoice> users = repository.findAll(example);
		return users;
	}

	public Invoice createInvoice(Invoice appUser) {
		appUser.setActive(true);
		return repository.saveAndFlush(appUser);
	}

	public Invoice updateInvoice(Invoice appUser) {
		return repository.saveAndFlush(appUser);
	}
	
	public Invoice disableInvoice(Invoice appUser) {
		appUser.setActive(false);
		return repository.saveAndFlush(appUser);
	}

	public InvoiceRepository getRepository() {
		return repository;
	}

	public void setRepository(InvoiceRepository repository) {
		this.repository = repository;
	}

	public Invoice find(Long id) {
		Invoice filterBy = new Invoice();
		filterBy.setId(id);
		Example<Invoice> example = Example.of(filterBy);
		Optional<Invoice> result = repository.findOne(example);
		return result.orElse(null);
	}

}
