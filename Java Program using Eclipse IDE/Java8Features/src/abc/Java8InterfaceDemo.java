package abc;
interface A {
		void dis1();
		default void dis2() {
			System.out.println("This is default dis2 method");
		}
		default void dis3() {
			System.out.println("This is default dis3 method");
		}
		static void dis4() {
			System.out.println("This is static interface method");
		}
}
class B implements A {
	public void dis1() {
		System.out.println("A interface method ");
	}
	public void dis3() {
		System.out.println("B class override dis3 default method");
	}	
	// B class own method consider 
	
	static void dis4() {
		System.out.println("This is static interface method By B class");
	}
}
public class Java8InterfaceDemo {
	public static void main(String[] args) {
		B obj1 = new B();
		obj1.dis1();
		obj1.dis2();
		obj1.dis3();
		A.dis4();			// calling static method from interfaces
	}

}
