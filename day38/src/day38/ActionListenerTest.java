package day38;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.sun.tools.javac.launcher.Main;

public class ActionListenerTest extends JFrame implements ActionListener, Runnable {
	JButton button1 = new JButton("����");
	JButton button2 = new JButton("�Ͻ�����");
	JButton button3 = new JButton("�ʱ�ȭ");

	static ActionListenerTest window;
	long start, end;
	boolean flag = true;
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");

	public ActionListenerTest() {
		setTitle("StopWatch");
		setBounds(800, 100, 300, 400);

		GridLayout grid = new GridLayout(3, 1);
		setLayout(grid);

		add(button1);
		add(button2);
		add(button3);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

		button2.setEnabled(false);
		button3.setEnabled(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Thread thread = new Thread(window);
		switch (e.getActionCommand()) {
		case "����": case "�����":
			thread.start();
			flag = true;
			button1.setEnabled(false);
			button2.setEnabled(true);
			button3.setEnabled(true);
			break;
		case "�Ͻ�����":
			flag = false;
			button1.setEnabled(true);
			button2.setEnabled(false);
			button3.setEnabled(true);
			button1.setText("�����");
			break;
		case "�ʱ�ȭ":
			flag = false;
			start=0;
			button1.setEnabled(true);
			button2.setEnabled(false);
			button3.setEnabled(false);
		}

	}

	public static void main(String[] args) {
		window = new ActionListenerTest();
	}

	public void run() {
		if (start == 0) {
			start = System.currentTimeMillis();
			end = start;
		}
		while (true) {
			long time = end++ - start - 32400000;
			setTitle(sdf.format(time));
			if (!flag) {
				break;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
