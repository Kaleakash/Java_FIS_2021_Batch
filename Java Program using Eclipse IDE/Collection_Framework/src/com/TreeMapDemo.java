package com;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(2, "Ravi");
		tm.put(1, "Raju");
		tm.put(4, "Raj");
		tm.put(3, "Rajesh");
		tm.put(6, "xyz");
		//tm.put(null, "Abc");
		tm.put(7,null);
		tm.put(8, "");
		System.out.println(tm);
	}

}
