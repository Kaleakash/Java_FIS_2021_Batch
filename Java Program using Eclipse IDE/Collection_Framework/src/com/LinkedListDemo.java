package com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		ll.add(1, 200);
		System.out.println(ll);
		ll.addFirst(100);
		ll.addLast(200);
		System.out.println(ll);
	}
}
