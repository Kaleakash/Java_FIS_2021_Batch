package com;

public class TryWithMultipleCatchBlock {
	public static void main(String[] args) {
		try {
			String msg = "2a";
			int abc[]= {10,20};
			int a = 10/abc[Integer.parseInt(msg)];
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index");
		}catch (Exception e) {
			System.out.println("Generic Exception");
		}
		System.out.println("Finish");
	}
}
