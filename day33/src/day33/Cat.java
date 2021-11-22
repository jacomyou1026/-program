package day33;

public class Cat implements Runnable{

	void sound_cat() {
		System.out.println("¾ß¿Ë");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <10; i++) {
			sound_cat();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
