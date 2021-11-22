package day33;

public class Duck implements Runnable{
	void sound_duck() {
		System.out.println("²Ð²Ð");
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			sound_duck();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


