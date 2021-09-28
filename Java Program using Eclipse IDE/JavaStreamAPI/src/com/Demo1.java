package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
//class MyConsumer implements Consumer<String>{
//	@Override
//	public void accept(String t) {
//		System.out.println(t);
//	}
//}
public class Demo1 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Raj");names.add("Raju");names.add("Mahesh");names.add("Laximan");
		names.add("Ajay");names.add("Veeta");names.add("Lokesh");names.add("Ram");
		names.add("Vijay");names.add("Reeta");names.add("Kishor");names.add("Anand");
		System.out.println("Display using forEach Java8 function with lambda");
		//Consumer<String> cc = new MyConsumer();
		//names.forEach(cc);
		names.forEach((v)->System.out.println(v));
	}
}


