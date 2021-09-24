package booking;
class Booking implements Runnable{
	int avl=1;
	@Override
	public synchronized void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if(avl==1) {
			System.out.println(name +" got the ticket");
			avl = avl-1;
		}else {
			System.out.println(name +" no ticket");
		}
	}
}
public class Test {
	public static void main(String[] args) {
		Runnable obj1 = new Booking();				//Runnable obj2 = new Booking();
		Thread t1 = new Thread(obj1);					Thread t2 = new Thread(obj1);
		t1.setName("Raj");				t2.setName("Seeta");
		t1.start();			  					t2.start();			
	}
}



