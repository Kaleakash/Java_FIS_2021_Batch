package com;
interface A {
	void dis1();
}
class B implements A {
	public void dis1() {
		System.out.println(" A interface method");
	}
}
public class AnonymousInnerClass {
	public static void main(String[] args) {
		A obj1 = new B();
		obj1.dis1();
		A obj2  = new A() {
			public void dis1() {
				System.out.println("This is interfaced metthod override by anonymous class");
			}
		};
		obj2.dis1();
		A obj3 = new A() {
			public void dis1() {
				System.out.println("This is interface method override by anonyous inner class with different impl");
			}
		};
		obj3.dis1();
		
		A obj4 = ()->System.out.println("This is a lambda expression");
		
		obj4.dis1();
	}



}
