package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
//Employee emp = new Employee();
//emp.display();
		// ApplicationContext is a interface and ClassPathXmlApplicationContext is use to 
		// load the beans.xml file 
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee)ac.getBean("emp1");		//pull the object from a container container is part of jar and configuration in xml file
		//emp.display();
//		System.out.println(emp);				// toString()
//		Employee emp1 = (Employee)ac.getBean("emp1");
//		emp1.display();
//		Employee emp2 = (Employee)ac.getBean("emp2");
//		emp2.display();
//		Employee emp3 = (Employee)ac.getBean("emp2");
//		emp3.display();
//		
//		
//		Employee e3 = (Employee)ac.getBean("emp3");		// setter base 
//		Employee e4 = (Employee)ac.getBean("emp4");		// parameter constructor base 
//		System.out.println(e3);
//		System.out.println(e4);
		Employee employee = (Employee)ac.getBean("employee");
		System.out.println(employee);
	}

}
