package com;
class Outer {
		int a;
		void dis1() {
			System.out.println("This is dis1 method");
		}
		class Inner {
			void dis2() {
				System.out.println("This is dis2 method part of inner class");
			}
		}
		static class SInner {
			void dis3() {
				System.out.println("This is dis3 method part of static inner class");
			}
		}
}
public class InnerClassTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.dis1();
		Outer.Inner in2 = out.new Inner();					// syntax to create the inner class object 
		Outer.Inner in = new Outer().new Inner();	// syntext to create the inner class object  
		in.dis2();
		Outer.SInner in1 = new Outer.SInner();				// syntax to create static inner class object 
		in1.dis3();
	}

}
