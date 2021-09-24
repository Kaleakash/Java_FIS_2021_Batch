package com;

public class Test {

	public static void main(String[] args) {
		bean.Employee emp1 = new bean.Employee();
		emp1.setId(100);
		emp1.setName("Raj");
		emp1.setSalary(12000);
		
		bean.Employee emp2 = new bean.Employee(101, "Ramesh", 14000);
		
		System.out.println(" id is "+emp1.getId());
		System.out.println("name is "+emp1.getName());
		System.out.println("salary is "+emp1.getSalary());
		System.out.println(emp2);		// internally it call toString() of Object class. 
	}

}
