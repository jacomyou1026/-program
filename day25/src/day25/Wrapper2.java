package day25;

public class Wrapper2 {
	public static void add(Object a,Object b) {
		//문자열로 바꿔준 후 열결 해주는 메서드
		System.out.println(""+a+b);
		System.out.println(String.valueOf(a)+String.valueOf(b));
	}
	public static void main(String[] args) {
		add(new Integer(12),new Integer(24));
		 Object[] arData = {
				 new Integer(10),
				 new Double(10.3),
				 new String("안녕")
		 };
		 System.out.println(arData[0]);
		 System.out.println(arData[1]);
		 System.out.println(arData[2]);
	}
}
