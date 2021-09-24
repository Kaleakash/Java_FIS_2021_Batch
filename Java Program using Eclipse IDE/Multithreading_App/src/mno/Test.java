package mno;
class A implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int i=0;i<10;i++) {
			System.out.println(name+"="+i);
			try {
				Thread.sleep(500);	
			}catch(Exception e) {}
		}
	}
}
class B implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int j=0;j<10;j++) {
			System.out.println(name+"="+j);
			try {
				Thread.sleep(1000);	
			}catch(Exception e) {}			
		}
	}
}
public class Test {
	public static void main(String[] args) {
		Runnable obj1 = new A();		// obj1.start();
		Runnable obj2 = new B();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.setName("Demo1");
		t2.setName("Demo2");
		t1.start();			// A class override run method  
		t2.start();			// B class override run method 
	}
}


