package day37;

import java.awt.Color;
import java.awt.Container;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class FullScreen extends JFrame{
	public FullScreen() {
		this("���� ����");
	}
	public FullScreen(String title) {
		setTitle(title);
		Container con = this.getContentPane();
		con.setBackground(Color.pink);
		//���� �׷���ȯ���� ������
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice gd  = ge.getDefaultScreenDevice();
		//�������� �ʰڴ�.
		setUndecorated(true);
		gd.setFullScreenWindow(this);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new FullScreen();
	}
}
