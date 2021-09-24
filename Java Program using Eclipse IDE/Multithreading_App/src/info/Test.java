package info;


class Abc implements Runnable{
	@Override
	public synchronized void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int i=0;i<10;i++) {
			System.out.println(name+" "+i);
			try {
					Thread.sleep(500);
					if(i==5 && name.equals("Raj")) {
						wait();
					}
					if(i==7 && name.equals("Raju")) {
						notify();
						wait();
					}
			}catch (Exception e) {}
		}
	}
}
public class Test {
	public static void main(String[] args) {
		Abc obj1 = new Abc();
		Thread t1 = new Thread(obj1);	t1.setName("Raj");
		Thread t2 = new Thread(obj1);t2.setName("Raju");
		Thread t3 = new Thread(obj1);t3.setName("Ramesh");
		t1.start(); t2.start(); t3.start();
	}
}



