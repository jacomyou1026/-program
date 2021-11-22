package day36;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class WindowTest {
	public static void main(String[] args) {
		Frame widow = new Frame();
		widow.setTitle("제목이 변경된 윈도우");
		widow.setBounds(1200,200,400,300);
		widow.setBackground(Color.orange);
		//색상은 0~255 3개로 표현한다 그러므로 모든 경우의 수를 곱한 값을 랜덤으로 적는다.
		widow.setBackground(new Color(new Random().nextInt(16_581_376)));
		
		widow.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				widow.dispose();
			}
		});
		widow.setVisible(true);
	}
}
