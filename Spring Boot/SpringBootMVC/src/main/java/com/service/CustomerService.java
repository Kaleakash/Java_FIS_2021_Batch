package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Customer;
import com.dao.CustomerDao;

@Service
public class CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	public List<Customer> getAllCustomerDetailsInfo() {
		return customerDao.getAllCustomerDetails();
	}
	
	public String storeCustomer(Customer cc) {
		if(customerDao.storeCustomerInfo(cc)) {
			return "Record inserted successfully";
		}else {
			return "Failure try once again";
		}
	}
	
	public String deleteCustomerInfo(int cid) {
		if(customerDao.deleteCustomerInfo(cid)) {
			return "Customer record deleted successfully";
		}else {
			return "Customer record didn't delete";
		}
	}
	
	public String updateCustomerInfo(Customer cc) {
		if(customerDao.updateCustomerAge(cc)) {
			return "Customer record updated successfully";
		}else {
			return "Customer information not present";
		}
	}
	
	public Customer findCustomerById(int cid) {
		return customerDao.findCustomerById(cid);
	}
}

