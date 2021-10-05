package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
Employee emp = (Employee)ac.getBean("employee");
emp.setId(1);
//emp.setName("Raju");
emp.setSalary(5000);
EmployeeService es = (EmployeeService)ac.getBean("employeeService");
//String result= es.storeEmployeeDetails(emp);
//System.out.println(result);
//		es.getEmployeDetails().forEach(e->System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()));
//	String result = es.deleteEmployeeRecord(100);
//	System.out.println(result);
	String result = es.updateEmployeeRecord(emp);
	System.out.println(result);
	}

}
