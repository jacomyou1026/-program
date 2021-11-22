package day37;

import java.awt.Color;
import java.awt.Container;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class FullScreen extends JFrame{
	public FullScreen() {
		this("제목 없음");
	}
	public FullScreen(String title) {
		setTitle(title);
		Container con = this.getContentPane();
		con.setBackground(Color.pink);
		//나의 그래픽환경을 갖다줌
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice gd  = ge.getDefaultScreenDevice();
		//데코하지 않겠다.
		setUndecorated(true);
		gd.setFullScreenWindow(this);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new FullScreen();
	}
}
