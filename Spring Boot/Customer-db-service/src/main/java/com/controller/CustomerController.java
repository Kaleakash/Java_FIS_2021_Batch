package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Customer;
import com.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@PostMapping(value = "storeCustomer",
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeCustomer(@RequestBody Customer customer) {
		return customerService.storeCustomerInfo(customer);
	}
	
	@GetMapping(value = "allCustomers",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}
}
