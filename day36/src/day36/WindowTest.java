package day36;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class WindowTest {
	public static void main(String[] args) {
		Frame widow = new Frame();
		widow.setTitle("������ ����� ������");
		widow.setBounds(1200,200,400,300);
		widow.setBackground(Color.orange);
		//������ 0~255 3���� ǥ���Ѵ� �׷��Ƿ� ��� ����� ���� ���� ���� �������� ���´�.
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
