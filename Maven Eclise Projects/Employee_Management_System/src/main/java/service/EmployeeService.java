package service;

import java.util.List;

import bean.Employee;
import dao.EmployeeDao;

public class EmployeeService {
	EmployeeDao employeeDao = new EmployeeDao();
	
	public List<Employee> getAllEmployeeDetails() {
		// add bonus for all employee base upon desgn or exp 
		return employeeDao.rertieveEmployeeDetails();
	}
	
	public String storeEmployee(Employee emp) {
		if(emp.getSalary()<10000) {
			return "Salary must be > 10000";
		}else {
				if(employeeDao.storeEmployeeDetails(emp)>0) {
					return "Record store successfully";
				}else {
					return "Record didn't store";
				}
		}
	}
}
