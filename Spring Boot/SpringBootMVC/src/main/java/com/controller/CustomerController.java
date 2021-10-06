package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Customer;
import com.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	// http://localhost:9090/allCustomers
	
	@RequestMapping(value = "allCustomers",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomerDetailsInfo();
	}
	
	@RequestMapping(value = "storeCustomer",
		consumes = MediaType.APPLICATION_JSON_VALUE,
		method = RequestMethod.POST,
		produces = MediaType.TEXT_PLAIN_VALUE)
	public String storeCustomerInfo(@RequestBody Customer cust) {
		return customerService.storeCustomer(cust);
	}
	

	@RequestMapping(value = "deleteCustomer/{cid}",method = RequestMethod.DELETE)
	public String deleteCustomerInfo(@PathVariable("cid") int cid) {
		return customerService.deleteCustomerInfo(cid);
	}
	@RequestMapping(value = "updateCustomer",
			method = RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateCustomerInfo(@RequestBody Customer cust) {
		return customerService.updateCustomerInfo(cust);
	}
	
	@RequestMapping(value = "searchCustomerById/{cid}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer findCustomer(@PathVariable("cid") int cid) {
		return customerService.findCustomerById(cid);
	}
}
