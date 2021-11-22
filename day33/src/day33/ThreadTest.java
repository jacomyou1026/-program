package day33;

public class ThreadTest {
	public static void main(String[] args) {
		//Thread 클래스
		Thread1 th1 = new Thread1("♣");
		Thread1 th2 = new Thread1("▼");
		
		//Runnable 인터페이스
		Thread2 t1 = new Thread2("▲");
		Thread2 t2 = new Thread2("▼");
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		
		//th1.start();
		//th2.start();
		
		thread1.start();
		thread2.start();
		
		
	}
}
