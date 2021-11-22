package day33;

import java.awt.desktop.ScreenSleepEvent;

public class Pig implements Runnable{

	void sound_pig() {
		System.out.println("²Ü~²Ü!");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <10; i++) {
			sound_pig();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
