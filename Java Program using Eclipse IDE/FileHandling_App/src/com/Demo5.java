package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo5 {

	public static void main(String[] args) throws Exception{
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("Enter the name");
		String name = br.readLine();
		System.out.println("Enter the id");
		int id = Integer.parseInt(br.readLine());	// string to integer 
		System.out.println(" id is "+id);
		System.out.println("name is "+name);
	}

}
