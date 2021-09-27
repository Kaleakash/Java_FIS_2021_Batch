package com;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//HashSet hs = new HashSet();
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(30);
		hs.add(10);
		hs.add(40);
		hs.add(70);
		hs.add(60);
		hs.add(90);
		System.out.println(hs);
	}

}
