package com;

public class Employee {
private int id;
private String name;
private float salary;
private Address add;
	public Employee(int id, String name, float salary) {
	//super();			// to call super class empty constructor ie Object class 
	this.id = id;
	this.name = name;
	this.salary = salary;
}
	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
	public Employee() {
		System.out.println("Object created..");
	}
	public void display() {
		System.out.println("This is simple display method");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
	}
	
	
}
