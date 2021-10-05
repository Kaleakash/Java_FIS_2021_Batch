package com.service;

import java.util.List;

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
	
	public List<Employee> getEmployeDetails() {
		return employeeDao.getAllEmloyeeDetails();
	}
	
	
	public String deleteEmployeeRecord(int id) {
		if(employeeDao.deleteEmployeeUsingId(id)>0) {
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
	}
	
	public String updateEmployeeRecord(Employee emp) {
		if(employeeDao.updateEmployee(emp)>0) {
			return "Record updated successfully";
		}else {
			return "REcord not present";
		}
	}
	
}
