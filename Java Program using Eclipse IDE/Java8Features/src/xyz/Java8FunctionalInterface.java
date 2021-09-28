package xyz;
@FunctionalInterface
interface A {
	void dis1();
	//void dis2();
	default void dis3() {}
	static void dis4() {}
}
public class Java8FunctionalInterface {

	public static void main(String[] args) {
		
	}

}
