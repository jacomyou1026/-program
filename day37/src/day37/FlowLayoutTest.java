package day37;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;

public class FlowLayoutTest extends Frame{
	Label label1 = new Label("Dog");
	Label label2 = new Label("Cat");
	Label label3 = new Label("송아지");
	JLabel label4 = new JLabel("코끼리");
	
	public FlowLayoutTest() {
		setTitle("FlowLayoutTest");
		setBounds(1200,300,300,400);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		
		// BoradLayout
		/*
		 * label1.setBackground(Color.pink); label1.setForeground(Color.red);
		 * label1.setAlignment(Label.RIGHT);
		 * 
		 * Dimension d1 = new Dimension(this.getWidth(),200);
		 * 
		 * Font font = new Font("Serif",Font.BOLD,30); label1.setFont(font);
		 * label1.setPreferredSize(d1); add(label1,BorderLayout.SOUTH);
		 * 
		 * label2.setBackground(Color.red); label2.setForeground(Color.green);
		 * label2.setAlignment(Label.CENTER); label2.setPreferredSize(d1);
		 * label2.setFont(new Font("Monospaced",Font.ITALIC,20));
		 * add(label2,BorderLayout.NORTH);
		 */
		label3.setBackground(Color.blue);
		label3.setForeground(Color.cyan);
		label3.setAlignment(Label.LEFT);
		label3.setFont(new Font("DialogInput",Font.PLAIN,40));
		add(label3);
		
		label4.setOpaque(true);;

		label4.setBackground(Color.black);
		label4.setForeground(Color.green);
		add(label4);
		label4.setPreferredSize(new Dimension(200,100));
		
		//텍스트 수평 정렬
		label4.setHorizontalAlignment(JLabel.CENTER);
		//텍스트 수직정렬
		label4.setVerticalAlignment(JLabel.TOP);
		//한글 가능
		label4.setFont(new Font("궁서체",Font.BOLD,40));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutTest();
	}

}
