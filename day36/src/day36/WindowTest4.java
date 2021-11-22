package day36;

import java.awt.Color;
import java.awt.Container;
import java.util.Random;

import javax.swing.JFrame;

public class WindowTest4 extends JFrame{
	public WindowTest4() {
		this("제목없는 윈도우");
	}
	
	public WindowTest4(String title) {
		Color []arColor = {
				Color.black,Color.BLUE,Color.red,Color.yellow,Color.green
		};
		
		setTitle(title);
		setBounds(1200,200,400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setBackground(arColor[new Random().nextInt(6)]);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowTest4("윈도우");
		
	}
	
}
