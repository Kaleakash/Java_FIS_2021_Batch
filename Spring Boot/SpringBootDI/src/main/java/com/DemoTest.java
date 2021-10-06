package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoTest {
	public static void main(String[] args) {
		SpringApplication.run(DemoTest.class, args);
		System.out.println("Spring boot is ready");
		// This class is use to pull the object from a container 
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.scan("com");	//<context:component-scan base-package="com"></context:component-scan> in xml file 
		ac.refresh();
		Employee emp = (Employee)ac.getBean("employee");
		System.out.println(emp);
	}

}
