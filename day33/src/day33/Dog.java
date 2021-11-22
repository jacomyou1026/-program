package day33;

public class Dog implements Runnable {

	void sound_dog() {
		System.out.println("¸Û ¸Û");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <10; i++) {
			sound_dog();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
