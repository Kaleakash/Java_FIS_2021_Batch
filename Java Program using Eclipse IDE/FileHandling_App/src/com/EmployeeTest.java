package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
		Employee emp = new Employee(100, "Raj", 12000);
		emp.display();
		FileOutputStream fos = new FileOutputStream("emp.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		System.out.println(" Object Serialization done successfully");
		
//		FileInputStream fis = new FileInputStream("emp.ser");
//		ObjectInputStream ois= new ObjectInputStream(fis);
//		Object obj= ois.readObject();
//		Employee emp1 = (Employee)obj;
//		emp1.display();
//		System.out.println("Object De-Serialization done successfully");
	}

}
