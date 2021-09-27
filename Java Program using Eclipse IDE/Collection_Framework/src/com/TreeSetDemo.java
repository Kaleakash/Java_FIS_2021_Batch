package com;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(30);
		ts.add(10);
		ts.add(20);
		ts.add(40);
		ts.add(50);
		//ts.add(10.10);
		System.out.println(ts);
		System.out.println(ts.tailSet(30));
		System.out.println(ts.headSet(30));
	}
}
