package day38;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.sun.java.swing.plaf.windows.resources.windows;

public class GraphicTest extends Panel{
	public static void main(String[] args) {
		Frame window = new Frame("GraphicTest");
		window.setBounds(700,50,500,600);
		window.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				window.dispose();
			}
		});
		GraphicTest graphic = new GraphicTest();
		window.add(graphic);
		window.setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		g.drawString("문자열 그리기", 100, 50);
		g.setColor(Color.red);
		g.drawLine(100, 100, 200, 200);
		g.setColor(Color.blue);
		g.drawOval(100, 100, 100, 100);
		g.setColor(Color.magenta);
		g.fillRect(250, 100, 100, 100);
		g.setColor(new Color(0,255,0,125));
		g.fillOval(300, 100, 100, 100);
	}
}
