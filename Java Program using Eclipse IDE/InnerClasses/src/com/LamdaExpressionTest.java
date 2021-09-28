package com;
interface Operation {
	public int add(int a, int b);
}
public class LamdaExpressionTest {
	public static void main(String[] args) {
		Operation op1 = (int a, int b)->a+b;
		System.out.println(op1.add(10, 20));
		Operation op2 = (int x, int y)->x+y;
		System.out.println(op2.add(1, 2));
		Operation op3 = (a,y)->a+y;
		System.out.println(op3.add(100, 200));
		Operation op4 = (a,b)-> {
					int sum = a+b;
					return sum;
		};
		System.out.println(op4.add(1000, 2000));
		
	}

}
