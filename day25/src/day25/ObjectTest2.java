package day25;

public class ObjectTest2 {
	int data1 =10;
	int data2 =20;
	int data3 =30;
	
	public ObjectTest2(int data1) {
		this.data1= data1;
	}
	
	@Override
	public String toString() {
		return ""+data1+data2+data3;
	}
	public static void main(String[] args) {
		ObjectTest2 o =new ObjectTest2(43);
		char[] word = {'안','녕'};
		String data = "안녕";
		data+="하세여";
		System.out.println(word);
		System.out.println(o);
		//객체명을 출력할 때 항상 뒤에 toString()이 생략된다.
	}
}
