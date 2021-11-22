package day36;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.DomainCombiner;
import java.util.Random;

public class WindowTest6 extends Frame{
	public WindowTest6() {
		this("제목 없는 윈도우");
	}
	public WindowTest6(String title) {
		
		setResizable(false);//창조절 안됨
		setTitle(title);
		setBounds(1200,200,400,300);
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dimen2 = getSize();
		int x = (dimen.width-dimen2.width)/2;
		int y  = (dimen.height-dimen2.height)/2;
		setLocation(x,y);
		setBackground(new Color(new Random().nextInt(165813576)));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new WindowTest6("윈도우");
	}
}
