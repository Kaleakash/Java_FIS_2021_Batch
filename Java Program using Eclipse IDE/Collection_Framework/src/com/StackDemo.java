package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack ss = new Stack();
		System.out.println("Size "+ss.size());
		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(400);
		System.out.println("Size "+ss.size());
		System.out.println(ss);
		System.out.println(" Remove the element using pop "+ss.pop());
		System.out.println(ss);
		System.out.println("Check top most element in stack "+ss.peek());
		System.out.println(ss);
		System.out.println("Search "+ss.search(300));
		System.out.println("Search "+ss.search(400));
	}

}
