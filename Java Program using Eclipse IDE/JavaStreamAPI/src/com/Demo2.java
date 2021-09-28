package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Raj");names.add("Raju");names.add("Mahesh");names.add("Laximan");
		names.add("Ajay");names.add("Veeta");names.add("Lokesh");names.add("Ram");
		names.add("Vijay");names.add("Reeta");names.add("Kishor");names.add("Anand");		
//		Stream<String> ss = names.stream();
//		ss.forEach(v->System.out.println(v));
//		//ss.forEach(v->System.out.println(v));
		//names.stream().forEach(v->System.out.println(v));
		//names.stream().map(name->name.toUpperCase()).forEach(v->System.out.println(v));
		//long ll = names.stream().filter(v->v.contains("e")).count();
		//System.out.println("Number of names contains e character "+ll);
		Optional<String>  op = names.stream().filter(v->v.startsWith("R")).findFirst();
		if(op.isPresent()) {
			System.out.println("yes");
		}
	}

}
