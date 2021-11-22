package day37;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import sun.security.util.Cache.EqualByteArray;

public class GridLayoutTest extends Frame {
	Button[] arbutton = new Button[16];
	String[] number = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"};
	public GridLayoutTest() {
		setTitle("GridLayoutTest");
		setBounds(1200,200,400,400);
		setBackground(Color.gray);
		
		GridLayout grid = new GridLayout(4,4,7,7);
		setLayout(grid);
		
		//랜덤하게 바꾸기 숫자 번호(Enableed)
		for (int i = 0; i < 400; i++) {
			int r = new Random().nextInt(15)+1;//1~16
			String s =number[0];
			number[0]=number[r]  ;
			number[r] =s;
		}
		
		for (int i = 0; i < arbutton.length; i++) {
			arbutton[i] =new Button(number[i]);
			arbutton[i].setName(""+(i+1));
			arbutton[i].setFont(new Font("Dialog",Font.BOLD,20));
			add(arbutton[i]);
			
			//setName을 해주어야 getName가능
			if(arbutton[i].getName().equals("3")) {
				arbutton[i].setEnabled(false);
			}
			
			if(arbutton[i].getActionCommand().equals("16")){
				arbutton[i].setVisible(false);
			}
		}
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new GridLayoutTest();
	}
}
