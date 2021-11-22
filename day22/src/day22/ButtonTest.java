package day22;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ButtonTest extends Frame{
	public ButtonTest() {
		super("익명 클래스 테스트");
		Button btn = new Button("눌러");
		add(btn);
		setSize(500,500);
		//익명클래스1
		addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.out.println("프레임 종료");
			System.exit(0);
			}
		});
		//익명클래스2
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println(e.getX());
				System.out.println(e.getY());
				System.out.println("버튼 눌렀어요!");
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonTest();
	}
}
