package day36;

import java.awt.Color;
import java.awt.Container;
import java.io.IOException;
import java.nio.CharBuffer;
import java.text.SimpleDateFormat;
import java.util.Random;

import javax.swing.JFrame;

public class WindowTest5 extends JFrame implements Runnable {
	public WindowTest5() {
		this("제목없음");
	}
	
	public WindowTest5(String title) {
		Color[] arColor = {
			Color.black,Color.CYAN,Color.pink,	Color.gray,Color.DARK_GRAY
		};
		setTitle(title);
		setBounds(1200	, 200, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setBackground(arColor[new Random().nextInt(5)]);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		WindowTest5 window= new WindowTest5("제목 있는 윈도우");
		Thread t = new Thread(window);
		t.start();
	}

	@Override
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		while(true) {
			setTitle(sdf.format(System.currentTimeMillis()));
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	


}
