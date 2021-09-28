package com;

import java.util.function.Function;

class MyFunction implements Function<String, String>{
	@Override
	public String apply(String t) {
			return "Welcome user "+t;
	}
}
public class FunctionInterfaceDemo {
	public static void main(String[] args) {
		Function<String,String> f1 = new MyFunction();
		System.out.println(f1.apply("Raj"));
		
		Function<Integer, String> f2 = (n)->"Welcome user using lambd expression "+n;
		System.out.println(f2.apply(10));
	}
}
