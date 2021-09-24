package com;

import java.io.Serializable;

public class Employee  implements Serializable{
	private int id;
	private String name;
	private float salary;
	public Employee() {
		
	}
	Employee(int id, String name, float salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void display() {
		System.out.println(" id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
