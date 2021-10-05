package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service						// service layer annotation object creation taken care by container. 
public class EmployeeService {		// id = employeeService 

	@Autowired
	EmployeeDao employeeDao;
	
	public String storeEmployeeDetails(Employee emp) {
		
		if(employeeDao.storeEmployee(emp)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
	}
}
