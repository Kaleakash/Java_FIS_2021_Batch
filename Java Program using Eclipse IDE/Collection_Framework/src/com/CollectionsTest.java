package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		List<String> listOfNames = new ArrayList<>();
		listOfNames.add("Mahesh");
		listOfNames.add("Rajesh");
		listOfNames.add("Vikash");
		listOfNames.add("Raj");
		listOfNames.add("Ajay");
		System.out.println("Before Sort");
		for(String name : listOfNames) {
			System.out.print(name+" ");
		}
		Collections.sort(listOfNames);
		System.out.println();
		System.out.println("After Sort");
		for(String name : listOfNames) {
			System.out.print(name+" ");
		}
		Collections.reverse(listOfNames);
		System.out.println();
		for(String name : listOfNames) {
			System.out.print(name+" ");
		}
	}

}
