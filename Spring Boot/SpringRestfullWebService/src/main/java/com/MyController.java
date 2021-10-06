package com;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
	// produce the data in spring format
	// http://localhost:9090/sayHello
	
	@RequestMapping(value = "sayHello")
	public String sayHello() {
		return "Welcome to Spring boot Simple RESTfull web application";
	}
	// http://localhost:9090/html 
	@RequestMapping(value = "html",produces = MediaType.TEXT_HTML_VALUE)
	public String sayHtmlMsg() {
			return "<h2>Welcome to Simple HTML Message</h2>";
	}
	// http://localhost:9090/xml
	@RequestMapping(value = "xml",produces = MediaType.TEXT_XML_VALUE)
	public String sayXmlMsg() {
			return "<abc>Welcome to Simple HTML Message</abc>";
	}	
	// http://localhost:9090/text 
	@RequestMapping(value = "text",produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayHtmlPlainText() {
			return "<h2>Welcome to Simple HTML Message<h2>";
	}
	
	// http://localhost:9090/empInfo 
	@RequestMapping(value = "empInfo",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Raj");
		emp.setSalary(12000);
		return emp;
	}
	// http://localhost:9090/employees 
		
	@RequestMapping(value = "employees",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployeeInfo() {
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee(100, "Raj", 12000));
		listOfEmp.add(new Employee(101, "Ravi", 15000));
		listOfEmp.add(new Employee(102, "Ramesh", 18000));
		listOfEmp.add(new Employee(103, "Rajesh", 20000));
		return listOfEmp;
	}
	
	// http://localhost:9090/info?name=Raj
	@RequestMapping(value = "info")
	public String greetingUser(@RequestParam("name") String name) {
		return "Welcome user "+name;
	}
	
	// http://localhost:9090/path/Raj
	@RequestMapping(value = "path/{name}")
	public String pathParam(@PathVariable("name") String name) {
		return "Welcomer user with path param "+name;
	}
	
}



