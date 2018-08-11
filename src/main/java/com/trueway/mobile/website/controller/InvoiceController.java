package com.trueway.mobile.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trueway.mobile.website.entity.Invoice;
import com.trueway.mobile.website.service.InvoiceService;

@RestController
@RequestMapping({"/truway/mobile"})
public class InvoiceController {
	 @Autowired
	 private InvoiceService service;
	 
	 @GetMapping(path = {"v1/invoices"})
	 List<Invoice> getActiveInvoices(){
		return service.getActiveInvoices();
	}
	 @PostMapping(path = {"/v1/invoices"})
	 Invoice createInvoice(@RequestBody Invoice invoice){
		return service.createInvoice(invoice);
	}
	 @PutMapping(path = {"/v1/invoices"})
	 Invoice updateInvoice(@RequestBody Invoice invoice){
		return service.updateInvoice(invoice);
	}
	 @PutMapping(path = "/v1/invoices/{invoiceId}")
	 Invoice deleteInvoice(@RequestBody Invoice invoice){
		 return service.disableInvoice(invoice);
	}
}
	