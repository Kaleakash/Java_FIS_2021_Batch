package com;

public class StringDemo {

	public static void main(String[] args) {
//	String str1 = "Welcome to Java Training";
//	String str2 = new String("Welcome to Java Training");
//	System.out.println(str1);
//	System.out.println(str2);
//	System.out.println(str1.toLowerCase());
//	System.out.println(str2.toLowerCase());
//	System.out.println(str1.toUpperCase());
//	System.out.println(str1.substring(6));
		// 3 object created...
//		String name1 = "Raj";		
//		String name2 = "Raj";				// both one memory 
//		String name3 = new String("Raj");	// separate memory 
//		String name4 =new String("Raj");		// separate memory 
//		if(name1.equals(name4)) {
//			System.out.println("Equal");
//		}else {
//			System.out.println("Not Equal");
//		}
		
		String name = "Raj";
		System.out.println(name);
		name = name+" Deep";
		System.out.println(name);
		System.out.println(name.toLowerCase());
		System.out.println(name);
	}

}
