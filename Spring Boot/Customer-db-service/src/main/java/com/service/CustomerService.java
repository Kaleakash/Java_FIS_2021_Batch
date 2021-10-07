package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Customer;
import com.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public String storeCustomerInfo(Customer cc) {
		if(customerRepository.existsById(cc.getCid())) {
			return "Record didn't store Id must be uique";
		}else {
			customerRepository.save(cc);
			return "Record stored successfully";
		}
		
	}
}
