package com.trueway.mobile.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trueway.mobile.website.entity.Customer;
import com.trueway.mobile.website.service.CustomerService;

@RestController
@RequestMapping({"/truway/mobile"})
public class CustomerController {
	 @Autowired
	 private CustomerService service;
	 
	 @GetMapping(path = {"v1/customers"})
	 List<Customer> getActiveCustomers(){
		return service.getActiveCustomers();
		
	}
	 @PostMapping(path = {"/v1/customers"})
	 Customer createCustomer(@RequestBody Customer appCustomer){
		 return service.createCustomer(appCustomer);
	}
	 @PostMapping(path = {"/v1/customers/auth/{login}"})
	 Customer getCustomerByLogin(@RequestBody String login){
		 return service.find(login);
	}
	 @PutMapping(path = {"/v1/customers"})
	 Customer updateCustomer(@RequestBody Customer appCustomer){
		return service.updateCustomer(appCustomer);
	}
	 @PutMapping(path = "/v1/customers/{customerId}")
	 Customer deleteCustomer(@RequestBody Customer appCustomer){
		 return service.disableCustomer(appCustomer);
	}
}
	