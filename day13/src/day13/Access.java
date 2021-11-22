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
class Cloud{ // public 오류 : Main class에만 public 붙일 수 0
					//하나의 파일 안에 여러개의 class만들때  public을 붙일 때
	
	void function() {
		Access a =new Access();
		
	}
}