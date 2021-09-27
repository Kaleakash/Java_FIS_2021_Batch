package com;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Raj");
		al.add(true);
		System.out.println(al);
		al.add(1,10.10);
		System.out.println(al);
		al.set(2, "Raj Deep");
		System.out.println(al);
		int a=10;
		Integer i = 10;		// auto-boxing
		al.remove(i);		// using value 
		System.out.println(al);
		al.remove(0);		// using index position 
		System.out.println(al);	
	}

}
