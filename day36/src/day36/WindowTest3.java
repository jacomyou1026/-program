package day36;


import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class WindowTest3 {
	public static void main(String[] args) {
		JFrame windows = new JFrame("제목있는 윈도우");
		windows.setBounds(1200,200,400,300);
		Container con = windows.getContentPane();
		con.setBackground(Color.black);
		windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windows.setVisible(true);
		
	}
}
