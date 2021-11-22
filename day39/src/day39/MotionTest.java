package day39;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MotionTest extends JPanel {
	static int x = 50;
	static int y = 50;

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setTitle("MotionTest");
		window.setBounds(100, 400, 600, 400);
		MotionTest graphic = new MotionTest();
		
		graphic.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				x = e.getX()-15;
				y = e.getY()-15;
				graphic.repaint();
			}
		});
		
		window.add(graphic);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(x, y, 30, 30);
	}

}












