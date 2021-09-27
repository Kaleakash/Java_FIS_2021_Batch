package com;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(2, "Ravi");
		hm.put(3, "Ramesh");
		hm.put(1,"Lokesh");
		hm.put(4,"Ajay");
		System.out.println(hm);
		hm.put(1,"Balaji");		// value replace by default. 
		hm.put(6, "Ramesh");
		hm.put("abc", "xyz");
		hm.put(null,null);
		System.out.println(hm);
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue("Balaji"));
		System.out.println(hm.get(2));
	}

}
