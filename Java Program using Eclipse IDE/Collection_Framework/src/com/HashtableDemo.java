package com;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(3, "Ramesh");
		ht.put(1, "Raj");
		ht.put(2, "Raju");
		ht.put(4, "Ravi");
		ht.put("a", "b");
		//ht.put(null,"a");
		//ht.put(5, null);
		System.out.println(ht);
	}

}
