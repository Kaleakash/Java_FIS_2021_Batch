package com;

import java.util.HashSet;
class A{}
class B{}
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		int a=10;	//primitive 
		Object b =new Integer(a);	// converting primitive to object. 
		hs.add(b);
		hs.add(20);		//auto-boxing : converting primitive to object. 
		hs.add(100.40);
		hs.add(true);
		hs.add("Raju");
		A obj1 = new A();
		B obj2 = new B();
		hs.add(obj1);
		hs.add(obj2);
		System.out.println(hs);
	}

}
