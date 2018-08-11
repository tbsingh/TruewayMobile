package com.trueway.mobile.website.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.trueway.mobile.website.entity.Customer;
import com.trueway.mobile.website.repo.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repository;

	public List<Customer> getActiveCustomers() {
		Customer filterBy = new Customer();
		ExampleMatcher matcher = ExampleMatcher.matching();
		filterBy.setActive(true);
		Example<Customer> example = Example.of(filterBy,matcher);
		List<Customer> customers = repository.findAll(example);
		return customers;
	}

	public Customer createCustomer(Customer appCustomer) {
		appCustomer.setActive(true);
		return repository.saveAndFlush(appCustomer);
	}

	public Customer updateCustomer(Customer appCustomer) {
		return repository.saveAndFlush(appCustomer);
	}
	
	public Customer disableCustomer(Customer appCustomer) {
		appCustomer.setActive(false);
		return repository.saveAndFlush(appCustomer);
	}

	public CustomerRepository getRepository() {
		return repository;
	}

	public void setRepository(CustomerRepository repository) {
		this.repository = repository;
	}

	public Customer find(String login) {
		Customer filterBy = new Customer();
		//filterBy.setLogin(login);
		Example<Customer> example = Example.of(filterBy);
		Optional<Customer> result = repository.findOne(example);
		return result.orElse(null);
	}

}
