package day13;

public class Access {
	int data = 10;
	public int data2 =20;
	protected int data3=23;
	private int data4=12;
	
	
	public int getData4() {
		return data4;
	}


	public void setData4(int data4) {
		this.data4 = data4;
	}


	void f() {
		
	}
}
class Cloud{ // public ���� : Main class���� public ���� �� 0
					//�ϳ��� ���� �ȿ� �������� class���鶧  public�� ���� ��
	
	void function() {
		Access a =new Access();
		
	}
}