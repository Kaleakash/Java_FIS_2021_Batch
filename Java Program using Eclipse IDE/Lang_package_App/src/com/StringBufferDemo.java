package com;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Raj");
		System.out.println(sb);
		System.out.println(sb.append(" Deep"));
		sb.reverse();
		System.out.println(sb);
	}

}
