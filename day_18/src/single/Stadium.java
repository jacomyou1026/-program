package single;

import java.awt.Desktop;

import javax.print.attribute.standard.Destination;

public class Stadium {
	public static void main(String[] args) {
		//IronMan i =new I --�����ڰ� ����
		IronMan i = IronMan.getInstance(); //i�� ���ϳ����� �� ��ü
															//new�� ���� �ʾұ⿡ �� �ϳ�
								
		IronMan.fight(); //�ٸ� class�� ���� �Ұ��̱⿡
								//class�� ����  �����ؾ���.
		i.fight();
		i.walk();
	//	Destination d = Desktop.getDesktop();//signton pattern
	}
}
