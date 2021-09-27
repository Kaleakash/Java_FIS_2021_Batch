package com;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		System.out.println("Size "+hs.size());
		System.out.println("Empty "+hs.isEmpty());
		hs.add(30);
		hs.add(10);
		hs.add(40);
		hs.add(70);
		hs.add(60);
		hs.add(90);
		System.out.println(hs);
		System.out.println("Size "+hs.size());
		System.out.println("Empty "+hs.isEmpty());
		System.out.println("Contains "+hs.contains(20));
		System.out.println("Contains "+hs.contains(30));
		System.out.println("Remove "+hs.remove(30));
		System.out.println("Remove "+hs.remove(100));
		hs.clear();
		System.out.println("Size "+hs.size());
		System.out.println("Empty "+hs.isEmpty());
	}

}
