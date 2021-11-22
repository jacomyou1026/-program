package single;

import java.awt.Desktop;

import javax.print.attribute.standard.Destination;

public class Stadium {
	public static void main(String[] args) {
		//IronMan i =new I --생성자가 없음
		IronMan i = IronMan.getInstance(); //i는 단하나뿐인 그 객체
															//new를 하지 않았기에 단 하나
								
		IronMan.fight(); //다른 class로 접근 불가이기에
								//class로 직접  접근해야함.
		i.fight();
		i.walk();
	//	Destination d = Desktop.getDesktop();//signton pattern
	}
}
