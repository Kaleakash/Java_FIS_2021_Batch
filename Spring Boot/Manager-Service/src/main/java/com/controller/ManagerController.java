package com.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bean.Customer;

@RestController
public class ManagerController {

	@Autowired
	RestTemplate restTemplate;			// pull the RestTemplate reference from restTemplate method with @Bean annotation 
	
	// http://localhost:9494/callCustomerService 
	
	@GetMapping(value = "callCustomerService")
	public List<Customer> callCustomerInformation() {
		List<Customer> list  = restTemplate.getForObject("http://customer-client:9393/allCustomers", List.class);
		//List<Customer> listInformation = (List<Customer>)list;
				
		return list;
	}
}
