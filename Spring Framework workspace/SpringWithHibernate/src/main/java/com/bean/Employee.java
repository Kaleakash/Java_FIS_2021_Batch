package com.bean;

import javax.persistence.Entity;		// import package as javax.persistence 
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Employee {
@Id						// column which is primary key
private int id;
private String name;
private float salary;
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

}
