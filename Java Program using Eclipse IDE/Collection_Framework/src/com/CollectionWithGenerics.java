package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics {

	public static void main(String[] args) {
		// Collection Framework without generics 
//		List ll = new ArrayList();
//		ll.add(100);
//		ll.add("Raj");
//		ll.add(100.20);
//		
//		Object obj  = ll.get(1);
//		if(obj instanceof Integer) {
//			Integer i  = (Integer)obj;
//			int n = i.intValue();
//			System.out.println(n);	
//		}else if(obj instanceof String) {
//			String name = (String)obj;
//			System.out.println(name);
//		}
		// Collection framework with generics 
		// CollectionClass <Type>obj = new CollectionClass<Type>();
		// Type : Integer, Float, Character, String, User-defined class object 
		List<Integer> ll = new ArrayList<>();
		ll.add(10);			// auto-boxing : primitve to object 
		ll.add(20);
		ll.add(30);
		
		int n =ll.get(0);		// auto-unboxing : converting Integer object to primitve 
		System.out.println(n);
	}

}
