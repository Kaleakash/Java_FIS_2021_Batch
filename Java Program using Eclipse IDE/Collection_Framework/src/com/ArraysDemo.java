package com;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int num[]= {2,4,1,7,9,6,5,3};
		System.out.println("Before sort");
		for(int n:num) {
			System.out.print(n+" ");
		}
		Arrays.sort(num);
		System.out.println();
		System.out.println("After sort");
		for(int n:num) {
			System.out.print(n+" ");
		}
	}
}
