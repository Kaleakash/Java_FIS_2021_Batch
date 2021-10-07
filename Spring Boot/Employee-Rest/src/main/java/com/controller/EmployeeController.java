package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController
public class EmployeeController {

	@GetMapping(value = "allEmployeeInfo",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployeeDetails() {
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee(1, "Raj", 12000));
		listOfEmp.add(new Employee(2, "Ravi", 14000));
		listOfEmp.add(new Employee(3, "Ramesh", 18000));
		listOfEmp.add(new Employee(4, "Raju", 22000));
		return listOfEmp;
	}
}
