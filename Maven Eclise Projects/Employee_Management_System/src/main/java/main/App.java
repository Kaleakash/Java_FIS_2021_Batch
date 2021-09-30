package main;

import java.util.Scanner;

import bean.Employee;
import service.EmployeeService;

public class App {

	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		es.getAllEmployeeDetails().forEach(e->System.out.println(e));
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter the id");
//		int id = obj.nextInt();
//		System.out.println("Enter the name");
//		String name= obj.next();
//		System.out.println("Enter the salary");
//		float salary = obj.nextFloat();
//		Employee emp= new Employee(id, name, salary);
//		String result = es.storeEmployee(emp);
//		System.out.println(result);
	}

}
