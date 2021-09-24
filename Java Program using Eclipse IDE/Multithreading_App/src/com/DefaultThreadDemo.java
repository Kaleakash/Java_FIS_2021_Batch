package com;

public class DefaultThreadDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("Demo Thread");
		t.setPriority(1);
		System.out.println(t);
	}

}
